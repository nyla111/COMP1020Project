import java.util.*;
abstract class Graph{
    protected int V,E;
    protected List adjacencyList;
    abstract public void BFS(int start);
    abstract public void DFS(int start);

}
class WeightedGraph extends Graph{
    int V,E;
    List<Integer>[] adjacencyList;
    @Override
    public void BFS(int start) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void DFS(int start) {
        // TODO Auto-generated method stub
        
    }
    
}
class UnweightedGraph extends Graph{
    class Pair{
        int v,w;
        Pair(int v,int w){
            this.v = v;
            this.w = w;
        }
    }
    int V,E;
    List<Pair>[] adjacencyList;
    @Override
    public void BFS(int start) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void DFS(int start) {
        // TODO Auto-generated method stub
        
    }
}
public class Main {
    
}
