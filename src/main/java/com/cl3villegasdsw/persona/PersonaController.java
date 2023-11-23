package com.cl3villegasdsw.persona;

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

    @GetMapping("/sinPag")
    @ResponseStatus(HttpStatus.OK)
    public List<Persona> listarSinPaginacion() {
        return personaRepository.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Persona> obtenerPorId
    (@PathVariable Long id)
    {
        return ResponseEntity.of(personaRepository.findById(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Persona registrar(@RequestBody @Valid PersoInserDto persoInserDto)
    {
        return personaRepository.save(PersonaMapper.mapperInsertToEntity(persoInserDto));
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<String> borrar(@PathVariable Long id)
    {
        personaRepository.deleteById(id);
        return ResponseEntity.ok("Se eliminó con exito");
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Page<PersonResumen> listar(Pageable pageable)
    {
        return personaRepository.findAll(pageable).map(PersonaMapper::mapperEntity);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Persona actualizar(@PathVariable Long id, @RequestBody PersoUpdateDto persoUpdateDto)
    {
        Persona persona = PersonaMapper.mapperUpdateToEntity(persoUpdateDto, personaRepository.findById(id).orElse(new Persona()));
        return personaRepository.save(persona);
    }
    
    @GetMapping("/obtenerPDni")
    public ResponseEntity<Persona> obtenerPorDni(@RequestParam String dni)
    {
        return ResponseEntity.ok(personaRepository.findPersonaByDni(dni).orElse(new Persona()));
    }



}
