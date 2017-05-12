/**
 * Tests the slicePlot method in each child class to draw a slice using the particular Rieman Sum Rule
 */
import polyfun.Polynomial;

import org.opensourcephysics.frames.*;

public class SlicePlotTest 
{
	public static void main(String[] args) 
	{
		LeftHandRule LHR = new LeftHandRule(); 
		RightHandRule RHR = new RightHandRule(); 
		TrapezoidRule TR = new TrapezoidRule();
		MidpointRule MR = new MidpointRule();
		MinimumRule Min = new MinimumRule();
		MaximumRule Max = new MaximumRule();
		RandomRule RR = new RandomRule();

		Polynomial p = new Polynomial(new double[] {0,0,3}); // p=3x^3+4x

				//creates individual plot frames
				PlotFrame f = new PlotFrame("x","y","Left Hand Slice");
		f.setPreferredMinMaxX(.5, 1.5);
		f.setDefaultCloseOperation(3);                  
		f.setVisible(true);

		PlotFrame g = new PlotFrame("x","y","Right Hand Rule Slice");                   
		g.setPreferredMinMaxX(.5,1.5);
		g.setDefaultCloseOperation(3);
		g.setVisible(true);

		PlotFrame h = new PlotFrame("x","y","Trapezoid Riemann Sum Graph");
		h.setPreferredMinMaxX(-1, 3);
		h.setDefaultCloseOperation(3);
		h.setVisible(true);

		PlotFrame i = new PlotFrame("x","y","Midpoint Riemann Sum Graph");
		i.setPreferredMinMaxX(-1, 3);
		i.setDefaultCloseOperation(3);
		i.setVisible(true);

		PlotFrame j = new PlotFrame("x","y","Minimum Riemann Sum Graph");
		j.setPreferredMinMaxX(-1, 3);
		j.setDefaultCloseOperation(3);
		j.setVisible(true);

		PlotFrame k = new PlotFrame("x","y","Maximum Riemann Sum Graph");
		k.setPreferredMinMaxX(-1, 3);
		k.setDefaultCloseOperation(3);
		k.setVisible(true);

		PlotFrame l = new PlotFrame("x","y","Random Riemann Sum Graph");
		l.setPreferredMinMaxX(-1, 3);
		l.setDefaultCloseOperation(3);
		l.setVisible(true);

		LHR.slicePlot(f, p, 1, 1.1); //draws a left hand rule slice of 3x^3+4x, from x=1 to x=1.1

		RHR.slicePlot(g, p, 1, 1.1); //draws a right hand rule slice of 3x^3+4x, from x=1 to x=1.1

		TR.slicePlot(h, p, 1, 1.1); //draws a trapezoid rule slice

		MR.slicePlot(i, p, 1, 1.1); //draws a midpoint rule slice

		Min.slicePlot(j, p, 1, 1.1); //draws a minimum rule slice

		Max.slicePlot(k, p, 1, 1.1); //draws a maximum rule slice

		RR.slicePlot(l, p, 1, 1.1); //draws a random rule slice

	}
}