import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.List;

public class MyFirstTree {
    private final String root;
    private final List<TreeNode> child_nodes;

    public MyFirstTree(String root){
        this.root = root;
        this.child_nodes = new LinkedList<>();
    }
    public void addChild(TreeNode child_node) {
        this.child_nodes.add(child_node);
    }

    public String getValue() {
        return root;
    }

    public List<TreeNode> getChildNodes() {
        return child_nodes;
    }

    public static void main(String[] args) {
        MyFirstTree ceo = new MyFirstTree("CEO");
        MyFirstTree vice_president = new MyFirstTree("Vice President");
        MyFirstTree manager = new MyFirstTree("Manager");
        MyFirstTree developer_one = new MyFirstTree("Developer One");
        MyFirstTree developer_two = new MyFirstTree("Developer Two");
        MyFirstTree developer_three = new MyFirstTree("Developer Three");

//        ceo.addChild(vice_president);
    }
}
