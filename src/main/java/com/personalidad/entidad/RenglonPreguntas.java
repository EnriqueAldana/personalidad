package com.personalidad.entidad;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;




public class RenglonPreguntas {
	
	private String pregunta1;
	@Min(value=1)
	@Max(value=4)
	private int respuesta1=1;
	private String pregunta2;
	@Min(value=1)
	@Max(value=4)
	private int respuesta2=1;
	private String pregunta3;
	@Min(value=1)
	@Max(value=4)
	private int respuesta3=1;
	private String pregunta4;
	@Min(value=1)
	@Max(value=4)
	private int respuesta4=1;
	
	public RenglonPreguntas() {
		
	}
	/**
	 * @param pregunta1
	 * @param respuesta1
	 * @param pregunta2
	 * @param respuesta2
	 * @param pregunta3
	 * @param respuesta3
	 * @param pregunta4
	 * @param respuesta4
	 */
	public RenglonPreguntas(String pregunta1, int respuesta1, String pregunta2, int respuesta2, String pregunta3,
			int respuesta3, String pregunta4, int respuesta4) {
		this.pregunta1 = pregunta1;
		this.respuesta1 = respuesta1;
		this.pregunta2 = pregunta2;
		this.respuesta2 = respuesta2;
		this.pregunta3 = pregunta3;
		this.respuesta3 = respuesta3;
		this.pregunta4 = pregunta4;
		this.respuesta4 = respuesta4;
	}
	public String getPregunta1() {
		return pregunta1;
	}
	public void setPregunta1(String pregunta1) {
		this.pregunta1 = pregunta1;
	}
	public int getRespuesta1() {
		return respuesta1;
	}
	public void setRespuesta1(int respuesta1) {
		this.respuesta1 = respuesta1;
	}
	public String getPregunta2() {
		return pregunta2;
	}
	public void setPregunta2(String pregunta2) {
		this.pregunta2 = pregunta2;
	}
	public int getRespuesta2() {
		return respuesta2;
	}
	public void setRespuesta2(int respuesta2) {
		this.respuesta2 = respuesta2;
	}
	public String getPregunta3() {
		return pregunta3;
	}
	public void setPregunta3(String pregunta3) {
		this.pregunta3 = pregunta3;
	}
	public int getRespuesta3() {
		return respuesta3;
	}
	public void setRespuesta3(int respuesta3) {
		this.respuesta3 = respuesta3;
	}
	public String getPregunta4() {
		return pregunta4;
	}
	public void setPregunta4(String pregunta4) {
		this.pregunta4 = pregunta4;
	}
	public int getRespuesta4() {
		return respuesta4;
	}
	public void setRespuesta4(int respuesta4) {
		this.respuesta4 = respuesta4;
	}
	
	

}
