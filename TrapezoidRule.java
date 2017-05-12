import org.opensourcephysics.display.Trail;

import java.awt.Color;

import polyfun.Polynomial;
/**
 * This class uses the Trapezoid Rule to find Riemann sums, by calculating the area of a trapezoid.
 * The bases of the trapezoid are the distances from the x-axis at each endpoint and the height is the distance between the left and right endpoints.
 * This child class extends Riemann and implements the abstract methods "slice" and "slicePlot".
 * @author Alison
 *
 */
public class TrapezoidRule extends Riemann {
	PolyPractice p = new PolyPractice();
	
	//calculates the area of a slice using the trapezoid area formula
	public double slice(Polynomial poly, double sleft, double sright) {
		double b1 = p.eval(poly, sleft);
		double b2 = p.eval(poly, sright);
		return ((b1+b2)*(sright-sleft))/2;
	}
	
	//draws a slice by drawing a trail
	//adds points at the left endpoint, the y-value at the left endpoint, the y-value at the right endpoint, and the right endpoint respectively
	public void slicePlot(org.opensourcephysics.frames.PlotFrame pframe, polyfun.Polynomial poly, double sleft, double sright)  {
		Trail t = new Trail();
		pframe.addDrawable(t);
		t.color = Color.red;
		t.addPoint(sleft, 0);
		t.addPoint(sleft, p.eval(poly, sleft));
		t.addPoint(sright, p.eval(poly, sright));
		t.addPoint(sright, 0);
		t.closeTrail();
	}
}
