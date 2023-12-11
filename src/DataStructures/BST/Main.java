package DataStructures.BST;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(7));
        tree.insert(new Node(2));
        tree.insert(new Node(9));
        tree.display();
        System.out.println("EOL");
        System.out.println(tree.search(1));
    }
}
