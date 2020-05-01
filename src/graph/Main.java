package graph;

public class Main {
    public static void main(String[] args) {
        int maxNodes = 5;
        MyGraph myGraph = new MyGraph(maxNodes);
        myGraph.display();

        System.out.println();
        myGraph.addEdge(1, 1);
        myGraph.addEdge(2, 2);
        myGraph.addEdge(3, 3);
        myGraph.addEdge(4, 4);
        myGraph.addEdge(0, 0);
        myGraph.removeEdge(1, 1);

        myGraph.display();

    }
}
