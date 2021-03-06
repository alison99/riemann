import org.opensourcephysics.display.DrawableShape;
import org.opensourcephysics.frames.PlotFrame;

import polyfun.Polynomial;
/**
 * This class uses the Maximum Rule to find Riemann sums, meaning that it takes the larger distance from the x-axis at the endpoints of a subinterval to determine the height of the rectangle.
 * This child class extends Riemann and implements the abstract methods "slice" and "slicePlot".
 * @author Alison
 *
 */

public class MaximumRule extends Riemann {
	PolyPractice p = new PolyPractice();
	
	//calculates the area of a slice based on the greater of the two y-values at the endpoints of the subinterval
	public double slice(Polynomial poly, double sleft, double sright) {
		double a = p.eval(poly, sleft);
		double b = p.eval(poly, sright);
		double y;
		
		//compares the y-values at the endpoints to determine which is greater
		if(a > b) {
			 y = a;
		}
		else {
			 y = b;
		}
		return y *(sright-sleft);
	}
	
	//draws a slice where the height is determined by the value at the larger endpoint
	public void slicePlot(PlotFrame pframe, Polynomial poly, double sleft, double sright)  {
		double a = p.eval(poly, sleft);
		double b = p.eval(poly, sright);
		double c;
		
		//compares the endpoints to determine the height
		if(a > b) {
			c = a;
		}
		else {
			c = b;
		}
		double x = (sleft+sright)/2;
		double y = c/2;
		DrawableShape rectangle = DrawableShape.createRectangle(x, y, Math.abs(sright-sleft), Math.abs(c));
		pframe.addDrawable(rectangle);
	}
}