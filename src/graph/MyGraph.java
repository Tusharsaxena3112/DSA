package graph;

public class MyGraph {
    private int maxNodes;
    private int[][] adjacencyMatrix;

    public MyGraph(int maxNodes) {
        this.maxNodes = maxNodes;
        adjacencyMatrix = new int[maxNodes][maxNodes];
    }

    public boolean addEdge(int node1, int node2) {
        boolean response = false;
        if (node1 < maxNodes && node2 < maxNodes) {
            adjacencyMatrix[node1][node2] = 1;
            adjacencyMatrix[node2][node1] = 1;
            response = true;
        } else {
            System.out.println("Cannot add Edge..");
        }
        return response;
    }

    public boolean removeEdge(int node1, int node2) {
        boolean response = false;
        return response;
    }
}
