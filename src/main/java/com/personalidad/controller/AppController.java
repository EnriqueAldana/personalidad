package com.personalidad.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.personalidad.entidad.PreguntaBO;
import com.personalidad.entidad.PreguntaVO;
import com.personalidad.entidad.Preguntas;
import com.personalidad.entidad.PreguntasCalificacion;
import com.personalidad.entidad.RenglonPreguntas;
import com.personalidad.entidad.RenglonPreguntasDTO;
import com.personalidad.persistencia.PreguntasEnArreglo;
import com.personalidad.service.PreguntaService;
import com.personalidad.service.RenglonPreguntasService;

@Controller
public class AppController {

	@Autowired
	PreguntaService preguntaService;
	
	@Autowired
	RenglonPreguntasService renglonPreguntasService;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		
		model.addAttribute("form",renglonPreguntasService.cargaPreguntas());
	
		return "prueba";
	}
	
	@PostMapping("/calificar")
	public String calificarPreguntas(@Valid @ModelAttribute  RenglonPreguntasDTO forma, BindingResult result, RedirectAttributes redir) {
		
	
		
		// Aqui se puede mandar a guardar el resultado
		redir.addFlashAttribute("calificacion",renglonPreguntasService.calificar(forma));
		return "redirect:/resultadoPrueba";
	}

	
	
	@RequestMapping("/resultadoPrueba")
	public String resultadoPrueba(Model model) {
		
		
		//model.addAttribute("preguntaObj",pregunta);
		return "resultado";
	}
	
	
	
	@RequestMapping("/resultado")
	public ModelAndView resultado(Model model) {
		
		ModelAndView mav= new ModelAndView("resultado");
		
		
		return mav;
	}
	
	@RequestMapping("/listaPreguntas")
	public String viewListaPreguntas(Model model) {
		List<Preguntas> listaPreguntas = preguntaService.listAll();
		for(int x=0; x < listaPreguntas.size(); x++) {
			System.out.println( listaPreguntas.get(x).getPregunta());
		}
		model.addAttribute("listaPreguntas", listaPreguntas);
		return "index";
	}
	@RequestMapping("/nueva")
	public String nuevaPregunta(Model model) {
		
		Preguntas pregunta = new Preguntas();
		model.addAttribute("preguntaObj",pregunta);
		return "nuevaPregunta";
	}
	@RequestMapping("/editar/{id}")
	public ModelAndView editarPregunta(@PathVariable(name = "id") int id) {
		
		ModelAndView mav= new ModelAndView("editar_pregunta");
		Preguntas pregunta = preguntaService.getPreguntas(id);
		mav.addObject("preguntaObj", pregunta);
		return mav;
	}
	@RequestMapping("/borrar/{id}")
	public String borrarPregunta(@PathVariable(name = "id") int id) {
		preguntaService.delete(id);
		return "redirect:/listaPreguntas";
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public String save(@ModelAttribute("preguntaObj") Preguntas pregunta) {
		
		preguntaService.save(pregunta);
		return "redirect:/listaPreguntas";
	}
	
	
	
}
