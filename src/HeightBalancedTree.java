public class HeightBalancedTree {

    public static void main(String[] args) {
        HeightBalancedTree obj = new HeightBalancedTree();
        obj.test();
    }

    public void test(){
        //3,9,20,null,null,15,7
        TreeNode input = new TreeNode(3);
        input.left = new TreeNode(9);
        input.right = new TreeNode(20);
        input.right.left = new TreeNode(15);
        input.right.right = new TreeNode(7);
        boolean output = isBalancedTree(input);
        System.out.println(output);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    private int calculateHeight(TreeNode root){
        if(root == null)
            return 0;
        int leftHeight = calculateHeight(root.left);
        int rightHeight = calculateHeight(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }

    private boolean isBalancedTree(TreeNode root){
        if(root==null)
            return true;

        int leftHeight = calculateHeight(root.left);
        int rightHeiglt = calculateHeight(root.right);

        boolean leftBalanced = isBalancedTree(root.left);
        boolean rightBalanced = isBalancedTree(root.right);

        if(Math.abs(leftHeight-rightHeiglt)<=1 && leftBalanced && rightBalanced)
            return true;
        return false;
    }
}


