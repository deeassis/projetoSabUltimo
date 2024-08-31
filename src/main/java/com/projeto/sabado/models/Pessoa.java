package com.projeto.sabado.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Pessoa {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String cpf;
	private Date dataNascimento;
	private String email;
	private String senha;
	
	
}
