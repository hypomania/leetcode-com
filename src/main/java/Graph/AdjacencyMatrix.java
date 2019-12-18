package Graph;

/**
 * Adjacency Matrix for Graphs
 */
public class AdjacencyMatrix {

    /**
     * matrix contains boolean values and represents edge structure of given graph
     */
    private boolean[][] matrix;

    public AdjacencyMatrix(Integer vertexNumber) {
        matrix = new boolean[vertexNumber][vertexNumber];
    }

    public AdjacencyMatrix(boolean[][] matrix) {
        this.matrix = matrix;
    }

    public boolean hasEdge(Integer from, Integer to) {
        return matrix[from][to];
    }

    public void setEdge(Integer from, Integer to) {
        matrix[from][to] = true;
    }

}
