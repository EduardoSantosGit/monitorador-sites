package br.com.monitorador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import br.com.monitorador.entity.Site;
import br.com.monitorador.service.SiteServiceDatabase;
import br.com.monitorador.vo.SiteVO;

@Controller
@RequestMapping("site")
public class SiteController {
	
	@Autowired
	private SiteServiceDatabase siteServiceDatabase;
	
	@RequestMapping
	public ModelAndView index(){
		return new ModelAndView("Monitorador.Site");
	}
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.POST,consumes="application/json;charset=utf-8")
	public ResponseEntity<String> cadastraSite(@RequestBody SiteVO siteVO){
		
		Site site = new Site();
		site.setNmeSite(siteVO.getNmeSite());
		site.setUrlSite(siteVO.getUrlSite());
		
		//RestTemplate restTemplate = new RestTemplate();
		//String teste = restTemplate.getForObject("http://127.0.0.1:8580/servicoweb/ping/www.google.com", String.class);
		
		//System.out.println(teste);
		
		siteServiceDatabase.salvaSiteMysql(site);
		
		return new ResponseEntity<String>(HttpStatus.OK);
	}

}
