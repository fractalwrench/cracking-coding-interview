package co.uk.fractalwrench.cci.ch4;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Chapter4Question1 {

    /**
     * Returns true whether there is a route between the two nodes or not, using a breadth-first-search.
     *
     * @param start the node from which the search states
     * @param end   the node for which there should be a route
     * @return whether a route exists between the two nodes or not
     */
    public static boolean hasRoute(Node start, Node end) {
        if (start == null || end == null) {
            throw new IllegalArgumentException("Start/end nodes cannot be null!");
        }
        if (start == end) {
            return true;
        }

        // 1. perform a bfs originating from the start node. if the end node is seen, return true.
        Queue<Node> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            // check whether this matches the end node
            Node current = queue.poll();
            if (current == end) {
                return true;
            }

            // add any unvisited child nodes to the queue to search via breadth
            for (Node node : current.adjacentNodes) {
                if (!node.visited) {
                    queue.add(node);
                    node.visited = true;
                }
            }
        }
        return false;
    }

    public static class Node {
        Set<Node> adjacentNodes = new HashSet<>();
        boolean visited;

        void addRelationship(Node other) {
            if (other == this) {
                throw new IllegalArgumentException("Cannot add a relationship to self");
            }
            if (!adjacentNodes.contains(other)) {
                adjacentNodes.add(other);
                other.addRelationship(this);
            }
        }
    }

}
