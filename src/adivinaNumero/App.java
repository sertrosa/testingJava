package adivinaNumero;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		Runtime rt = Runtime.getRuntime();
		ArrayList<Integer> usados = new ArrayList<Integer>();
		
		int numeroSecreto = random.nextInt(10) + 1;
		int miNumero = 0;
		int intentos = 0;

		//System.out.println(numeroSecreto);
		
		try {
			Process pr = rt.exec("espeak -ves -s 180 -f /home/trugulum/numero");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		do {
			
			
			//System.out.println("Introduce un número entre 1 y 10");
			System.out.println("Llevas " + intentos + " intentos.");
			System.out.println("Números que has usado: " + usados);
			miNumero = scanner.nextInt();
			intentos++;
			usados.add(miNumero);

			if (miNumero < numeroSecreto) {
				//System.out.println("Demasiado bajo. Sigue intentándolo");
				try {
					Process pr = rt.exec("espeak -ves -s 180 -f /home/trugulum/bajo");
					Thread.sleep(5000);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} else if (miNumero > numeroSecreto) {
				//System.out.println("Demasiado alto. Sigue intentándolo");
				try {
					Process pr = rt.exec("espeak -ves -s 180 -f /home/trugulum/alto");
					Thread.sleep(3000);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} while (miNumero != numeroSecreto && intentos < 5);
		//System.out.println("Enhorabuena, has acertado el número en " + intentos + " intentos");
		try {
			Process pr = rt.exec("espeak -ves -s 180 -f /home/trugulum/acierto");
			Thread.sleep(3000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.exit(0);

	}
}
