package triangleResolve;

public class triangleResolve {
	
	private double A;
	private double B;
	private double C;
	private double a;
	private double b;
	private double c;
	
	public void resolve(double A, double B, double c) {
		C = 180 -A -B;
		a = (c * Math.sin(Math.toRadians(A)))/Math.sin(Math.toRadians(B));
		b = (a * Math.sin(Math.toRadians(B)))/Math.sin(Math.toRadians(A));
		
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

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		triangleResolve triangle = new triangleResolve();
		triangle.resolve(60, 30, 151);
		System.out.println("C: " + triangle.getC());
		System.out.println("a: " + triangle.geta());
		System.out.println("b: " + triangle.getb());

	}

}
