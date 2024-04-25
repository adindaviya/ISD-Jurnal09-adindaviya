public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addNote('A', 'B');
        graph.addNote('A', 'D');
        graph.addNote('A', 'E');
        graph.addNote('B', 'E');
        graph.addNote('C', 'B');
        graph.addNote('D', 'G');
        graph.addNote('E', 'F');
        graph.addNote('E', 'H');
        graph.addNote('F', 'C');
        graph.addNote('F', 'H');
        graph.addNote('G','H');
        graph.addNote('H', 'I');
        graph.addNote('I', 'F');
        System.out.println(graph);
    }
}