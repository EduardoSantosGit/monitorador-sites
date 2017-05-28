package br.com.monitorador.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Site {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nmeSite;
	private String urlSite;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Servico> servico;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNmeSite() {
		return nmeSite;
	}
	public void setNmeSite(String nmeSite) {
		this.nmeSite = nmeSite;
	}
	public String getUrlSite() {
		return urlSite;
	}
	public void setUrlSite(String urlSite) {
		this.urlSite = urlSite;
	}
	public List<Servico> getServico() {
		return servico;
	}
	public void setServico(List<Servico> servico) {
		this.servico = servico;
	}
	
	
	

}
