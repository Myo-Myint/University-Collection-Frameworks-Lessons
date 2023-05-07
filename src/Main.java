public class Main {
    public static void main(String[] args) {
        MyBinaryTree myBinaryTree = new MyBinaryTree();
        myBinaryTree.root = new Node(6);
        myBinaryTree.add(4);
        myBinaryTree.add(8);
        myBinaryTree.add(3);
        myBinaryTree.add(5);
        myBinaryTree.add(7);
        myBinaryTree.add(9);

        myBinaryTree.depthFirstSearch(myBinaryTree.root);
        System.out.println("\n------------------");
        myBinaryTree.breadFirstSearch(myBinaryTree.root);

    }
}
