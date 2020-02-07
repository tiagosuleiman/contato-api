package com.suleiman.contato.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suleiman.contato.model.Contato;

public interface Contatos extends JpaRepository<Contato, Long> {

}
