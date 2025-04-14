class WordFilter {
        class Node {
    Map<Character, Node> children = new HashMap<>();
    int indices;
}
        private Node root = new Node(); // Root node for the Trie
    public WordFilter(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int n = word.length();

            // Insert all possible suffix-prefix combinations into the trie
            for (int j = 0; j <= n; j++) {
                String newWord = word.substring(j) + "#" + word;
                insert(newWord, i);
            }

        }
    }

    public int f(String pref, String suff) {
        String query = suff + "#" + pref; // Formulate the search key
        Node curr = root;

        // Traverse the trie for the given query string
        for (char c : query.toCharArray()) {
            if (!curr.children.containsKey(c)) {
                return -1; // No match found
            }
            curr = curr.children.get(c);
        }

        // Get the latest index from the stored indices list
        return curr.indices;
    }

    private void insert(String word, int idx) {
        Node curr = root;
        for (char c : word.toCharArray()) {
            curr.children.putIfAbsent(c, new Node()); // Create a new node if needed
            curr = curr.children.get(c);
            curr.indices = idx; // Store the latest index at this node
        }
    }
}



/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(pref,suff);
 */