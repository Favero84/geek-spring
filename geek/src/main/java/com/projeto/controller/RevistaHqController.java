package com.projeto.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.projeto.model.RevistaHq;
import com.projeto.repository.RevistaHqRepository;

@Controller
public class RevistaHqController {
	
	@Autowired
	private RevistaHqRepository revistaHqRepository;
	
	@RequestMapping(method = RequestMethod.GET, value = "/cadastrorevistahq")
	public ModelAndView inicio() {
		ModelAndView modelAndView = new ModelAndView("cadastro/cadastrorevistahq");
		modelAndView.addObject("revistahqobj", new RevistaHq());
		return modelAndView;
	}
	
	@RequestMapping(method = RequestMethod.POST, value= "**/salvarrevistahq")
	public ModelAndView salvar(RevistaHq revista) {
		revistaHqRepository.save(revista);
		
		ModelAndView modelAndView = new ModelAndView("cadastro/cadastrorevistahq");
		Iterable<RevistaHq> revistasIt = revistaHqRepository.findAll();
		modelAndView.addObject("revistas", revistasIt);
		modelAndView.addObject("revistahqobj", new RevistaHq());
		
		return modelAndView;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/listarevistas")
	public ModelAndView revistas() {
		ModelAndView modelAndView = new ModelAndView("cadastro/cadastrorevistahq");
		Iterable<RevistaHq> revistasIt = revistaHqRepository.findAll();
		modelAndView.addObject("revistas", revistasIt);
		modelAndView.addObject("revistahqobj", new RevistaHq());
		return modelAndView;
	}
	
	@GetMapping("/editarrevista/{idrevista}")
	public ModelAndView editar(@PathVariable("idrevista") Long idrevista) {
		
		Optional<RevistaHq> revistaHq = revistaHqRepository.findById(idrevista);
		
		ModelAndView modelAndView = new ModelAndView("cadastro/cadastrorevistahq");
		modelAndView.addObject("revistahqobj", revistaHq.get());
		return modelAndView;
	}
	
	@GetMapping("/removerrevista/{idrevista}")
	public ModelAndView excluir(@PathVariable("idrevista") Long idrevista) {
		
		revistaHqRepository.deleteById(idrevista);
		
		ModelAndView modelAndView = new ModelAndView("cadastro/cadastrorevistahq");
		modelAndView.addObject("revistas", revistaHqRepository.findAll());
		modelAndView.addObject("revistahqobj", new RevistaHq());
		return modelAndView;
	}
}
