package br.com.monitorador.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StatusServicoSiteVO {

	private String statusPing;
	
	public StatusServicoSiteVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StatusServicoSiteVO(String statusPing) {
		super();
		this.statusPing = statusPing;
	}

	public String getStatusPing() {
		return statusPing;
	}

	public void setStatusPing(String statusPing) {
		this.statusPing = statusPing;
	}

	
}
