package com.example.weeklist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class Weeklist {
	private static List<String> days;
	
	public List<String> daysWeek(){
		days = new ArrayList<>();
		days.add("Lunes");
		days.add("Martes");
		days.add("Miercoles");
		days.add("Jueves");
		days.add("Viernes");
		days.add("Sabado");
		days.add("Domingo");

		return  days;
	}

	public static List<String> getDaysWeek(){
		return days;
	}

	public static int getSizeWeek(){
		return days.size();
	}
	
	public static boolean deleteDay(String dia) {
		return days.remove(dia);
    }

	public static String getDay(String dia){
		if(days.contains(dia)){
			return dia;
		}else{
			return null;
		}
	}

	public static boolean dayExist(String day){
		if (days.contains(day)) {
			return true;
		}else{
			return false;
		}
	}

	public static void daysWeekSort(){
		Collections.sort(days);
	}

	public static void clearDaysWeek(){
		days.clear();
	}

}
