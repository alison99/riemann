
import polyfun.Polynomial;
/**
 * Tests the eval method in PolyPractice to evaluate the y-value at a given x-value
 */

public class EvalTest {

	public static void main(String[] args) 
	{
		PolyPractice p = new PolyPractice(); 
		Polynomial poly = new Polynomial(new double[] {-6, -1}); 
		System.out.println(p.eval(poly,-2.5)); //p evaluates the polynomial at 2.5
	}
}