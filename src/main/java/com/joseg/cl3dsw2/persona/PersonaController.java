package com.joseg.cl3dsw2.persona;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("personas")
@AllArgsConstructor
@Validated
public class PersonaController {

    PersonaRepository personaRepository;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Persona> obtenerPorId(@PathVariable Long id){
        return ResponseEntity.of(personaRepository.findById(id));
    }

    @GetMapping("/obtenerPDni")
    public ResponseEntity<Persona> obtenerPorDni(@RequestParam String dni){
        return ResponseEntity.ok(personaRepository.findPersonaByDni(dni).orElse(new Persona()));
    }



    @GetMapping("/sinPag")
    @ResponseStatus(HttpStatus.OK)
    public List<Persona> listarSinPaginacion() {
        return personaRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Persona registrar(@RequestBody @Valid PersonaInsertCommand personaInsertCommand) {
        return personaRepository.save(PersonaMapper.mapFromCommandInsertToEntity(personaInsertCommand));
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<String> borrar(@PathVariable Long id) {
        personaRepository.deleteById(id);
        return ResponseEntity.ok("Se eliminó con exito");
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Page<PersonaResumen> listar(Pageable pageable) {
        return personaRepository.findAll(pageable).map(PersonaMapper::mapFromEntityToResumen);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Persona actualizar(@PathVariable Long id, @RequestBody PersonaUpdateCommand personaUpdateCommand) {
        Persona persona = PersonaMapper.mapFromCommandUpdateToEntity(personaUpdateCommand, personaRepository.findById(id).orElse(new Persona()));
        return personaRepository.save(persona);
    }


}
