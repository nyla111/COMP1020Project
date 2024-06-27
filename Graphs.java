package Termproject;

import java.util.*;

class UnweightedUndirectedGraph extends UnweightedGraph implements UndirectedGraph{
    public UnweightedUndirectedGraph(int V){
        super(V);
    }
    public UnweightedUndirectedGraph(int V,int E){
        super(V,E);
    }
    @Override
    public boolean checkCycle() {
        DisjointSet DS = new DisjointSet(V);
        for(UnweightedEdge x:Edges){
            if(!DS.join(x.u, x.v)){
                return false;
            }
        }
        return true;
    }
    
    public boolean isBipartite(){
        //TO DO
        return false;
    }
}
class UnweightedDirectedGraph extends UnweightedGraph implements DirectedGraph{
    public UnweightedDirectedGraph(int V){
        super(V);
    }
    public UnweightedDirectedGraph(int V,int E){
        super(V,E);
    }
    @Override
    public boolean checkCycle() {
        // TODO Auto-generated method stub
        return false;
    }
    
    @Override
    public ArrayList<Integer> TopologicalSorting() {
        // TODO Auto-generated method stub
        return null;
    }

}
class WeightedUndirectedGraph extends WeightedGraph implements UndirectedGraph{
    public WeightedUndirectedGraph(int V){
        super(V);
    }
    public WeightedUndirectedGraph(int V,int E){
        super(V,E);
    }
    @Override
    public boolean checkCycle() {
        DisjointSet DS = new DisjointSet(V);
        for(WeightedEdge x:Edges){
            if(!DS.join(x.u, x.v)){
                return false;
            }
        }
        return true;
    }
    
    public int MST() {
        int ret = 0;
        int cnt = 0;
        DisjointSet DS = new DisjointSet(V);
        for(WeightedEdge x:Edges){
            if(DS.join(x.u, x.v)){
                cnt++;
                ret+=x.w;
            }
            if(cnt==V-1){
                break;
            }
        }
        return ret;
    }

}
class WeightedDirectedGraph extends WeightedGraph implements DirectedGraph{
    public WeightedDirectedGraph(int V){
        super(V);
    }
    public WeightedDirectedGraph(int V,int E){
        super(V,E);
    }
    @Override
    public boolean checkCycle() {
        // TODO Auto-generated method stub
        return false;
    }
    
    @Override
    public ArrayList<Integer> TopologicalSorting() {
        // TODO Auto-generated method stub
        return null;
    }
}
