class TrieNode{
        
    Map<Character, TrieNode> child;
    boolean endOfWord;
    public TrieNode()
    {
        child = new HashMap<>();
        endOfWord = false;     
        
    }
}
class Trie {
     
       TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
         root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode current = root;
        for(int i = 0; i < word.length(); i++)
        {
            TrieNode curr = current.child.get(word.charAt(i));
            if(curr == null)
            {
                curr = new TrieNode();
                current.child.put(word.charAt(i), curr);
            }
            current = curr; 
        }
        current.endOfWord = true;  
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode current = root;
        for(char c: word.toCharArray())
        {
            TrieNode curr = current.child.get(c);
            if(curr == null)
                return false;
            current = curr;
        }
        return current.endOfWord; 
        
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        if(prefix == null || prefix.length() == 0)
        {
            if(root == null)
                return true;
            else
                return false;
        }
        
        TrieNode current = root;
        int len = prefix.length();
        for(int i = 0; i < len; i++)
        {
            TrieNode curr = current.child.get(prefix.charAt(i));
            if(curr == null)
                return false;
            else
                current = curr;
        }
        return true;      
    }
}
