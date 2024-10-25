package com.example.weeklist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class WeeklistApplication {
	private static List<String> dias;
	
	public static List<String> createDaysWeek(){
		dias = new ArrayList<>();
		dias.add("Lunes");
		dias.add("Martes");
		dias.add("Miercoles");
		dias.add("Jueves");
		dias.add("Viernes");
		dias.add("Sabado");
		dias.add("Domingo");

		return  dias;
	}

	public static List<String> getDaysWeek(){
		return createDaysWeek();
	}

	public static int getSizeWeek(){
		return createDaysWeek().size();
	}
	
	/*public static boolean deleteDay(String dia) {
		return crearDiasSemana().remove(dia);
    }

	public static String getDay(String dia){
		if(crearDiasSemana().contains(dia)){
			return dia;
		}else{
			return "dia no encontrado";
		}
	} */


	public static void main(String[] args) {
		
	}

}
