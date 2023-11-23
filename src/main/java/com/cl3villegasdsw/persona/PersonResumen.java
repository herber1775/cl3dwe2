package com.cl3villegasdsw.persona;
import java.time.LocalDate;

import lombok.Data;
@Data
public class PersonResumen {
    private String nombre;
    private String dni;
    private String apellido;
    private String direccion;
    private LocalDate fechaNacimiento;
    private String email;

    
    //para el resumen del json   PersonaResumen
}
