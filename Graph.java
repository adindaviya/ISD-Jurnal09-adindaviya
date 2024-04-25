import java.util.LinkedList;
public class Graph {
    int v;
    LinkedList<Integer> adjListArray[];

    public Graph(int V) {   
        this.v = V;

        adjListArray = new LinkedList[v];   
        for (int i = 0; i < v; i++) {   
            adjListArray[i] = new LinkedList<>();
        }
    }
    public void addEdge(int src, int dest) {    
        adjListArray[src].add(dest);
    }
    // karena graph berarah maka 

    public String convert(int i) {
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};
        return alphabet[i];
    }

    public void printGraph() {
        for (int i = 0; i < v; i++) {
            if (adjListArray[i].size() > 0) {
                System.out.print("Vertex " + convert(i) + " is connected to: ");
                for (int j = 0; j < adjListArray[i].size(); j++) {
                    System.out.print(convert(adjListArray[i].get(j)) + " ");
                }
                System.out.println();
            }
        }
    }
}