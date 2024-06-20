import java.util.*;
interface Graph{
    public void BFS(int start);
    public void DFS(int start);
    
}
class WeightedGraph implements Graph{
    int V,E;
    List<Integer>[] adjacencyList;
    WeightedGraph(int V){
        this.V = V;
        adjacencyList = new List[V];
    }
    public void addEdge(int u, int v, int w) {     
        
    }
    public void removeEdge(int u, int v){

    }
    @Override
    public void BFS(int start) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void DFS(int start) {
        // TODO Auto-generated method stub
        
    }
    int ShortestPath(int u, int v){ // Dijkstra
        //TO DO
        return 0;
    }
    
    
}
class UnweightedGraph implements Graph{
    class Pair{
        int v,w;
        Pair(int v,int w){
            this.v = v;
            this.w = w;
        }
    }
    int V,E;
    List<Pair>[] adjacencyList;
    UnweightedGraph(int V){
        this.V = V;
        adjacencyList = new List[V];
    }
    public void addEdge(int u, int v){
        // TO DO
    }
    public void removeEdge(int u, int v){
        
    }
    @Override
    public void BFS(int start) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void DFS(int start) {
        // TODO Auto-generated method stub
        
    }
}
interface DirectedGraph extends Graph{
    boolean checkCycle();
    List<Integer> TopologicalSorting();
    
}
interface UndirectedGraph extends Graph{
    boolean checkCycle();
    int MST();
}

class UnweightedUndirectedGraph extends UnweightedGraph implements UndirectedGraph{
    UnweightedUndirectedGraph(int V){
        super(V);
    }
    @Override
    public boolean checkCycle() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public int MST() {
        // TODO Auto-generated method stub
        return 0;
    }
    boolean isBipartite(){
        //TO DO
        return false;
    }
}
class UnweightedDirectedGraph extends UnweightedGraph implements DirectedGraph{
    UnweightedDirectedGraph(int V){
        super(V);
    }
    @Override
    public boolean checkCycle() {
        // TODO Auto-generated method stub
        return false;
    }
    
    @Override
    public List<Integer> TopologicalSorting() {
        // TODO Auto-generated method stub
        return null;
    }

}
class WeightedUndirectedGraph extends WeightedGraph implements UndirectedGraph{
    WeightedUndirectedGraph(int V){
        super(V);
    }
    @Override
    public boolean checkCycle() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public int MST() {
        // TODO Auto-generated method stub
        return 0;
    }

}
class WeightedDirectedGraph extends WeightedGraph implements DirectedGraph{
    WeightedDirectedGraph(int V){
        super(V);
    }
    @Override
    public boolean checkCycle() {
        // TODO Auto-generated method stub
        return false;
    }
    
    @Override
    public List<Integer> TopologicalSorting() {
        // TODO Auto-generated method stub
        return null;
    }
}
public class Main {
    
}
