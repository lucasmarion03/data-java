package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
	public static void main(String[] args) {

		// Data local
		LocalDate d01 = LocalDate.now();
		System.out.println(d01);
		
		// Data hora local
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println(d02);
		
		// Data hora global
		Instant d03 = Instant.now();
		System.out.println(d03);
		
		// Conversão de string para uma data local
		LocalDate d04 = LocalDate.parse("2024-01-13");
		System.out.println(d04);

		// Conversão de string para uma data hora local
		LocalDateTime d05 = LocalDateTime.parse("2024-01-13T18:34:07");
		System.out.println(d05);

		// Conversão de string para uma data hora global
		Instant d06 = Instant.parse("2024-01-13T21:34:07Z");
		System.out.println(d06);

		// Conversão de string, transformando uma data hora local em data hora global
		Instant d07 = Instant.parse("2024-01-13T18:34:07-03:00");
		System.out.println(d07);
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		// Formatações de um padrão de data hora para padrão ISO
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		// Formatação de data local
		LocalDate d08 = LocalDate.parse("13/01/2024", fmt1);
		System.out.println(d08);
		
		// Formatação de data hora local
		LocalDateTime d09 = LocalDateTime.parse("13/01/2024 18:50", fmt2);
		System.out.println(d09);
		
		// Conversão de dados isolados para uma data local
		LocalDate d10 = LocalDate.of(2024, 1, 13);
		System.out.println(d10);
		
		// Conversão de dados isolados para uma data hora local
		LocalDateTime d11 = LocalDateTime.of(2024, 01, 13, 19, 2, 20);
		System.out.println(d11);

	}
}
