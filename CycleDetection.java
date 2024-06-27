package Termproject;
class DisjointSet{
    int capacity;
    int[] parent,setSize;
    int numSet;
    DisjointSet(int capacity){
        this.capacity = capacity;
        numSet = capacity;
        parent = new int[capacity+5];
        setSize = new int[capacity+5];
        for(int i=0;i<capacity;i++){
            parent[i] = i;
            setSize[i] = 1;
        }
    }
    public int find(int i){
        if(parent[i]==i){
            return i;
        }
        return parent[i] = find(parent[i]);
    }
    public boolean isSameSet(int i,int j){
        return find(i)==find(j);
    }
    void join(int i,int j){
        if(isSameSet(i, j)) return;
        setSize[find(j)] += setSize[find(i)];
        parent[find(i)] = find(j);
        numSet--;
    }
}


