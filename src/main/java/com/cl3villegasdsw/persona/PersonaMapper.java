package com.cl3villegasdsw.persona;

public class PersonaMapper {

    public static Persona mapFromCommandInsertToEntity(PersoInserDto perInsertdto){

        Persona personamaper = new Persona();
        personamaper.setNombre(perInsertdto.getNombre());
        personamaper.setApellido(perInsertdto.getApellido());
        personamaper.setDni(perInsertdto.getDni());
        personamaper.setDireccion(perInsertdto.getDireccion());
        personamaper.setFechaNacimiento(perInsertdto.getFechaNacimiento());
        personamaper.setEmail(perInsertdto.getEmail());
        return personamaper;
    }

    public static Persona mapFromCommandUpdateToEntity(PersoUpdateDto persoUpdateDto,Persona personaMapper){

    	personaMapper.setNombre(persoUpdateDto.getNombre());
    	personaMapper.setDni(persoUpdateDto.getDni());
    	personaMapper.setApellido(persoUpdateDto.getApellido());
    	personaMapper.setDireccion(persoUpdateDto.getDireccion());
    	personaMapper.setFechaNacimiento(persoUpdateDto.getFechaNacimiento());
    	personaMapper.setEmail(persoUpdateDto.getEmail());
        return personaMapper;
    }

    public static PersonaResumen mapperEntity(Persona person){

        PersonaResumen personresumen = new PersonaResumen();
        personresumen.setNombre(person.getNombre());
        personresumen.setApellido(person.getApellido());
        personresumen.setDni(person.getDni());
        return personresumen;
    }

}
