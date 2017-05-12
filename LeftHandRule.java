import polyfun. *;

import org.opensourcephysics.display.DrawableShape;
/**
 * This class uses the Left Hand Rule to find Riemann sums, meaning that it takes the distance from the x-axis at the left endpoint of a subinterval to determine the height of the rectangle.
 * This child class extends Riemann and implements the abstract methods "slice" and "slicePlot".
 * @author Alison
 *
 */

public class LeftHandRule extends Riemann {
	PolyPractice p = new PolyPractice();
	
	//calculates the area of a slice based on the left endpoint
	public double slice(Polynomial poly, double sleft, double sright) {
		double y;
		y = p.eval(poly, sleft);
		return (sright-sleft)*y;
	}
	//draws a slice where the height is determined by the y-value at the left endpoint
	public void slicePlot(org.opensourcephysics.frames.PlotFrame pframe, polyfun.Polynomial poly, double sleft, double sright)  {
		double x = (sleft+sright)/2;
		double y = p.eval(poly, sleft)/2;
		DrawableShape rectangle = DrawableShape.createRectangle(x, y, Math.abs(sright-sleft), 2*Math.abs(y));
		pframe.addDrawable(rectangle);
		
	}
}


