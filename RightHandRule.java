import org.opensourcephysics.display.DrawableShape;

import polyfun.Polynomial;
/**
 * This class uses the Right Hand Rule to find Riemann sums, meaning that it takes the distance from the x-axis at the right endpoint of a subinterval to determine the height of the rectangle.
 * This child class extends Riemann and implements the abstract methods "slice" and "slicePlot".
 * @author Alison
 *
 */


public class RightHandRule extends Riemann {
	PolyPractice p = new PolyPractice();
	
	//calculates the area of a slice based on the right endpoint
	public double slice(Polynomial poly, double sleft, double sright) {
		double y;
		y = p.eval(poly, sright);
		return (sright-sleft)*y;
	}
	
	//draws a slice where the height is determined by the y-value at the right endpoint
	public void slicePlot(org.opensourcephysics.frames.PlotFrame pframe, polyfun.Polynomial poly, double sleft, double sright)  {
		double x = (sleft+sright)/2;
		double y = p.eval(poly, sright)/2;
		DrawableShape rectangle = DrawableShape.createRectangle(x, y, Math.abs(sright-sleft), 2*Math.abs(y));
		pframe.addDrawable(rectangle);
	}
}
