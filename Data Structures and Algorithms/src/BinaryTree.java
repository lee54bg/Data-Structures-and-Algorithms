import java.awt.event.FocusAdapter;

public class BinaryTree {
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		
		tree.addNode(8);
		tree.addNode(4);
		tree.addNode(6);
		
		tree.inOrderTraversal(tree.getRoot());
	}
	
	private BinaryTreeNode root;
	
	public BinaryTreeNode getRoot() {
		return root;
	}
	
	public void remove(int data) {
		
		BinaryTreeNode focusNode = root;
		BinaryTreeNode parent = root;
		
		boolean isLeftChild;
		
		while(focusNode.getData() != data) {
			
		}
	}	

	public void addNode(int data) {
		BinaryTreeNode newNode = new BinaryTreeNode(data);
		
		if(root == null)
			root = newNode;
		else {
			BinaryTreeNode focusNode = root;
			BinaryTreeNode parent;
			
			while(true) {
				parent = focusNode;
				
				if(data < focusNode.getData()) {
					focusNode = focusNode.getLeftChild();
					
					if(focusNode == null) {
						parent.setLeftChild(newNode);
						break;
					}
				} else {
					focusNode = focusNode.getRightChild();
					
					if(focusNode == null) {
						parent.setRightChild(newNode);
						break;
					}
				}	
			}
		}		
	} // End of addNode
	
	public void inOrderTraversal(BinaryTreeNode focusNode) {
		if(focusNode != null) {
			inOrderTraversal(focusNode.getLeftChild());
			
			System.out.println(focusNode.getData());
			
			inOrderTraversal(focusNode.getRightChild());
		}		
	}
}
