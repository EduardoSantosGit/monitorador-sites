package br.com.monitorador.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Site {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nmeSite;
	private String urlSite;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
        name = "Site_Servico",
        joinColumns = {@JoinColumn(name = "site_id", referencedColumnName = "id")},
        inverseJoinColumns = {@JoinColumn(name = "servico_id", referencedColumnName = "id")}
    )
	private List<Servico> servicos;

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
	public List<Servico> getServicos() {
		return servicos;
	}
	public void setServicos(List<Servico> servico) {
		this.servicos = servico;
	}
	
	
	

}
