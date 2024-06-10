import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class UnweightedEdge {
    int u, v;

    UnweightedEdge(int u, int v) {
        this.u = u;
        this.v = v;
    }
}

class WeightedEdge implements Comparable<WeightedEdge> {
    int u, v, w;

    WeightedEdge(int u, int v, int w) {
        this.u = u;
        this.v = v;
        this.w = w;
    }

    @Override
    public int compareTo(WeightedEdge o) {
        return Integer.compare(this.w, o.w);
    }
}

abstract class Graph<T> {
    protected int V;
    protected int E;
    protected List<T>[] adjacencyList;

    @SuppressWarnings("unchecked")
    public Graph(int vertices) {
        this.V = vertices;
        this.E = 0;
        this.adjacencyList = (List<T>[]) new List[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public int getVertices() {
        return V;
    }

    public int getEdges() {
        return E;
    }

    public abstract void addEdge(T edge);

    public List<T>[] getAdjacencyList() {
        return adjacencyList;
    }
}

class DirectedGraph extends Graph<UnweightedEdge> {
    public DirectedGraph(int vertices) {
        super(vertices);
    }

    @Override
    public void addEdge(UnweightedEdge edge) {
        adjacencyList[edge.u].add(edge);
        E++;
    }
}

class UndirectedGraph extends Graph<UnweightedEdge> {
    public UndirectedGraph(int vertices) {
        super(vertices);
    }

    @Override
    public void addEdge(UnweightedEdge edge) {
        adjacencyList[edge.u].add(edge);
        adjacencyList[edge.v].add(edge);
        E++;
    }
}

class WeightedDirectedGraph extends Graph<WeightedEdge> {
    public WeightedDirectedGraph(int vertices) {
        super(vertices);
    }

    @Override
    public void addEdge(WeightedEdge edge) {
        adjacencyList[edge.u].add(edge);
        E++;
    }
}

class WeightedUndirectedGraph extends Graph<WeightedEdge> {
    public WeightedUndirectedGraph(int vertices) {
        super(vertices);
    }

    @Override
    public void addEdge(WeightedEdge edge) {
        adjacencyList[edge.u].add(edge);
        adjacencyList[edge.v].add(edge);
        E++;
    }
}

public class TermProject{
    public static void main(String[] args) {
        
    }
}