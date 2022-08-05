package com.personalidad.entidad;

public class PreguntaBO {
	
	private Long id;
	private String pregunta;
	private Integer respuesta;
	
	public PreguntaBO() {
		
	}
	/**
	 * @param id
	 * @param pregunta
	 * @param respuesta
	 */
	public PreguntaBO(Long id, String pregunta, Integer respuesta) {
		this.id = id;
		this.pregunta = pregunta;
		this.respuesta = respuesta;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
