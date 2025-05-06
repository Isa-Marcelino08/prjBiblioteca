package com.kusmitsch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kusmitsch.entities.Livro;

public interface LivroRepositorio extends JpaRepository<Livro, Long> {

}
