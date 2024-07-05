package com.controller;

import com.medel.Libro;
import com.service.LibroServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibroController {
    // inyección de dependencias @Autowired -> java / @Inject -> usado en otros lenguajes

    // inyectamos una instancia de la clase LibroServices aquí para usar sus métodos.
    @Autowired
    private LibroServices libroService;

    @GetMapping("/todos")
    public List<Libro> getTodos () {
        return libroService.getAllLibros();
    }

    @PostMapping("/agregar")
    public Libro AgregarLibro (@RequestBody Libro libro) {
        return libroService.saveLibro(libro);
    }

    @DeleteMapping("/{id}")
    public void eliminarLibro(@PathVariable Long id){
        libroService.deleteLibro(id);
    }

}
