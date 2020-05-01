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
        if (node1 < maxNodes && node2 < maxNodes) {
            if (isEdge(node1, node2)) {
                adjacencyMatrix[node1][node2] = 0;
                adjacencyMatrix[node2][node1] = 0;
                response = true;
            }
        }
        return response;
    }

    private boolean isEdge(int node1, int node2) {
        boolean response = false;
        if (adjacencyMatrix[node1][node2] == 1) {
            response = true;
        }
        return response;
    }

    public void display() {
        System.out.print("\t");
        for (int i = 0; i < maxNodes; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        for (int i = 0; i < maxNodes; i++) {
            System.out.print(i + "\t");
            for (int j = 0; j < maxNodes; j++) {
                System.out.print(adjacencyMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
