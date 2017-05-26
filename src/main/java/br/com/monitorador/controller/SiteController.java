package br.com.monitorador.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.com.monitorador.vo.SiteVO;

@Controller
@RequestMapping("site")
public class SiteController {
	
	
	
	@RequestMapping
	public ModelAndView index(){
		return new ModelAndView("Monitorador.Site");
	}
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.POST,consumes="application/json;charset=utf-8")
	public ResponseEntity<String> cadastraSite(@RequestBody SiteVO siteVO){
		
		
		
		return new ResponseEntity<String>(HttpStatus.OK);
	}

}
