import polyfun.Polynomial;
/**
 * Tests the slice method in each child class to calculate the area of a slice using the particular Riemann Sum Rule
 */

public class SliceTest 
{
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

		Polynomial p = new Polynomial(new double[] {0, 0, 3}); // p=3x^3+4x

		System.out.println(LHR.slice(p,1, -1.1)+"\n"); //the area of a left hand rule slice of 3x^3+4x, from x=1 to x=1.1

		System.out.println(RHR.slice(p,1,-1.1)+"\n"); //the area of a rightt hand rule slice of 3x^3+4x, from x=1 to x=1.1

		System.out.println(TR.slice(p,1,-1.1)+"\n"); //the area of a trapezoid rule slice of 3x^3+4x, from x=1 to x=1.1

		System.out.println(MR.slice(p,1,-1.1)+"\n"); //the area of a midpoint rule slice

		System.out.println(Min.slice(p,1, -1.1)+"\n"); //the area of a minimum rule slice

		System.out.println(Max.slice(p,1,-1.1)+"\n"); //the area of a maximum rule slice

		System.out.println(RR.slice(p,1, -1.1)+"\n"); //the area of a random rule slice

		System.out.println(SR.slice(p, 1,-1.1) + "\n"); //the area of a Simpson's rule slice
	}
}