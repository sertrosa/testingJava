package triangleSolver;

public class Maths {

	private double A;
	private double B;
	private double C;
	private double a;
	private double b;
	private double c;
	private double trianguloAla;
	private double trianguloBase;
	private double trianguloAlaB;
	private double trianguloBaseB;

	public void resolveABc(double A, double B, double c, double ala, double base) {
		this.A = A;
		this.B = B;
		C = 180 - A - B;
		a = (c * Math.sin(Math.toRadians(A))) / Math.sin(Math.toRadians(C));
		b = (a * Math.sin(Math.toRadians(B))) / Math.sin(Math.toRadians(A));
		this.c = c;

		// GIRO SOBRE ALA
		double gradosdeGiro = A / 2;
		trianguloAla = (Math.sin(Math.toRadians(gradosdeGiro)) * ala / (Math.sin(Math.toRadians(C - gradosdeGiro))))
				* 2;
		double gradosdeGiroB = B / 2;
		trianguloAlaB = (Math.sin(Math.toRadians(gradosdeGiroB)) * ala / (Math.sin(Math.toRadians(C - gradosdeGiro))))
				* 2;

		// GIRO SOBRE BASE
		trianguloBase = (Math.sin(Math.toRadians(gradosdeGiro)) * base / (Math.sin(Math.toRadians(C - gradosdeGiro))))
				* 2;
		trianguloBaseB = (Math.sin(Math.toRadians(gradosdeGiroB)) * base / (Math.sin(Math.toRadians(C - gradosdeGiro))))
				* 2;

	}

	public double getA() {
		return A;
	}

	public double getB() {
		return B;
	}

	public double getC() {
		return C;
	}

	public double geta() {
		return a;
	}

	public double getb() {
		return b;
	}

	public double getc() {
		return c;
	}

	public double getTrianguloAla() {
		return trianguloAla;
	}

	public double getTrianguloBase() {
		return trianguloBase;
	}

	public double getTrianguloAlaB() {
		return trianguloAlaB;
	}

	public double getTrianguloBaseB() {
		return trianguloBaseB;
	}

}

/*
 * // GIRO SOBRE ALA double gradosdeGiro = angA / 2; trianguloGiroAla =
 * (Math.sin(Math.toRadians(gradosdeGiro)) * alturaBandeja /
 * (Math.sin(Math.toRadians(angC - gradosdeGiro)))) * 2;
 * 
 * double gradosdeGiroB = angB / 2; trianguloGiroAlaB =
 * (Math.sin(Math.toRadians(gradosdeGiroB)) * alturaBandeja /
 * (Math.sin(Math.toRadians(angC - gradosdeGiro)))) * 2;
 * 
 * // GIRO SOBRE BASE trianguloGiroBase =
 * (Math.sin(Math.toRadians(gradosdeGiro)) * anchoBandeja /
 * (Math.sin(Math.toRadians(angC - gradosdeGiro)))) * 2;
 * 
 * trianguloGiroBaseB = (Math.sin(Math.toRadians(gradosdeGiroB)) * anchoBandeja
 * / (Math.sin(Math.toRadians(angC - gradosdeGiro)))) * 2;
 * 
 * 
 */
