package com.cl3villegasdsw.persona;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.time.LocalDate;

@Data
public class PersoUpdateDto {
    private Long id;
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate fechaNacimiento;
    private String email;

}
