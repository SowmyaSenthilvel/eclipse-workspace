package triesDatastructure;


public class TrieNode{

	int no_of_alphabets = 26;
	TrieNode[] children;
	boolean isWord;

	TrieNode(){

		this.isWord = false;
		this.children = new TrieNode[no_of_alphabets];
	
	}

}
