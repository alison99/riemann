import polyfun.Polynomial;
/**
 * Tests the addXsquared method in PolyPractice to print and graph the sum of x^2 and a given polynomial
 */
public class AddXsquaredTest {

	public static void main(String[] args) 
	{
		PolyPractice p = new PolyPractice(); 
		Polynomial poly = new Polynomial(new double[] {-6,-1}); 
		p.addXsquared(poly); //p adds x^2 to poly, and then both prints and graphs the resulting polynomial
	}
}