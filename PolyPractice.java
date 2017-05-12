
import java.awt.Color;

import polyfun.*;

import org.opensourcephysics.frames.PlotFrame; 
import org.opensourcephysics.display.Trail; 
/**
 * This class contains the eval and addXsquared methods.
 * Eval evaluates the value of a polynomial at a given x-value.
 * AddXsquared prints and graphs the sum of the given polynomial and x^2.
 * @author Alison
 *
 */
public class PolyPractice {

	/**
	 * takes polynomial and x value, evaluates polynomial at that value
	 * @param p the given polynomial
	 * @param x the given x-value
	 * @return y the y-value at that point
	 */
	public double eval(Polynomial p, double x) {
		Coef C = p.evaluate(x); //plugs in x and returns the answer as a Coef which we call C
		Term T = C.getTerms()[0]; //pulls the first Term (index 0) off the array of Terms and calls it T 
		double y = T.getTermDouble(); //finds the number associated with that Term, which is our answer.
		return y;
	}

	/**
	 * takes a polynomial, adds x^2 to it, and prints and graphs the resulting polynomial
	 * @param p the given polynomial
	 */
	public void addXsquared(Polynomial p) {
		Polynomial a = new Polynomial(1, 2);
		
		//adds x^2 to the polynomial and prints the resulting polynomial
		Polynomial sum = p.plus(a);
		sum.print();

		PlotFrame pframe = new PlotFrame("x","y","addXsquared");
		Trail t = new Trail();
		t.color= Color.orange;
		pframe.addDrawable(t); 

		//draws the resulting polynomial by looping through and adding points to the trail
		for (int i = -500; i < 500; i++) {
			t.addPoint(i, eval(sum, i));
		}
		pframe.setVisible(true);
		pframe.setDefaultCloseOperation(3);  //closes the entire app when you close the frame window
		pframe.setPreferredMinMax(-10,10,-10,10); //sets the window to span from -10 to 10 on both the x-axis and y-axis
	}
}
