package br.com.monitorador.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.com.monitorador.entity.Site;

@Component
public interface SiteServiceDatabase {
	
	void salvaSiteMysql(Site site);

}
