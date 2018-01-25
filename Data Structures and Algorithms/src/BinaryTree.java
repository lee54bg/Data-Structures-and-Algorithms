
public class BinaryTree {
	private BinaryTreeNode root;
	
	public void addNode(T data) {
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
	}
}
