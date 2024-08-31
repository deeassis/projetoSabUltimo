package com.projeto.sabado.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.sabado.models.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
