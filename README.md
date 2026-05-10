# Assignment 4: Graph Traversal and Representation System

## Project Overview

This project demonstrates the implementation of a graph data structure in Java using an adjacency list representation. The system includes two fundamental graph traversal algorithms:

- Breadth-First Search (BFS)
- Depth-First Search (DFS)

The project analyzes the performance of these algorithms on graphs of different sizes and measures execution time using `System.nanoTime()`.

---

## Graph Structure

A graph is a data structure consisting of:

- **Vertices (Nodes)** — individual points in the graph.
- **Edges** — connections between vertices.

Example:

0 → 1 → 2 → 3 → 4

---

## Adjacency List Representation

The graph is stored using an adjacency list.

Each vertex has a list of its neighboring vertices.

Example:

0 -> [1]
1 -> [2]
2 -> [3]
3 -> [4]
4 -> []

This representation is memory-efficient and suitable for sparse graphs.

---

## Class Descriptions

### Vertex.java

Represents a graph vertex.

**Fields:**
- `id` — unique identifier of the vertex.

**Methods:**
- Constructor
- `getId()`
- `toString()`

---

### Edge.java

Represents a connection between two vertices.

**Fields:**
- `source`
- `destination`

**Methods:**
- Constructor
- Getters
- `toString()`

---

### Graph.java

Implements the graph using an adjacency list.

**Methods:**
- `addVertex(Vertex v)`
- `addEdge(int from, int to)`
- `printGraph()`
- `bfs(int start)`
- `dfs(int start)`

---

### Experiment.java

Runs traversal algorithms and measures performance.

**Methods:**
- `runTraversals(Graph g, int start)`
- `runMultipleTests()`
- `printResults()`

---

### Main.java

Entry point of the program.

Creates an `Experiment` object and runs all tests.

---

## Breadth-First Search (BFS)

Breadth-First Search explores the graph level by level.

### How BFS Works

1. Start from the selected vertex.
2. Mark it as visited.
3. Add it to a queue.
4. Remove a vertex from the queue.
5. Visit all unvisited neighbors.
6. Repeat until the queue is empty.

### Data Structure Used

- `Queue`

### Use Cases

- Finding the shortest path in unweighted graphs
- Social network analysis
- Web crawling

### Time Complexity

- **O(V + E)**

Where:
- `V` = number of vertices
- `E` = number of edges

---

## Depth-First Search (DFS)

Depth-First Search explores as far as possible along each branch before backtracking.

### How DFS Works

1. Start from the selected vertex.
2. Mark it as visited.
3. Visit the first unvisited neighbor recursively.
4. Continue until no unvisited neighbors remain.
5. Backtrack and continue.

### Data Structure Used

- Recursion (implicit stack)

### Use Cases

- Detecting cycles
- Topological sorting
- Finding connected components

### Time Complexity

- **O(V + E)**

---

## Experimental Setup

The algorithms were tested on graphs of three different sizes:

- Small graph: 10 vertices
- Medium graph: 30 vertices
- Large graph: 100 vertices

Vertices were connected in a linear chain:

0 → 1 → 2 → ... → n

Execution time was measured using:

``java
long start = System.nanoTime();
long end = System.nanoTime();

---

## Experimental Results

The following table summarizes the execution time for both algorithms across different graph sizes.

| Graph Size | BFS Time (ns) | DFS Time (ns) |
| :--- | :--- | :--- |
| 10 | 2,011,300 | 914,100 |
| 30 | 1,614,600 | 1,286,500 |
| 100 | 6,538,700 | 5,794,000 |

---

## Observations

* **Successful Traversal:** Both BFS and DFS visited all vertices successfully.
* **Execution Time:** Time increased as the number of vertices increased, as expected.
* **Algorithmic Complexity:** Both algorithms demonstrated the expected complexity of $O(V + E)$.
* **Performance Comparison:** BFS and DFS showed similar performance because they both traversed the same linear graph structure.
* **Traversal Order:** The order depends entirely on the graph structure and the specific adjacency list ordering.

---

## When to Use BFS

BFS is preferred when:
* The **shortest path** in an unweighted graph is needed.
* Nodes should be explored **level by level**.
* **Distance** from the starting node is a priority.

## When to Use DFS

DFS is preferred when:
* **Detecting cycles** in a graph.
* Performing **topological sorting**.
* Finding **connected components**.
* **Exploring deep paths** before backtracking.

### Limitations of DFS
* It does **not** guarantee the shortest path.
* Recursive implementations may cause a **stack overflow** on extremely large graphs.

---

## Screenshots

* **Graph Structure Output**
  <img width="276" height="344" alt="image" src="https://github.com/user-attachments/assets/b03141d4-6a86-4fba-8f63-359bf454cc2b" />

* **BFS Traversal Output**
* GRAPH SIZE: 10
  <img width="236" height="94" alt="image" src="https://github.com/user-attachments/assets/18d8e005-0acb-43df-9cfb-ce4be212f7ba" />
* GRAPH SIZE: 30
  <img width="823" height="89" alt="image" src="https://github.com/user-attachments/assets/bb0f3e55-fc3a-4303-8563-b839f7c0d153" />
* GRAPH SIZE: 100
  <img width="1014" height="91" alt="image" src="https://github.com/user-attachments/assets/6fcd094e-d4ed-49fd-9d6f-69e78f1148f3" />

* **DFS Traversal Output**
* **Performance Results**

---

## Reflection

In this assignment, I learned how graphs are represented using adjacency lists and how traversal algorithms work in practice. I implemented both BFS and DFS and measured their performance on graphs of different sizes.

The main difference between BFS and DFS is the traversal strategy: BFS explores vertices level by level using a queue, while DFS explores deeply using recursion. BFS is useful for finding shortest paths in unweighted graphs, while DFS is more suitable for cycle detection and topological sorting.

One challenge was understanding how visited vertices are tracked to prevent infinite loops. Overall, this assignment helped me better understand graph theory and algorithmic complexity.
