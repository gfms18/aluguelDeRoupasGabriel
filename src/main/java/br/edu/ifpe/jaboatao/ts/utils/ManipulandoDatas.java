package br.edu.ifpe.jaboatao.ts.utils;

import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;

import java.util.Calendar;
import java.util.Date;

public class ManipulandoDatas {
	


	public static Date novaDataComDiferencaDias(int dias, Date data) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		calendar.add(DAY_OF_MONTH, dias);
		return calendar.getTime();
		
	}

	
	
	public static Date novaDataComDiferencaDeDias(int dias) {
		return novaDataComDiferencaDias(dias, new Date());
	}	
	
	public static Date retornarData(int dia, int mes, int ano){
		Calendar calendar = Calendar.getInstance();
		calendar.set(DAY_OF_MONTH, dia);
		calendar.set(MONTH, mes - 1);
		calendar.set(YEAR, ano);
		return calendar.getTime();
		
	}

	

	
	
	public static boolean bolDatasIguais(Date primeiraData, Date segundaData) {
		//Primeira data
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(primeiraData);
		//Segunda data 
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(segundaData);
		return (cal1.get(DAY_OF_MONTH) == cal2.get(DAY_OF_MONTH))
				&& (cal1.get(MONTH) == cal2.get(MONTH))
				&& (cal1.get(YEAR) == cal2.get(YEAR));
	}
	
	 static boolean bolDiaSemana(Date data, int diaSemana) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		
		return calendar.get(DAY_OF_WEEK) == diaSemana;
		
		
	}
}
