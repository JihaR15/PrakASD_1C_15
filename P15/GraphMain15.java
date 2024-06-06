package P15;

public class GraphMain15 {
    
    public static void main(String[] args) throws Exception {
        Graph15 gedung15 = new Graph15(6);

        gedung15.addEdge(0, 1, 50);
        gedung15.addEdge(0, 2, 100);
        gedung15.addEdge(1, 3, 70);
        gedung15.addEdge(2, 3, 40);
        gedung15.addEdge(3, 4, 60);
        gedung15.addEdge(4, 5, 80);
        gedung15.degree(0);
        gedung15.printGraph();

        gedung15.removeEdge(1,3);
        gedung15.printGraph();
        
    }
}
