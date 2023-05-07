import java.util.LinkedList;
import java.util.Queue;

public class MyBinaryTree {
    public Node root;

    //adding to the tree
    private Node addRecursive(Node current_node, int value){
        if (current_node == null) {
            return new Node(value);
        }else if(value<current_node.value) {
            current_node.left = addRecursive(current_node.left, value);
        } else if (value>current_node.value) {
            current_node.right = addRecursive(current_node.right, value);
        }else {
            return current_node;
        }
        return current_node;
    }
    public Node add(int value){
        return addRecursive(root,value);
    }


    /**
     * <strong><i>Depth-first-search</i> </strong>is
     * a type of traversal that goes deep as much as possible in every child before exploring the next sibling.
     */
    public void depthFirstSearch(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            depthFirstSearch(node.left);
            depthFirstSearch(node.right);
        }
    }

    /**
     *<strong><i>Depth-first-search</i> </strong>
     * visits all the nodes of a level before going to the next level.
     */
    public void breadFirstSearch(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {

            Node node = nodes.remove();

            System.out.print(" " + node.value);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }
    }

}

class Node{
    public int value;
    public Node left,right;
    public Node(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}