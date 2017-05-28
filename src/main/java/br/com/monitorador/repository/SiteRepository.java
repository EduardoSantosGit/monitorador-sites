package br.com.monitorador.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.monitorador.entity.Site;

@org.springframework.stereotype.Repository
public interface SiteRepository extends CrudRepository<Site, Long>{

}
