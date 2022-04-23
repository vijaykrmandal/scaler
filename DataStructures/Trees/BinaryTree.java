package DataStructures.Trees;

class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}

class BinaryTree {
	Node root;

	BinaryTree() {
		root = null;
	}

	BinaryTree(int key) {
		root = new Node(key);
	}
	public int findMin(Node root){
		if(root == null) return Integer.MAX_VALUE;
		else if(root.left == null) return root.key;
		return findMin(root.left);
	} 
	public int findMax(Node root){
		if(root == null) return Integer.MAX_VALUE;
		else if(root.right == null) return root.key;
		return findMax(root.right);
	} 
	public int findHeight(Node root){
		if(root == null) return -1;
		int leftHeight = findHeight(root.left);
		int rightHeight = findHeight(root.right);
		return Math.max(leftHeight,rightHeight)+1;
	}
	public Node insert(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			return root;
		}
		if (data < root.key)
			root.left = insert(root.left, data);
		else if (data > root.key)
			root.right = insert(root.right, data);
		return root;
	}

	public void delete(int key) {
		root = deleteNode(root, key);
	}

	public Node search(Node root, int key) {
		if (root == null || root.key == key)
			return root;
		if (root.key < key)
			return search(root.right, key);
		return search(root.left, key);
	}
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " :-: ");
            inorderRec(root.right);
        }
    }
	public Node deleteNode(Node root, int data){
		if(root == null) return root;
		else if( data < root.key ) root.left = deleteNode(root.left, data);
		else if( data > root.key ) root.right = deleteNode(root.right, data);
		else{
			//case 1 : No child
			if(root.left == null && root.right == null){
				root = null;
			}
			//case 2 : 1 child
			else if(root.left == null){
				root = root.right;
			}
			else if(root.right == null){
				root = root.left;
			}
			//case 3 : 2 Children
			else{
				root.key = findMin(root.right);
				root.right = deleteNode(root.right, root.key);
			}
		}
		return root;
	}
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = tree.insert(tree.root,50);
		tree.root = tree.insert(tree.root,30);
		tree.root = tree.insert(tree.root,20);
		tree.root = tree.insert(tree.root,40);
		tree.root = tree.insert(tree.root,70);
		tree.root = tree.insert(tree.root,60);
		tree.root = tree.insert(tree.root,80);
		tree.inorderRec(tree.root);
		if(tree.search(tree.root, 10)!=null){
				System.out.println("true");
		}else{
			System.out.println("false");
		}
		System.out.println("\n Min : "+tree.findMin(tree.root));
		System.out.println("\n Max : "+tree.findMax(tree.root));
		System.out.println("\n Height : "+tree.findHeight(tree.root));
		tree.delete(20);
		tree.inorderRec(tree.root);
	}
}
