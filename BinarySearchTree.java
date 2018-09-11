
class BinarySearchTree {

    static Node root;

    public BinarySearchTree(Node root) {
        this.root = root;
    }

    boolean isLeaf(Node current) {
        if (current.left == null & current.right == null) {
            return true;
        } else {
            return false;
        }
    }

    Node find(Node current, Integer object) {
        if (current.data.equals(object)) {
            return current;
        }
        if (current == null) {
            return null;
        }
        if (object > current.data) {
            return (find(current.right, object));
        } else {
            return (find(current.left, object));
        }
    }

    void insertInLeafNode(Node current, Integer newData) {
        Node node = new Node(newData);
        if (newData <= current.data) {
            current.left = node;
        } else {
            current.right = node;
        }
    }

    void viewPreOrder(Node current) {
        if (current != null) {
            System.out.print(current.data + " ");
            viewPreOrder(current.left);
            viewPreOrder(current.right);

        }
    }

    void viewInOrder(Node current) {
        if (current == null) {
            return;
        }
        viewInOrder(current.left);
        System.out.print(current.data + " ");
        viewInOrder(current.right);
    }
    
    void viewPostOrder(Node current){
        if(current == null){
            return;
        }
        viewPostOrder(current.left);
        viewPostOrder(current.right);
        System.out.print(current.data + " ");
    }
    
    public static void main(String args[]) {
        BinarySearchTree tree = new BinarySearchTree(root);
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.left.left = new Node(4);
        tree.insertInLeafNode(root.left.left, 9);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.insertInLeafNode(root.left.right.left, 2);
        tree.root.left.right.right = new Node(14);
        tree.root.right = new Node(22);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(25);
        tree.root.right.right.left = new Node(21);
        tree.root.right.right.right = new Node(30);

        System.out.println("Preorder Traversal: ");
        tree.viewPreOrder(root);
        
        System.out.println("\n\nInorder Traversal: ");
        tree.viewInOrder(root);
        
        System.out.println("\n\nPostorder Traversal: ");
        tree.viewPostOrder(root);
    }
}
