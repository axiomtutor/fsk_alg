package time;

import arrays.List;
import graphs.Graph;

public interface RandomInputs {
	
	// A random integer array of length n with min and max 
	// integers.  Default min is 0, default max is n.
	public List<Integer> randIntList(int n);
	public List<Integer> randIntList(int n, int max, int min);
	
	// A random String array of length n and min and max
	// String length.  Default min is 0 and max is n.
	public List<String> randStrList(int n);
	public List<String> randStrList(int n, int min, int max);
	
	// A random simple graph with integer labeled nodes.  n is
	// the number of nodes, and edges are drawn at random 
	// between the nodes.  The minimum and maximum number of 
	// edges are given by eMin and eMax.  eMin defaults to 1 
	// and eMax defaults to n(n-1)/4 (half as many as in the
	// complete graph on n vertices).
	public Graph<Integer> randSimpGraph(int n);
	public Graph<Integer> randSimpGraph(int n, int eMin, int eMax);

}
