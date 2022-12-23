import java.util.*;

public class Graph {
    Set<Node> nodes; // graph contains a set of nodes
    Graph()
    {
        nodes = new LinkedHashSet<>();
    }
    public void addNode(Node nodeA) {
        nodes.add(nodeA);
    }

    public Set<Node> getNodes() {
        return nodes;
    }

    public void setNodes(Set<Node> nodes) {
        this.nodes = nodes;
    }

    public void printGraph() // method for printing the graph
    {
        System.out.println("Printing graph info..");
        for (Node n : nodes)
        {
            System.out.println("Node "+n.getName());
            List<Node> shortestPath = n.getShortestPath();
            System.out.print("Shortest path -> ");
//            int count = 0;
            for (Node n1 : shortestPath)
            {
//                count += n1.getDistance();
                System.out.print(n1.getName()+" ");
            }
//            System.out.print(count);
            System.out.println("");
            for (Map.Entry<Node, Integer> adjNodes : n.getAdjacentNodes().entrySet())
            {
                System.out.println("Destination -> "+adjNodes.getKey().getName()+" with weight "+adjNodes.getValue());

            }
        }
    }
}
