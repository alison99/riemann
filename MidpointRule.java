import org.opensourcephysics.display.DrawableShape;

import polyfun.Polynomial;
/**
 * This class uses the Midpoint Rule to find Riemann sums, meaning that it takes the arithmetic mean of the distances from the x-axis at the endpoints of a subinterval to determine the height of the rectangle.
 * This child class extends Riemann and implements the abstract methods "slice" and "slicePlot".
 * @author Alison
 *
 */

public class MidpointRule extends Riemann {
	PolyPractice p = new PolyPractice();
	
	//calculates the area of a slice determined by the arithmetic mean of the y-values at the left and right endpoints
	public double slice(Polynomial poly, double sleft, double sright) {
		double x = p.eval(poly, sleft);
		double y = p.eval(poly, sright);
		double midpoint = (x+y)/2;
		return midpoint*(sright-sleft);
	}
	
	//draws a slice where the height is the midpoint between the y-values at the left and right endpoints
	public void slicePlot(org.opensourcephysics.frames.PlotFrame pframe, polyfun.Polynomial poly, double sleft, double sright)  {
		PolyPractice p = new PolyPractice();
		double x = (sleft+sright)/2;
		double midpoint = (p.eval(poly, sleft)+ p.eval(poly, sright))/2;
		double y = (midpoint)/2;
		DrawableShape rectangle = DrawableShape.createRectangle(x, y, Math.abs(sright-sleft), Math.abs(midpoint));
		pframe.addDrawable(rectangle);
	}
}