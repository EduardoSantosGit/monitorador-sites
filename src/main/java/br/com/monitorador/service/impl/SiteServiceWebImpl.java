package br.com.monitorador.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.monitorador.entity.Site;
import br.com.monitorador.service.SiteServiceWeb;
import br.com.monitorador.vo.StatusServicoSiteVO;

@Service
public class SiteServiceWebImpl implements SiteServiceWeb{
	
	@Override
	public StatusServicoSiteVO executaPing(Site site) {		
		String host = site.getUrlSite();
		
		RestTemplate restTemplate = new RestTemplate();
		StatusServicoSiteVO status = 
				restTemplate.getForObject("http://127.0.0.1:8580/servicoweb/ping/" + host, 
						StatusServicoSiteVO.class);	
		return status;
	}
	
}
