import polyfun.Polynomial;
import org.opensourcephysics.frames.*;
/**
 * Tests the rsPlot method in Riemann to draw the given polynomial and all the slices using each Riemann Sum Rule
 */

public class rsPlotTest {
	public static void main(String[] args) 
	{
		LeftHandRule LHR = new LeftHandRule();  
		RightHandRule RHR = new RightHandRule();  
		TrapezoidRule TR = new TrapezoidRule();
		MidpointRule MR = new MidpointRule();
		MinimumRule Min = new MinimumRule();
		MaximumRule Max = new MaximumRule();
		RandomRule RR = new RandomRule();

		Polynomial p = new Polynomial(new double[] {3,-6,-3}); // p=3x^2-6x+3

		//creates individual plot frames
		//tests when left < right.
//		PlotFrame f = new PlotFrame("x","y","Left Hand Riemann Sum Graph");
//		f.setPreferredMinMaxX(-1, 3);
//		f.setDefaultCloseOperation(3);
//		f.setVisible(true);
//
//		PlotFrame g = new PlotFrame("x","y","Right Hand Riemann Sum Graph");
//		g.setPreferredMinMaxX(-1, 3);
//		g.setDefaultCloseOperation(3);
//		g.setVisible(true);
//
//		PlotFrame h = new PlotFrame("x","y","Trapezoid Riemann Sum Graph");
//		h.setPreferredMinMaxX(-1, 3);
//		h.setDefaultCloseOperation(3);
//		h.setVisible(true);
//
//		PlotFrame i = new PlotFrame("x","y","Midpoint Riemann Sum Graph");
//		i.setPreferredMinMaxX(-1, 3);
//		i.setDefaultCloseOperation(3);
//		i.setVisible(true);
//
//		PlotFrame j = new PlotFrame("x","y","Minimum Riemann Sum Graph");
//		j.setPreferredMinMaxX(-1, 3);
//		j.setDefaultCloseOperation(3);
//		j.setVisible(true);
//
//		PlotFrame k = new PlotFrame("x","y","Maximum Riemann Sum Graph");
//		k.setPreferredMinMaxX(-1, 3);
//		k.setDefaultCloseOperation(3);
//		k.setVisible(true);
//
//		PlotFrame l = new PlotFrame("x","y","Random Riemann Sum Graph");
//		l.setPreferredMinMaxX(-1, 3);
//		l.setDefaultCloseOperation(3);
//		l.setVisible(true);

//		LHR.rsPlot(f, p, 1, 0.01, 0.0, 2.0, 10); // the left hand rule from x=0 to x=2, with 10 rectangles      
//
//		RHR.rsPlot(g, p, 1, 0.01, 0.0, 2.0, 10); // the right hand rule from x=0 to x=2, with 10 rectangles             
//
//		TR.rsPlot(h, p, 1, 0.01, 0.0, 2.0, 10); // trapezoid rule
//
//		MR.rsPlot(i, p, 1, 0.01, 0.0, 2.0, 10); //midpoint rule
//
//		Min.rsPlot(j, p, 1, 0.01, 0.0, 2.0, 10); //minimum rule
//
//		Max.rsPlot(k, p, 1, 0.01, 0.0, 2.0, 10); //maximum rule
//
//		RR.rsPlot(l, p, 1, 0.01, 0.0, 2.0, 10); //random rule
		
		//creates individual plot frames
		//tests when left > right
		PlotFrame f = new PlotFrame("x","y","Left Hand Riemann Sum Graph");
		f.setPreferredMinMaxX(-5, 5);
		f.setDefaultCloseOperation(3);
		f.setVisible(true);

		PlotFrame g = new PlotFrame("x","y","Right Hand Riemann Sum Graph");
		g.setPreferredMinMaxX(-5, 5);
		g.setDefaultCloseOperation(3);
		g.setVisible(true);

		PlotFrame h = new PlotFrame("x","y","Trapezoid Riemann Sum Graph");
		h.setPreferredMinMaxX(-5, 5);
		h.setDefaultCloseOperation(3);
		h.setVisible(true);

		PlotFrame i = new PlotFrame("x","y","Midpoint Riemann Sum Graph");
		i.setPreferredMinMaxX(-5, 5);
		i.setDefaultCloseOperation(3);
		i.setVisible(true);

		PlotFrame j = new PlotFrame("x","y","Minimum Riemann Sum Graph");
		j.setPreferredMinMaxX(-5, 5);
		j.setDefaultCloseOperation(3);
		j.setVisible(true);

		PlotFrame k = new PlotFrame("x","y","Maximum Riemann Sum Graph");
		k.setPreferredMinMaxX(-5, 5);
		k.setDefaultCloseOperation(3);
		k.setVisible(true);

		PlotFrame l = new PlotFrame("x","y","Random Riemann Sum Graph");
		l.setPreferredMinMaxX(-5, 5);
		l.setDefaultCloseOperation(3);
		l.setVisible(true);
		
		LHR.rsPlot(f, p, 1, 0.01, 1.0, -2.0, 20); // the left hand rule from x=1 to x=-2, with 20 rectangles      

		RHR.rsPlot(g, p, 1, 0.01, 1.0, -2.0, 20); // the right hand rule from x=1 to x=-2, with 20 rectangles             

		TR.rsPlot(h, p, 1, 0.01, 1.0, -2.0, 20); //trapezoid rule

		MR.rsPlot(i, p, 1, 0.01, 1.0, -2.0, 20); //midpoint rule

		Min.rsPlot(j, p, 1, 0.01, 1.0, -2.0, 20); //minimum rule

		Max.rsPlot(k, p, 1, 0.01, 1.0, -2.0, 20); //maximum rule

		RR.rsPlot(l, p, 1, 0.01, 1.0, -2.0, 20); //random rule

	}
}       

