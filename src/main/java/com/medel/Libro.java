package com.medel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "libros")
public class Libro {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) // pasamos los campos nosotros
    private Long id;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "autor")
    private String autor;

    // restricciones útiles
    //@Column(name = "titulo", nullable = false, unique = true, length = 100 )

    // constructor importaados arribas



}
