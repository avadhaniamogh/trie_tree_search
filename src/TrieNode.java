import java.util.HashMap;

public class TrieNode {
	private char c;
	private HashMap<Character, TrieNode> children = new HashMap<>();
	private boolean isLeaf;

	public TrieNode() {}

	public TrieNode(char c){
		this.c = c;
	}

	public HashMap<Character, TrieNode> getChildren() {
		return children;
	}

	public void setChildren(HashMap<Character, TrieNode> children) {
		this.children = children;
	}

	public boolean isLeaf() {
		return isLeaf;
	}

	public void setLeaf(boolean isLeaf) {
		this.isLeaf = isLeaf;
	}
}
