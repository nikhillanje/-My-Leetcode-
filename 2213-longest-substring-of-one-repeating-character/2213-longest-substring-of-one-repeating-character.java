class Solution {

    class Node {
        int len;
        int left;
        int right;
        int best;

        char leftChar;
        char rightChar;

        Node() {}

        Node(char c) {
            len = 1;
            left = 1;
            right = 1;
            best = 1;
            leftChar = c;
            rightChar = c;
        }
    }

    Node[] tree;
    char[] str;

    public int[] longestRepeating(String s, String queryCharacters,
                                  int[] queryIndices) {

        int n = s.length();
        str = s.toCharArray();

        tree = new Node[4 * n];

        build(1, 0, n - 1);

        int[] ans = new int[queryIndices.length];

        for (int i = 0; i < queryIndices.length; i++) {

            int index = queryIndices[i];
            char ch = queryCharacters.charAt(i);

            str[index] = ch;

            update(1, 0, n - 1, index, ch);

            ans[i] = tree[1].best;
        }

        return ans;
    }

    void build(int node, int start, int end) {

        if (start == end) {
            tree[node] = new Node(str[start]);
            return;
        }

        int mid = start + (end - start) / 2;

        build(node * 2, start, mid);
        build(node * 2 + 1, mid + 1, end);

        tree[node] = merge(tree[node * 2], tree[node * 2 + 1]);
    }

    void update(int node, int start, int end,
                int index, char ch) {

        if (start == end) {
            tree[node] = new Node(ch);
            return;
        }

        int mid = start + (end - start) / 2;

        if (index <= mid) {
            update(node * 2, start, mid, index, ch);
        } else {
            update(node * 2 + 1, mid + 1, end, index, ch);
        }

        tree[node] = merge(tree[node * 2], tree[node * 2 + 1]);
    }

    Node merge(Node a, Node b) {

        Node res = new Node();

        res.len = a.len + b.len;

        res.leftChar = a.leftChar;
        res.rightChar = b.rightChar;

        // Prefix
        res.left = a.left;

        if (a.left == a.len && a.rightChar == b.leftChar) {
            res.left = a.len + b.left;
        }

        // Suffix
        res.right = b.right;

        if (b.right == b.len && a.rightChar == b.leftChar) {
            res.right = b.len + a.right;
        }

        // Best inside either segment
        res.best = Math.max(a.best, b.best);

        // Best crossing the middle
        if (a.rightChar == b.leftChar) {
            res.best = Math.max(res.best, a.right + b.left);
        }

        return res;
    }
}