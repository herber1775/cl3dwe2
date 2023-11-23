package com.cl3villegasdsw.persona;

public class PersonaMapper {

    public static PersonResumen mapperEntity(Persona person){
    	PersonResumen personresumen = new PersonResumen();
        personresumen.setApellido(person.getApellido());
        personresumen.setNombre(person.getNombre());
        personresumen.setDni(person.getDni());
        personresumen.setFechaNacimiento(person.getFechaNacimiento());
        personresumen.setEmail(person.getEmail());
        personresumen.setDireccion(person.getDireccion());
        
        return personresumen;
    }
    
    public static Persona mapperInsertToEntity(PersoInserDto perInsertdto){
        Persona personamaper = new Persona();
        personamaper.setNombre(perInsertdto.getNombre());
        personamaper.setDireccion(perInsertdto.getDireccion());
        personamaper.setApellido(perInsertdto.getApellido());
        personamaper.setDni(perInsertdto.getDni());
        personamaper.setFechaNacimiento(perInsertdto.getFechaNacimiento());
        personamaper.setEmail(perInsertdto.getEmail());
        return personamaper;
    }

    public static Persona mapperUpdateToEntity(PersoUpdateDto persoUpdateDto,Persona personaMapper){
    	personaMapper.setNombre(persoUpdateDto.getNombre());
    	personaMapper.setDireccion(persoUpdateDto.getDireccion());
    	personaMapper.setDni(persoUpdateDto.getDni());
    	personaMapper.setApellido(persoUpdateDto.getApellido());
    	personaMapper.setFechaNacimiento(persoUpdateDto.getFechaNacimiento());
    	personaMapper.setEmail(persoUpdateDto.getEmail());
        return personaMapper;
    }



}
