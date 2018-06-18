package adivinaNumero;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		Runtime rt = Runtime.getRuntime();
		
		int numeroSecreto = random.nextInt(10) + 1;
		int miNumero = 0;
		int intentos = 0;

		System.out.println(numeroSecreto);

		do {
			
			try {
				Process pr = rt.exec("espeak -ves -s 150 -f /home/trugulum/numero");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println("Introduce un número entre 1 y 10");
			System.out.println("Llevas " + intentos + " intentos.");
			miNumero = scanner.nextInt();
			intentos++;

			if (miNumero < numeroSecreto) {
				//System.out.println("Demasiado bajo. Sigue intentándolo");
				try {
					Process pr = rt.exec("espeak -ves -s 150 -f /home/trugulum/bajo");
					Thread.sleep(5000);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} else if (miNumero > numeroSecreto) {
				//System.out.println("Demasiado alto. Sigue intentándolo");
				try {
					Process pr = rt.exec("espeak -ves -s 150 -f /home/trugulum/alto");
					Thread.sleep(5000);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} while (miNumero != numeroSecreto && intentos <= 5);
		System.out.println("Enhorabuena, has acertado el número en " + intentos + " intentos");
		System.exit(0);

	}
}
