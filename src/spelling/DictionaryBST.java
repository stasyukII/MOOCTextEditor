package spelling;

import java.util.LinkedList;
import java.util.TreeSet;

/**
 * @author UC San Diego Intermediate MOOC team
 *
 */
public class DictionaryBST implements Dictionary 
{
   private TreeSet<String> dict;
	private int size = 0;
    // TODO: Implement the dictionary interface using a TreeSet.  
 	// You'll need a constructor here
   public DictionaryBST() {
   	dict = new TreeSet<String>();
   }

    private class Node<E> {
    	private E data ;
    	private Node parent;
    	private Node left;
    	private Node right; 
    	
    	private Node(E val, Node<E> parent) {
    		this.data=val ;
    		this.parent=parent;
    		this.left=null;
    		this.right=null;
    	}
    }
    private class HeadNode<E> {
    	private Node child;
    	
    	private HeadNode(E val) {
    			this.child=null;

    	}
    }

    /** Add this word to the dictionary.  Convert it to lowercase first
     * for the assignment requirements.
     * @param word The word to add
     * @return true if the word was added to the dictionary 
     * (it wasn't already there). */
    public boolean addWord(String word) {
    	// TODO: Implement this method
    	String lowerWord = word.toLowerCase();
    	if(dict.contains(lowerWord)) {
    		return false;
    	} else {
    		dict.add(lowerWord);
    		size++;
    		return true;
    	}
    	}


    /** Return the number of words in the dictionary */
    public int size()
    {
    	// TODO: Implement this method
        return size;
    }

    /** Is this a word according to this dictionary? */
    public boolean isWord(String s) {
    	String ls = s.toLowerCase();
    	if(dict.contains(ls)) {
    		return true;
    	}
        return false;
    }

}
