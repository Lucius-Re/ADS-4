public class Experiment {

    public void runTraversals(Graph g, int start) {
        System.out.println("BFS Traversal:");
        long startTime = System.nanoTime();
        g.bfs(start);
        long endTime = System.nanoTime();
        System.out.println("BFS Time: " + (endTime - startTime) + " ns");

        System.out.println();

        System.out.println("DFS Traversal:");
        startTime = System.nanoTime();
        g.dfs(start);
        endTime = System.nanoTime();
        System.out.println("DFS Time: " + (endTime - startTime) + " ns");
    }

    public void runMultipleTests() {
        int[] sizes = {10, 30, 100};

        for (int size : sizes) {
            System.out.println("\n===== GRAPH SIZE: " + size + " =====");

            Graph graph = new Graph();

            // Создаем вершины
            for (int i = 0; i < size; i++) {
                graph.addVertex(new Vertex(i));
            }

            // Соединяем вершины в цепочку: 0 -> 1 -> 2 -> ...
            for (int i = 0; i < size - 1; i++) {
                graph.addEdge(i, i + 1);
            }

            // Для маленького графа показываем структуру и порядок обхода
            if (size == 10) {
                System.out.println("Graph Structure:");
                graph.printGraph();
                System.out.println();
            }

            runTraversals(graph, 0);
        }
    }

    public void printResults() {
        System.out.println("All experiments completed.");
    }
}