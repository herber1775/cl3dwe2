package com.joseg.cl3dsw2.persona;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "tbpersona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotBlank
    @Pattern(regexp="[\\d]{7}")
    private String dni;
    @NotBlank
    private String direccion;
    @Past @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate fechaNacimiento;
    @Email
    private String email;
}
