public class Main {
    public static void main(String[] args) {
        // Creating nodes
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");

        // adding edges to the nodes
        nodeA.addDestination(nodeB, 10);
        nodeA.addDestination(nodeC, 15);
        nodeB.addDestination(nodeD, 12);
        nodeB.addDestination(nodeF, 15);
        nodeC.addDestination(nodeE, 10);
        nodeD.addDestination(nodeE, 2);
        nodeD.addDestination(nodeF, 1);
        nodeF.addDestination(nodeE, 5);

        // creating graph
        Graph graph = new Graph();
        graph.addNode(nodeA); // adding nodes to the graph
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);

        graph.printGraph(); // printing the graph
        graph = DijkstraAlgo.calculateShortestPathFromSource(graph, nodeA); // applying dijkstra's rule
        System.out.println("--------------------after applying Dijkstra----------------------");
        graph.printGraph(); // printing the graph again
    }
}