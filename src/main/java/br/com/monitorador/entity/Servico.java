package br.com.monitorador.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.monitorador.enums.StatusServico;

@Entity
public class Servico {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@Enumerated(EnumType.STRING)
	private StatusServico statusServico;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public StatusServico getStatusServico() {
		return statusServico;
	}

	public void setStatusServico(StatusServico statusServico) {
		this.statusServico = statusServico;
	}
	
	

}
