package favourableEnding;

import java.util.Scanner;

public class favourable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int S = scanner.nextInt(); // Number of sections
            int countFavourable = 0;

            // Variables to keep track of sections ending favourably or catastrophically
            boolean[] favourably = new boolean[S];
            boolean[] catastrophically = new boolean[S];

            for (int s = 0; s < S; s++) {
                int[] pages = new int[4];
                for (int i = 0; i < 4; i++) {
                    if (scanner.hasNextInt()) {
                        pages[i] = scanner.nextInt();
                    } else {
                        String word = scanner.next();
                        if (word.equals("favourably")) {
                            favourably[s] = true;
                        } else if (word.equals("catastrophically")) {
                            catastrophically[s] = true;
                        }
                    }
                }
            }

            long distinctFavourableStories = countDistinctFavourableStories(S, favourably, catastrophically);
            System.out.println(distinctFavourableStories);
        }

        scanner.close();
    }

    // Function to count the number of distinct stories ending in a favourable way
    public static long countDistinctFavourableStories(int S, boolean[] favourably, boolean[] catastrophically) {
        long count = 0;
        boolean[] visited = new boolean[S];
        count = dfs(0, S, favourably, catastrophically, visited);
        return count;
    }

    // Depth First Search (DFS) to traverse the sections and count distinct favourable endings
    public static long dfs(int section, int S, boolean[] favourably, boolean[] catastrophically, boolean[] visited) {
        visited[section] = true;
        long count = 0;

        if (favourably[section]) {
            count++;
        }

        if (!catastrophically[section]) {
            for (int nextSection = 0; nextSection < S; nextSection++) {
                if (!visited[nextSection]) {
                    count += dfs(nextSection, S, favourably, catastrophically, visited);
                }
            }
        }

        visited[section] = false;
        return count;
    }
}

