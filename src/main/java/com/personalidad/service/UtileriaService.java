package com.personalidad.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class UtileriaService {

	
	public UtileriaService() {
		
	}
	
	public  int getIndexOfMax(ArrayList<Integer> arr){
	    int MaxVal = -1;
	    int indexOfMax = -1; //regresa -1 si todos los elementos son iguales
	    int allEquals = 0;
	    for (int i = 0; i < arr.size(); i++) {
	    	// verificar ai aon iguLES
	    	allEquals= allEquals + arr.get(i);
	        //Si el actual es mayor que  MaxVal
	        if(arr.get(i) > MaxVal ){
	            MaxVal = arr.get(i); // asignar MaxVal
	            indexOfMax = i; // tomar la posicion del valor Max
	           
	        }
	    }
	    int promedio= allEquals/arr.size();
	    if(promedio ==MaxVal ) {
	    	indexOfMax = -1;   // No hay mayor por que todos son iguales
	    }
	    return indexOfMax;  
	}
}
