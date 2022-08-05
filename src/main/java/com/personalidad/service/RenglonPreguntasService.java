package com.personalidad.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personalidad.entidad.RenglonPreguntas;
import com.personalidad.entidad.RenglonPreguntasDTO;
import com.personalidad.persistencia.PreguntasEnArreglo;

@Service
public class RenglonPreguntasService {

	@Autowired
	 UtileriaService utileriaService;
	
	
	public RenglonPreguntasService() {
	
	}
	
	public  RenglonPreguntasDTO  cargaPreguntas() {
		RenglonPreguntasDTO preguntasForma= new RenglonPreguntasDTO();
		for(int i = 0 ; i< PreguntasEnArreglo.quest.length; i++) {
			RenglonPreguntas renglonPreguntas = new RenglonPreguntas();
			for(int j=0 ; j < PreguntasEnArreglo.quest[i].length; j++) {
				
				if(j==0) {
					renglonPreguntas.setPregunta1(PreguntasEnArreglo.quest[i][j][0].toString());
				}else if (j==1) {
					renglonPreguntas.setPregunta2(PreguntasEnArreglo.quest[i][j][0].toString());
				}else if (j==2) {
					renglonPreguntas.setPregunta3(PreguntasEnArreglo.quest[i][j][0].toString());
				}else {
					renglonPreguntas.setPregunta4(PreguntasEnArreglo.quest[i][j][0].toString());
				}
				
				
			}
			preguntasForma.addPregunta(renglonPreguntas);
		}
		
		return preguntasForma;
	}
	
	public  String calificar(RenglonPreguntasDTO forma) {
		// aqui tomar la lista de preguntas calificadas
				int calificacion1= 0;
				int calificacion2= 0;
				int calificacion3= 0;
				int calificacion4= 0;
				
				for(int x=0; x < forma.getPreguntas().size(); x++) {
					System.out.println("Pregunta " + forma.getPreguntas().get(x).getPregunta1() + "Calificacion: " +forma.getPreguntas().get(x).getRespuesta1());
					System.out.println("Pregunta " + forma.getPreguntas().get(x).getPregunta2() + "Calificacion: " +forma.getPreguntas().get(x).getRespuesta2());
					System.out.println("Pregunta " + forma.getPreguntas().get(x).getPregunta3() + "Calificacion: " +forma.getPreguntas().get(x).getRespuesta3());
					System.out.println("Pregunta " + forma.getPreguntas().get(x).getPregunta4() + "Calificacion: " +forma.getPreguntas().get(x).getRespuesta4());
					calificacion1=calificacion1+forma.getPreguntas().get(x).getRespuesta1();
					calificacion2=calificacion2+forma.getPreguntas().get(x).getRespuesta2();
					calificacion3=calificacion3+forma.getPreguntas().get(x).getRespuesta3();
					calificacion4=calificacion4+forma.getPreguntas().get(x).getRespuesta4();	
				
				}
				
				// Ordenar calificaciones del mayor al menor
				ArrayList<Integer> listaCalificaciones= new ArrayList<Integer>();
				listaCalificaciones.add(calificacion1);
				listaCalificaciones.add(calificacion2);
				listaCalificaciones.add(calificacion3);
				listaCalificaciones.add(calificacion4);
				System.out.println("Puntaje calificacion columna 1 " + calificacion1);
				System.out.println("Puntaje calificacion columna 2 " + calificacion2);
				System.out.println("Puntaje calificacion columna 3 " + calificacion3);
				System.out.println("Puntaje calificacion columna 4 " + calificacion4);
				int maxCalificacion = utileriaService.getIndexOfMax(listaCalificaciones);
				System.out.println("Columna ganadora " + maxCalificacion);
				String tituloCalifcacion ="";
				if(maxCalificacion == 0) {
					tituloCalifcacion="Leon";
				}else if(maxCalificacion == 1) {
					tituloCalifcacion="Pantera";
				}else if(maxCalificacion == 2) {
					tituloCalifcacion="Morza";
				}else if(maxCalificacion == 3){
					tituloCalifcacion="Gato";
				}else {
					tituloCalifcacion="No definido";
				}
				// Fijar la calificacion en funcion de la calificacion ganadora
				return tituloCalifcacion;
				
	}
}
