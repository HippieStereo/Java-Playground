package pkg_one.search.binary.tree;

public class BinaryTree {

	Node root;
	
	public void addNode(int key, String name) {
		
		// Create a new Node and initialize it
		
		Node newNode = new Node(key, name);
		
		// If there is no root this becomes root
		
		if(root == null) {
			
			root = newNode;
			
		} else {
			
			// Set root as the Node we will start
			// with as we traverse the tree
			
			Node focusNode = root;
			
			// Future parent for our new Node
			
			Node parent;
			
			while(true) {
				
				// root is the top parent so we start there
				
				parent = focusNode;
				
				// Check if the new node should go on
				// the left side of the parent node
				
				if(key < focusNode.key) {
					
					// Switch focus to the left child
					
					focusNode = focusNode.leftChild;
					
					// If the left child has no children
					
					if(focusNode == null) {
						
						// then place the new node on the left of it
						
						parent.leftChild = newNode;
						
						return;
						
					}
					
				} else { // If we get here put the node on the right
					
					focusNode = focusNode.rightChild;
					
					// If the right child has no children
					
					if(focusNode == null) {
						
						// then place the new node on the right of it
						
						parent.rightChild = newNode;
						
						return;
						
					}
					
				}
				
			}
			
		}
		
	}
	
	// All nodes are visited in ascending order
	// Recursion is used to go to one node and
	// then go to its child nodes and so forth
	
	public void inOrderTraverseTree(Node focusNode) {
		
		if(focusNode != null) {
			
			// Traverse the left node
			
			inOrderTraverseTree(focusNode.leftChild);
			
			// Visit the currently focused on node
			
			System.out.println(focusNode);
			
			// Traverse the right node
			
			inOrderTraverseTree(focusNode.rightChild);
			
		}
		
	}
	
	public void preorderTraverseTree(Node focusNode) {
		
		if(focusNode != null) {

			System.out.println(focusNode);
			
			preorderTraverseTree(focusNode.leftChild);
			
			preorderTraverseTree(focusNode.rightChild);
			
		}
		
	}
	
	public void postOrderTraverseTree(Node focusNode) {
		
		if(focusNode != null) {

			postOrderTraverseTree(focusNode.leftChild);
			
			postOrderTraverseTree(focusNode.rightChild);

			System.out.println(focusNode);
			
		}
		
	}
	
	public Node findNode(int key) {
		
		// Start at the top of the tree
		
		Node focusNode = root;
		
		// While we haven't found the Node
		// keep looking
		
		while(focusNode.key != key) {
			
			// If we should search to the left
			
			if(key < focusNode.key) {
				
				// Shift the focus Node to the left child
				
				focusNode = focusNode.leftChild;
				
			} else {
				
				// Shift the focus Node to the right child
				
				focusNode = focusNode.rightChild;
				
			}
			
			// The node wasn't found
			
			if(focusNode == null) return null;
			
		}
		
		return focusNode;
		
	}
	
	public boolean remove(int key) {
		
		// Start at the top of the tree
		
		Node focusNode = root;
		Node parent = root;
		
		// When searching for a Node this will
		// tell us whether to search to the
		// right or left
		
		boolean isItLeftChild = true;
		
		// While we haven't found the Node
		// keep looking
		
		while(focusNode.key != key) {
			
			parent = focusNode;
			
			// If we should search to the left
			
			if(key < focusNode.key) {
				
				isItLeftChild = true;
				
				// Shift the focus Node to the left child
				
				focusNode = focusNode.leftChild;
				
			} else {
				
				isItLeftChild = false;
				
				// Greater than focus node so go to the right
				
				focusNode = focusNode.rightChild;
				
			}
			
			// The node wasn't found
			
			if(focusNode == null) return false;
			
		}
		
		// If Node doesn't have children delete it
		
		if(focusNode.leftChild == null && focusNode.rightChild == null) {
			
			// If root delete it
			
			if(focusNode == root) {
				
				root = null;
				
			// If it was marked as a left child
			// of the parent delete it in its parent
				
			} else if (isItLeftChild) {
				
				parent.leftChild = null;
			
			// Vice versa for the right child
				
			} else {
				
				parent.rightChild = null;
				
			}
			
		// If no right child
			
		} else if(focusNode.rightChild == null) {
			
			if(focusNode == root)
				root = focusNode.leftChild;
			
			// If focus Node was on the left of parent
			// move the focus Nodes left child up to the
			// parent node
			
			else if(isItLeftChild)
				parent.leftChild = focusNode.leftChild;
			
			// Vice versa for the right child
			
			else
				parent.rightChild = focusNode.leftChild;
		
		// If no left child	
		} else if(focusNode.leftChild == null) {
			
			if(focusNode == root)
				root = focusNode.rightChild;
			
			// If focus Node was on the left of parent
			// move the focus Nodes right child up to the
			// parent node
			
			else if(isItLeftChild)
				parent.leftChild = focusNode.rightChild;
			
			// Vice versa for the left child
			
			else
				parent.rightChild = focusNode.rightChild;
		
		// Two children so I need to find the deleted nodes
		// replacement
		} else {
			
			Node replacement = getReplacementNode(focusNode);
			
			// If the focusNode is root replace root
			// with the replacement
			
			if(focusNode == root)
				root = replacement;
			
			// If the deleted node was a left child
			// make the replacement the left child
			else if(isItLeftChild)
				parent.leftChild = replacement;
			
			// Vice versa if it was a right child
			else
				parent.rightChild = replacement;
			
			replacement.leftChild = focusNode.leftChild;
			
		}
		
		return true;
		
	}
	
	public Node getReplacementNode(Node nodeToReplace) {

		Node replacementParent = nodeToReplace;
		Node replacement = nodeToReplace;

		Node focusNode = nodeToReplace.rightChild;

		// While there are no more left children

		while (focusNode != null) {

			replacementParent = replacement;

			replacement = focusNode;

			focusNode = focusNode.leftChild;

		}

		// If the replacement isn't the right child
		// move the replacement into the parents
		// leftChild slot and move the replaced nodes
		// right child into the replacements rightChild

		if (replacement != nodeToReplace.rightChild) {

			replacementParent.leftChild = replacement.rightChild;
			replacement.rightChild = nodeToReplace.rightChild;

		}

		return replacement;

	}
	
	// MAIN
	
	public static void main(String[] args) {
		
		BinaryTree theTree = new BinaryTree();
		
		theTree.addNode(50, "50");
		theTree.addNode(25, "25");
		theTree.addNode(15, "15");
		theTree.addNode(30, "30");
		theTree.addNode(75, "75");
		theTree.addNode(85, "85");
		
		theTree.inOrderTraverseTree(theTree.root);
		
		System.out.println();
		
		theTree.preorderTraverseTree(theTree.root);
		
		System.out.println();
		
		theTree.postOrderTraverseTree(theTree.root);
		
		System.out.println();
		
		System.out.println("Search 30 : " + theTree.findNode(30));
		
		System.out.println("REMOVE KEY 25");
		
		theTree.remove(25);
		
		theTree.postOrderTraverseTree(theTree.root);
		
	}
	
}

class Node{
	
	int key;
	String name;
	
	Node leftChild;
	Node rightChild;
	
	Node(int key, String name) {

		this.key = key;
		this.name = name;
		
	}

	@Override
	public String toString() {
		
		return name + " as a key : " + key;
		
	}
	
}
