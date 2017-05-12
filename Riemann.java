import org.opensourcephysics.display.Trail;
import org.opensourcephysics.frames.PlotFrame;

import java.awt.BasicStroke;
import java.awt.Color;

import polyfun.*;

/**
 * This class calculates a Riemann sum given a polynomial using a particular Riemann Sum Rule.
 */
public abstract class Riemann {
	double left;
	double right;
	double subintervals;
	double dx;

	//getters and setters
	/**
	 * a getter for the left endpoint
	 * @return the left endpoint
	 */
	public double getLeft() {
		return left;
	}
	/**
	 * a setter for the left endpoint
	 * @param left  the left endpoint
	 */
	public void setLeft(double left) {
		this.left = left;
	}
	/**
	 * a getter for the right endpoint
	 * @return the right endpoint
	 */
	public double getRight() {
		return right;
	}
	/**
	 * a setter for the right endpoint
	 * @param right  the right endpoint
	 */
	public void setRight(double right) {
		this.right = right;
	}
	/**
	 * a getter for the dx, the width of each subinterval
	 * @return dx  the width of the subinterval
	 */
	public double getDelta() {
		return dx;
	}
	/**
	 * a setter for the width of each subinterval
	 * @param dx the width of each subinterval
	 */
	public void setDelta(double dx) {
		this.dx = dx;
	}
	
	/**
	 * a getter for the number of subintervals
	 * @return the number of subintervals
	 */
	public double getSubintervals() {
		return subintervals;
	}
	/**
	 * a setter for the number of subintervals
	 * @param subintervals  the number of subintervals
	 */
	public void setSubintervals(double subintervals) {
		this.subintervals = subintervals;
	}
	
	//calculates Riemann sum for given values
	/**
	 * This calculates a Riemann sum.
	 * If RiemannSumRule extends Riemann and RSR is an object of type RiemannSumRule, then RSR.rs calculates a Riemann sum using the particular Riemann sum rule implemented in RiemannSumRule.
	 * @param p  the polynomial whose Riemann sum is to be calculated
	 * @param left  the left endpoint
	 * @param right  the right endpoint
	 * @param subintervals  the number of subintervals used
	 * @return The value of the Riemann summ, calculated using the rule determined by the child class.
	 */
	public double rs(Polynomial p, double left, double right, int subintervals) {
		double area = 0;
		double dx = (right- left)/subintervals;
		
		//loops through the number of subintervals and adds up the area of each slice from the initial endpoint to initial + delta to find the total Riemann sum
		for(double i = 0; i < subintervals; i++) {
			area += slice(p, left, left + dx);
			left += dx;
		}
		 return area;
	}	
	
	//plots the graph of the polynomial and slices
	/**
	 * This graphs the polynomial on the given PlotFrame.
	 * It also draws the regions used to calculate a particular Riemann sum.
	 * If RiemannSumRule extends Riemann and RSR is an object of type RiemannSumRule, then RSR.rsPlot graphs the input polynomial and draw the regions used to calculate the Riemann sum using the rule implemented in RiemannSumRule.
	 * @param pframe  the PlotFrame on which it is drawn
	 * @param poly  the given polynomial
	 * @param index  the number associated to the collection of (x,y) coordinates that make up the dataset which, when plotted, is the graph of the polynomial
	 * @param precision  the difference between the xcoordinates of two adjacent points on the graph of the polynomial
	 * @param left  the left endpoint
	 * @param right  the right endpoint
	 * @param subintervals  the number of subintervals
	 */
	public void rsPlot(org.opensourcephysics.frames.PlotFrame pframe, Polynomial poly, int index, double precision, double left, double right, int subintervals) {
		double dx = (right-left)/subintervals;

		PolyPractice p = new PolyPractice();		
		Trail t = new Trail();
		pframe.addDrawable(t);
		t.color = Color.blue;
		
		//adds points to the trail to draw the polynomial. the x-value differs by the input precision and the y-value is determined by evaluating the polynomial at the x.
		for (double i = left - 50; i < left + 50; i+= precision) {
			t.addPoint(i, p.eval(poly, i));
		}
		
		//draws the slices by looping through the subintervals to draw each slice from the initial endpoint to initial + delta
		for(double i = 0; i < subintervals; i++) {
			slicePlot(pframe, poly, left, left + dx);
			left += dx;
		}	
	}

	//calculates the accumulation function
	/**
	 * This graphs the accumulation function corresponding to the input polynomial and the input left hand endpoint.
	 * If RiemannSumRule extends Riemann and RSR is an object of type RiemannSumRule, then RSR.rsAcc graphs the accumulation function corresponding to the input polynomial and the input left hand endpoint using the particular Riemann sum rule implemented in RiemannSumRule.
	 * @param pframe  the PlotFrame on which it is drawn
	 * @param poly  the given polynomial
	 * @param index  the number associated to the collection of (x,y) coordinates that make up the dataset which, when plotted, is the graph of the polynomial
	 * @param precision  the difference between the xcoordinates of two adjacent points on the graph of the polynomial
	 * @param base  the initial endpoint
	 */
	public void rsAcc(PlotFrame pframe, Polynomial poly, int index, double precision, double base) {
		Trail t = new Trail();
		pframe.addDrawable(t);
		t.color = Color.blue;
		
		//adds points to the trail where the x-value differs by precision and the y value is the Riemann sum at that point
		for (double i = base-10; i <= base+10 ; i+= precision) {
		t.addPoint(i, rs(poly, base, i, 200));
		}
		
		pframe.setAutoscaleX(true);
		pframe.setAutoscaleY(true);
		pframe.setVisible(true);
		
	}
	
	//calculates the area of a slice of a Riemann sum
	/**
	 * This method calculates the (signed) area between the graph of a polynomial and the x--axis, over a given interval on the x-axis. If RiemannSumRule extends Riemann and RSR is an object of type RiemannSumRule, then RSR.slice should calculate this area using the particular Riemann sum rule implemented in RiemannSumRule.
	 * @param poly  the polynomial whose area (over or under the x-axis), over the interval from sleft to sright, is to be calculated
	 * @param sleft  the left endpoint of the slice
	 * @param sright  the right endpoint of the slice
	 * @return the area of the slice
	 */
	public abstract double slice(Polynomial poly, double sleft, double sright);

	//draws the slices on the graph
	/**
	 * This method draws the region whose (signed) area is calculated by slice.
	 * If RiemannSumRule extends Riemann and RSR is an object of type RiemannSumRule, then RSR.slicePlot should draw this region using the particular Riemann sum rule implemented in RiemannSumRule.
	 * @param pframe  the PlotFrame used to draw the slice
	 * @param poly  the given polynomial
	 * @param sleft  the left endpoint of the slice
	 * @param sright  the right endpoint of the slice
	 */
	public abstract void slicePlot(org.opensourcephysics.frames.PlotFrame pframe, polyfun.Polynomial poly, double sleft, double sright);
}
