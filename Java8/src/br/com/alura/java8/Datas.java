package br.com.alura.java8;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate minhasFerias = LocalDate.of(2019, Month.NOVEMBER, 18);
		
		int dias = minhasFerias.getDayOfYear() - hoje.getDayOfYear();
		System.out.println(dias);
		
		Period periodo = Period.between(hoje, minhasFerias);
		System.out.println(periodo.getDays());
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String dataFormatada = minhasFerias.format(formatador);
		System.out.println(dataFormatada);
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));
		
	}
}
