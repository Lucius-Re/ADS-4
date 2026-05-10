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

```java
long start = System.nanoTime();
long end = System.nanoTime();
