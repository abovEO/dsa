
import java.util.ArrayList;
import java.util.List;

class dfs {

    static void dfs(List<List<Integer>> adj, boolean[] visited, int source) {
        visited[source] = true;
        for (int i : adj.get(source)) {
            if (!visited[i]) {
                System.out.print(i + " ");
                dfs(adj, visited, i);
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] edges = {
            {1, 2}, {0, 2}, {2, 0}, {2, 3}, {2, 4}
        };
        List<List<Integer>> adj = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            adj.get(e[0]).add((e[1]));
            adj.get(e[1]).add((e[0]));
        }

        int source = 1;
        System.out.print(source + " ");
        boolean[] visited = new boolean[adj.size()];
        dfs(adj, visited, source);
    }
}
