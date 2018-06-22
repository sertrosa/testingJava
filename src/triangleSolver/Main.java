package triangleSolver;

public class Main {

	public static void main(String[] args) {

		Maths triangle = new Maths();
		
		triangle.resolve(60, 30, 151, 100, 200);
		
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
