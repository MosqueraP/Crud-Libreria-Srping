package com.service;

import com.medel.Libro;
import com.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibroServices{
    private ArrayList<Libro> librosLista = new ArrayList<>();

//    public ArrayList mostrarLibros(Libro){
//
//    }
//
//    public ArrayList agregarLibro(){
//
//    }

    // inyectamos LibroRepository
    @Autowired
    private LibroRepository libroRepository;

    // Traer todos los libros
    public List<Libro> getAllLibros(){
        return libroRepository.findAll();
    }

    // guardar un libro
    public Libro saveLibro(Libro libo) {
        return libroRepository.save(libo);
    }

    // liminar un libro
    public void deleteLibro(Long id) {
        libroRepository.deleteById(id);
    }

    // Métoodo personalizado para buscar un libro por su id
    public Libro findLibro(Long id) {
        Libro libro = libroRepository.findById(id).orElse(null);
        return libro;
    }
}
