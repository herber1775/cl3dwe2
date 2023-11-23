package com.cl3villegasdsw.persona;



public class PersonaMapper {

    public static Persona mapFromCommandInsertToEntity(PersonaInsertCommand personaInsertCommand){

        Persona persona = new Persona();
        persona.setNombre(personaInsertCommand.getNombre());
        persona.setApellido(personaInsertCommand.getApellido());
        persona.setDni(personaInsertCommand.getDni());
        persona.setDireccion(personaInsertCommand.getDireccion());
        persona.setFechaNacimiento(personaInsertCommand.getFechaNacimiento());
        persona.setEmail(personaInsertCommand.getEmail());
        return persona;
    }

    public static Persona mapFromCommandUpdateToEntity(PersonaUpdateCommand personaUpdateCommand,Persona persona){

        persona.setNombre(personaUpdateCommand.getNombre());
        persona.setDni(personaUpdateCommand.getDni());
        persona.setApellido(personaUpdateCommand.getApellido());
        persona.setDireccion(personaUpdateCommand.getDireccion());
        persona.setFechaNacimiento(personaUpdateCommand.getFechaNacimiento());
        persona.setEmail(personaUpdateCommand.getEmail());
        return persona;
    }

    public static PersonaResumen mapFromEntityToResumen(Persona persona){

        PersonaResumen personaResumen = new PersonaResumen();
        personaResumen.setNombre(persona.getNombre());
        personaResumen.setApellido(persona.getApellido());
        personaResumen.setDni(persona.getDni());
        return personaResumen;
    }

}
