package com.personalidad.entidad;

import java.util.ArrayList;
import java.util.List;

public class RenglonPreguntasDTO {
	
	private List<RenglonPreguntas> preguntas= new ArrayList<RenglonPreguntas>();
	
	public void addPregunta(RenglonPreguntas pregunta) {
		this.preguntas.add(pregunta);
	}

	public RenglonPreguntasDTO(){
		
	}

	/**
	 * @param preguntas
	 */
	public RenglonPreguntasDTO(List<RenglonPreguntas> preguntas) {
		this.preguntas = preguntas;
	}

	public List<RenglonPreguntas> getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(List<RenglonPreguntas> preguntas) {
		this.preguntas = preguntas;
	}
	
	
}
