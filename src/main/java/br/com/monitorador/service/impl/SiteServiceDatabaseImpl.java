package br.com.monitorador.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.monitorador.entity.Site;
import br.com.monitorador.repository.SiteRepository;
import br.com.monitorador.service.SiteServiceDatabase;

@Service
public class SiteServiceDatabaseImpl implements SiteServiceDatabase{
	
	@Autowired
	private SiteRepository siteRepository;
	
	@Override
	@Transactional
	public void salvaSiteMysql(Site site) {
		
		siteRepository.save(site);
		
	}

}
