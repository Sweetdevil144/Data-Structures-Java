package DataStructures.BST;

public class BinarySearchTree {
    Node root;

    public void insert(Node node) {
        root = insertHelper(root, node);
    }

    private Node insertHelper(Node root, Node node) {
        int data = node.data;
        if (root == null) {
            root = node;
            return root;
        } else if (data < root.data) {
            root.left = insertHelper(root.left, node);
        } else {
            root.right = insertHelper(root.right, node);
        }
        return root;
    }

    public void display() {
        displayHelper(root);
        System.out.println();
    }

    private void displayHelper(Node root) {
        if (root != null) {
            displayHelper(root.left);
            System.out.print(root.data + " ");
            displayHelper(root.right);
        }
    }

    public boolean search(int data) {
        return searchHelper(root, data);
    }

    private boolean searchHelper(Node root, int data) {
        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else {
            if (root.data > data) return searchHelper(root.left, data);
            else return searchHelper(root.right, data);
//            return searchHelper(root.left,data) || searchHelper(root.right,data) ;
        }
    }

    public void remove(int data) {
        if (search(data)) {
            root = removeHelper(root, data);
        } else System.out.println(data + "cannot be found");
    }

    private Node removeHelper(Node root, int data) {
        if (root == null) return root;
        else if (data < root.data) return removeHelper(root.left, data);
        else if (data > root.data) return removeHelper(root.right, data);
        else {
            if(root.left==null && root.right==null) {
                root=null;
            } else if(root.right!=null) {
                // find a successor to replace this node
                root.data=successor(root);
                root.right=removeHelper(root.right, root.data);
            } else {
                // find a predecessor to replace this node
                root.data=predecessor(root);
                root.left=removeHelper(root.left, root.data);
            }
        }
        return root;
    }

    private int successor(Node root) {
        root=root.right;
        while(root.left != null) {
            root=root.left;
        }
        return root.data;
    }

    private int predecessor(Node root) {
        root=root.left;
        while(root.right != null) {
            root=root.right;
        }
        return root.data;
    }
}
