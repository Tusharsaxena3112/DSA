package graph;

public class MyGraph {
    private int maxNodes;
    private int[][] adjancencyMatrix;

    public MyGraph(int maxNodes) {
        this.maxNodes = maxNodes;
        adjancencyMatrix = new int[maxNodes][maxNodes];
    }


}
