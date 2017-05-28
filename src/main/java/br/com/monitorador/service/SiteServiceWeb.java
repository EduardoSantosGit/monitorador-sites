package br.com.monitorador.service;

import org.springframework.stereotype.Component;

import br.com.monitorador.entity.Site;
import br.com.monitorador.vo.StatusServicoSiteVO;

@Component
public interface SiteServiceWeb {

	StatusServicoSiteVO executaPing(Site site);
	
}
