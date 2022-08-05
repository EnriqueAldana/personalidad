package com.personalidad.entidad;

/*import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;*/

//@Entity
public class Preguntas {

	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idpreguntas;
	private String pregunta;

	public Preguntas() {
	}

	public Long getIdpreguntas() {
		return idpreguntas;
	}

	public void setIdpreguntas(Long idpreguntas) {
		this.idpreguntas = idpreguntas;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	
	
}
