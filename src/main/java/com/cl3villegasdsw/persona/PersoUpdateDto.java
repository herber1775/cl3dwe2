package com.cl3villegasdsw.persona;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PersoUpdateDto {

    private Long id; //PersoUpdateDto PersonaUpdateCommand
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate fechaNacimiento;
    private String email;

}