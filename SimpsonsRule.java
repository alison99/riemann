import polyfun.Polynomial;
/**
 * This class uses the Simpson's Rule to find Riemann sums, which is approximated by taking (2 * Midpoint Rule + Trapezoid Rule)/3.
 * This child class extends Riemann and implements the abstract methods "slice" and "slicePlot", but does not actually plot the graph using Simpson's Rule.
 * @author Alison
 *
 */

public class SimpsonsRule extends Riemann {
	
	//calculates the area of a slice using Simpson's rule, which can be approximated using the Midpoint and Trapezoid Rules
	public double slice(Polynomial poly, double sleft, double sright) {
		MidpointRule MR = new MidpointRule();
		TrapezoidRule TR = new TrapezoidRule();
		return (2*MR.slice(poly, sleft, sright) + TR.slice(poly, sleft, sright))/3;	
	}
	
	//this is the inherited method from Riemann that should draw a slice using Simpson's Rule
	public void slicePlot(org.opensourcephysics.frames.PlotFrame pframe, polyfun.Polynomial poly, double sleft, double sright)  {
		//did not do this
	}
}