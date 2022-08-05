package com.personalidad.entidad;

import java.util.ArrayList;
import java.util.List;

public class PreguntasCalificacion {
	
	private List<PreguntaBO> preguntas= new ArrayList<PreguntaBO>();
	List<List<PreguntaVO>> matrizPreguntas= new ArrayList<>();
	
	private String calificacion="SINCALIFICAR";
	public PreguntasCalificacion(){
		
	}
	
	public void addPregunta(PreguntaBO pregunta) {
		this.preguntas.add(pregunta);
	}

	public List<PreguntaBO> getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(List<PreguntaBO> preguntas) {
		this.preguntas = preguntas;
	}

	public String getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}

	public List<List<PreguntaVO>> getMatrizPreguntas() {
		return matrizPreguntas;
	}

	public void setMatrizPreguntas(List<List<PreguntaVO>> matrizPreguntas) {
		this.matrizPreguntas = matrizPreguntas;
	}
	
	
}
