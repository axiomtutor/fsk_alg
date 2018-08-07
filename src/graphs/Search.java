package graphs;

import arrays.List;

public interface Search<E> {
	
	// Depth-first-search for the first node in the graph with the given ID, and return that node.
	public Node<E> dfs(Graph<E> g);
	
	// Breadth-first-search for the first node in the graph with the given ID, and return that node.
	public Node<E> bfs(Graph<E> g);
	
	// Dijkstra's algorithm to find the shortest path between the src Node and the tgt Node.
	public List<E> dijkstra(Graph<E> g, Node<E> src, Node<E> tgt);
	
	// A solution to the traveling salesperson problem: For the given graph we find the shortest path that visits each node
	// at least once.
	public List<E> tsp(Graph<E> g);

}
