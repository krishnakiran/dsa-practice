import com.sun.source.tree.Tree;

public class BinaryTree {

    public static void main(String[] args) {
        TreeNode node1= new TreeNode();
        node1.val=1;
        TreeNode node2= new TreeNode();
        node2.val=3;

        TreeNode root= new TreeNode(2,node1,node2);
        BinaryTree bt = new BinaryTree();
        bt.invertTree(root);
    }
    public void invertTree(TreeNode root) {
        if(root.left!=null || root.right !=null){
            swapNodes(root);
            invertTree(root.left);
            invertTree(root.right);
        }
    }

    private void swapNodes(TreeNode node){
        TreeNode temp = node.left;
        node.left = node.right;
        node.right=temp;
    }

}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
          this.left = left;
          this.right = right;
      }

}
