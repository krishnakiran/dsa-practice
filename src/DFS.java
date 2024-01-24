import com.sun.source.tree.Tree;

public class DFS {

    class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
    }
    public static void main(String[] args) {

    }
    public void inorder(TreeNode root){
        if(root == null)
            return;
        inorder(root.left);
        System.out.println(root.value);
        inorder(root.right);
    }

    public void preorder(TreeNode root){
        if(root == null)
            return;
        System.out.println(root.value);
        preorder(root.left);
        preorder(root.right);
    }

    public void postOrder(TreeNode root){
        if(root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.value);
    }



}
