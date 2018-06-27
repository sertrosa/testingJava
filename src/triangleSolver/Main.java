package triangleSolver;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Maths triangle = new Maths();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce los grados del ángulo A");
		double A = scanner.nextDouble();
		System.out.println("Introduce los grados del ángulo B");
		double B = scanner.nextDouble();
		System.out.println("Introduce la medida de c");
		double c = scanner.nextDouble();
		System.out.println("Introduce la medida del ala de la bandeja");
		double alto = scanner.nextDouble();
		System.out.println("Introduce la medida de la base de la bandeja");
		double base = scanner.nextDouble();
		System.out.println("");
		
		triangle.resolveABc(A, B, c, alto, base);
		
		System.out.println("A: " + triangle.getA() + " grados");
		System.out.println("B: " + triangle.getB() + " grados");
		System.out.println("C: " + triangle.getC() + " grados");
		System.out.println("a: " + triangle.geta() + " mm2");
		System.out.println("b: " + triangle.getb() + " mm2");
		System.out.println("c: " + triangle.getc() + " mm2");
		System.out.println("trianguloAla: " + triangle.getTrianguloAla() + " mm2");
		System.out.println("trianguloAlaB: " + triangle.getTrianguloAlaB() + " mm2");
		System.out.println("trianguloBase: " + triangle.getTrianguloBase() + " mm2");
		System.out.println("trianguloBaseB: " + triangle.getTrianguloBaseB() + " mm2");
	}

}
