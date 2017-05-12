import org.opensourcephysics.display.DrawableShape;

import polyfun.Polynomial;

import java.util.Random;
/**
 * This class uses the Random Rule to find Riemann sums, meaning that it takes a random value between the distances from the x-axis at the left and right endpoints to determine the height of the rectangle.
 * This child class extends Riemann and implements the abstract methods "slice" and "slicePlot".
 * @author Alison
 *
 */

public class RandomRule extends Riemann {
	PolyPractice p = new PolyPractice();
	Random gen = new Random();
	double random = gen.nextDouble();
	
	//calculates the area of a slice based on a random value between the y-values of the endpoints
	public double slice(Polynomial poly, double sleft, double sright) {
		double y = p.eval(poly, sleft + (sright-sleft)*random);
		return y * (sright-sleft);
	}
	
	//draws a slice where the height is a random value between the y-values at the endpoints
	public void slicePlot(org.opensourcephysics.frames.PlotFrame pframe, polyfun.Polynomial poly, double sleft, double sright)  {
		double x = (sleft+sright)/2;
		double y = (p.eval(poly, sleft + (sright-sleft)*random))/2;
		DrawableShape rectangle = DrawableShape.createRectangle(x, y, Math.abs(sright-sleft), 2*Math.abs(y));
		pframe.addDrawable(rectangle);
	}
}