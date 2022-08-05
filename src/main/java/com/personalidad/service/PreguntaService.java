package com.personalidad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import com.personalidad.entidad.Preguntas;
import com.personalidad.persistencia.PreguntasRepository;

@Service
//@Transactional
public class PreguntaService {
	
	//@Autowired
	//private PreguntasRepository repositorio;
	
	public List<Preguntas> listAll(){
		
		return null;
				//repositorio.findAll();	
	}
	
	public void save(Preguntas preguntas) {
		//repositorio.saveAndFlush(preguntas);
	}
	
	public Preguntas getPreguntas(long id) {
		
	 return null;
			 //repositorio.getById(id);	
	}
	
	public void delete(long id) {
		//repositorio.deleteById(id);
	}
	

}
