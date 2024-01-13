package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
	public static void main(String[] args) {

		LocalDate d01 = LocalDate.now();
		System.out.println("Data local => " + d01);
		
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("Data hora local => " + d02);
		
		Instant d03 = Instant.now();
		System.out.println("Data hora global => " + d03);
		
		LocalDate d04 = LocalDate.parse("2024-01-13");
		System.out.println("String convertida para data local => " + d04);

		LocalDateTime d05 = LocalDateTime.parse("2024-01-13T18:34:07");
		System.out.println("String convertida para data hora local => " + d05);

		Instant d06 = Instant.parse("2024-01-13T21:34:07Z");
		System.out.println("String convertida para data hora global => " + d06);

		Instant d07 = Instant.parse("2024-01-13T18:34:07-03:00");
		System.out.println("String convertida de data hora local para data hora global => " + d07);
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d08 = LocalDate.parse("13/01/2024", fmt1);
		System.out.println("Formatação de uma data fora do padrão ISO => " + d08);
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d09 = LocalDateTime.parse("13/01/2024 18:50", fmt2);
		System.out.println("Formatação de uma data hora fora do padrão ISO => " + d09);
		
		LocalDate d10 = LocalDate.of(2024, 1, 13);
		System.out.println("Convertendo dados isolados para uma data local => " + d10);
		
		LocalDateTime d11 = LocalDateTime.of(2024, 01, 13, 19, 2, 20);
		System.out.println("Convertendo dados isolados para uma data hora local => " + d11);

	}
}
