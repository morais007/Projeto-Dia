package Application;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		System.out.print("Que horas são Agora: ");
		LocalTime horaAtual = LocalTime.now();
		
		String horaFormatada = horaAtual.format(formatter);
		
		System.out.println(horaFormatada);
		char hora = horaFormatada.charAt(0);
		
		if(hora< 12) {
			System.out.println("Bom Dia!");
		}else if(hora < 18) {
			System.out.println("Boa Tarde!");
		}else {
			System.out.println("Boa Noite!");
		}
		
		
		
		sc.close();
	}

}
