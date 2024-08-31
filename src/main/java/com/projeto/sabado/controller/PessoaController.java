package com.projeto.sabado.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.projeto.sabado.models.Pessoa;
import com.projeto.sabado.repo.PessoaRepository;

@Controller
public class PessoaController {

	@Autowired
	private PessoaRepository pessoaRepository;

	@GetMapping("/inicio")
	public String home() {
		return "index";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("user", new Pessoa());
		return "register";
	}

	@PostMapping("/save")
	public String salvar(@RequestParam("nome") String nome, @RequestParam("cpf") String cpf,
			@RequestParam("dataNascimento") String dataNascimento, @RequestParam("email") String email,
			@RequestParam("senha") String senha) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoa.setCpf(cpf);
		pessoa.setDataNascimento(Date.valueOf(dataNascimento));
		pessoa.setEmail(email);
		pessoa.setSenha(senha);
		
		pessoaRepository.save(pessoa);
		
		return "redirect:login";
	}

}
