
public class Main {

	public static void main(String[] args) {
		
		Trie trie = new Trie();
		trie.insert("art");
		trie.insert("bunny");
		trie.insert("buck");
		trie.insert("dog");
		trie.insert("Apostate");
		boolean res = trie.search("bunny");
		System.out.println(res);
	}

}
