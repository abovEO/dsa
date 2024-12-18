
import java.util.*;

class bfs {

    static void bfs(List<List<Integer>> adj, List<Integer> list) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[adj.size()];

        visited[0] = true;
        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.poll();
            list.add(curr);
            System.out.print(curr + " ");

            for (int e : adj.get(curr)) {
                if (!visited[e]) {
                    visited[e] = true;
                    q.add(e);
                }
            }
        }

    }

    public static void main(String[] args) {
        int n = 5;
        int[][] edges = {
            {0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 4}
        };
        List<List<Integer>> adj = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            adj.get(e[0]).add((e[1]));
            adj.get(e[1]).add((e[0]));
        }
        List<Integer> list = new ArrayList<>();

        bfs(adj, list);

    }
}
