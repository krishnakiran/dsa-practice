import java.util.ArrayDeque;

public class BFS {
    class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
    }

    public static void main(String[] args) {

    }

    private static void BFS(TreeNode root){
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levelLength = queue.size();
            for (int i = 0; i < levelLength; i++) {
                TreeNode treeNode = queue.removeFirst();
                System.out.println(treeNode.value);
                if (treeNode.left != null)
                    queue.addLast(treeNode.left);
                if (treeNode.right != null)
                    queue.addLast(treeNode.right);
            }
        }
    }
}
