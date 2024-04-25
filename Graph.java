import java.util.*;
public class Graph {
    public Map <Character, ArrayList<Character>> graph = new HashMap<>();
    public void addNote (char start, char dest){
        if (!graph.containsKey(start)) {
            graph.put(start, new ArrayList<>());
        }
        if (!graph.containsKey(dest)) {
            graph.put(dest, new ArrayList<>());
        }
        graph.get(start).add(dest);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Character vertexS : graph.keySet()) {
            result.append("vertex ").append(vertexS).append(" --> ");   
            for (Character vertexD : graph.get(vertexS)) {
                result.append(vertexD).append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }
}