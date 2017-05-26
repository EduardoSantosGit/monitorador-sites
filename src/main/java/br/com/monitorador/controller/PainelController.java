package br.com.monitorador.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("painel")
public class PainelController {
	
	@RequestMapping
	public ModelAndView abrePainel(){
		return new ModelAndView("Monitorador.Painel");
	}
	
	

}
