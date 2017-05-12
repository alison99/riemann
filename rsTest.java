import polyfun.Polynomial;
/**
 * Tests the rs method in Riemann to calculate the Riemann sum using each Riemann Sum Rule.
 */

public class rsTest {
	public static void main(String[] args) 
	{
		LeftHandRule LHR = new LeftHandRule(); 
		RightHandRule RHR = new RightHandRule();  
		TrapezoidRule TR= new TrapezoidRule(); 
		MidpointRule MR = new MidpointRule();
		MinimumRule Min = new MinimumRule();
		MaximumRule Max = new MaximumRule();
		RandomRule RR = new RandomRule();
		SimpsonsRule SR = new SimpsonsRule();

		Polynomial p = new Polynomial(new double[] {0,0,3}); //p=3x^2

				System.out.println(LHR.rs(p, 0.0, 1.0, 2000)+"\n"); //calculates the approximate area under 3x^2, from 0 to 1, using the left hand rule

				System.out.println(RHR.rs(p, 0.0, 1.0, 2000)+"\n"); //calculates the approximate area under 3x^2, from 0 to 1, using the right hand rule

				System.out.println(TR.rs(p, 0.0, 1.0, 2000)+"\n"); //calculates the approximate area under 3x^2, from 0 to 1, using the trapezoid rule

				System.out.println(MR.rs(p, 0.0, 1.0, 2000)+"\n"); //calculates using the midpoint rule

				System.out.println(Min.rs(p, 0.0, 1.0, 2000)+"\n"); //calculates using the minimum rule

				System.out.println(Max.rs(p, 0.0, 1.0, 2000)+"\n"); //calculates using the maximum rule

				System.out.println(RR.rs(p, 0.0, 1.0, 2000)+"\n"); //calculates using the random rule

				System.out.println(SR.rs(p, 0.0, 1.0, 2000)+"\n"); //calculates using Simpson's rule

	}
}
