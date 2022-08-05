package com.personalidad.entidad;

public class PreguntaVO {

	private String pregunta;
	private Integer respuesta;
	
	
	public PreguntaVO(){
		
	}


	/**
	 * @param pregunta
	 * @param respuesta
	 */
	public PreguntaVO(String pregunta, Integer respuesta) {
		this.pregunta = pregunta;
		this.respuesta = respuesta;
	}


	public String getPregunta() {
		return pregunta;
	}


	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}


	public Integer getRespuesta() {
		return respuesta;
	}


	public void setRespuesta(Integer respuesta) {
		this.respuesta = respuesta;
	}
	
	
}
