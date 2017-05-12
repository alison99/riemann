import polyfun.Polynomial;
import org.opensourcephysics.frames.*;
/**
 * Tests the rsAcc method in Riemann to draw the accumulation functions using each Riemann Sum Rule given an inital point and the polynomial
 */

public class rsAccTest {
	public static void main(String[] args) 
	{
		LeftHandRule LHR = new LeftHandRule();  
		RightHandRule RHR = new RightHandRule();  
		TrapezoidRule TR= new TrapezoidRule(); 
		MidpointRule MR = new MidpointRule();
		MinimumRule Min = new MinimumRule();
		MaximumRule Max = new MaximumRule();
		RandomRule RR = new RandomRule();
		SimpsonsRule SR = new SimpsonsRule();

		Polynomial p = new Polynomial(new double[] {0,0,1}); // p=x^2

		//creates individual plot frames
		PlotFrame f = new PlotFrame("x","y","Left Hand Rule Accumulation Function Graph");
		f.setPreferredMinMaxX(-3, 3);
		f.setDefaultCloseOperation(3);
		f.setVisible(true);

		PlotFrame g = new PlotFrame("x","y","Right Hand Rule Accumulation Function Graph");
		g.setPreferredMinMaxX(-3, 3);
		g.setDefaultCloseOperation(3);
		g.setVisible(true);

		PlotFrame h = new PlotFrame("x","y","Trapezoid Rule Accumulation Function Graph");
		h.setPreferredMinMaxX(-3, 3);
		h.setDefaultCloseOperation(3);                  
		h.setVisible(true);

		PlotFrame i = new PlotFrame("x","y","Midpoint Riemann Sum Graph");
		i.setPreferredMinMaxX(-3, 3);
		i.setDefaultCloseOperation(3);
		i.setVisible(true);

		PlotFrame j = new PlotFrame("x","y","Minimum Riemann Sum Graph");
		j.setPreferredMinMaxX(-3, 3);
		j.setDefaultCloseOperation(3);
		j.setVisible(true);

		PlotFrame k = new PlotFrame("x","y","Maximum Riemann Sum Graph");
		k.setPreferredMinMaxX(-3, 3);
		k.setDefaultCloseOperation(3);
		k.setVisible(true);

		PlotFrame l = new PlotFrame("x","y","Random Riemann Sum Graph");
		l.setPreferredMinMaxX(-3, 3);
		l.setDefaultCloseOperation(3);
		l.setVisible(true);

		PlotFrame m = new PlotFrame("x","y","Simpson's Riemann Sum Graph");
		m.setPreferredMinMaxX(-3, 3);
		m.setDefaultCloseOperation(3);
		m.setVisible(true);

		LHR.rsAcc(f, p, 2, .01, -1.0); //plots the left hand rule acccumulation function of x^2, with base x=-1;

		RHR.rsAcc(g, p, 2, .01, -1.0); //plots the right hand rule acccumulation function of x^2+x, with base x=-1;

		TR.rsAcc(h, p, 2, .01, -1.0); //plots the trapezoid rule acccumulation function of x^2+x, with base x=-1;       

		MR.rsAcc(i, p, 2, .01, -1.0); //plots the midpoint rule accumulation function

		Min.rsAcc(j, p, 2, .01, -1.0); //plots the minimum rule acculmulation function

		Max.rsAcc(k, p, 2, .01, -1.0); //plots the maximum rule accumulation function

		RR.rsAcc(l, p, 2, .01, -1.0); //plots the random rule accumulation function

		SR.rsAcc(m, p, 2, .01, -1.0); //plots the Simpson's rule accumulation function

	}
}
