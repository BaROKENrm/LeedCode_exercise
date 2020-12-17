package day18;
//给定一个二叉树，找出其最大深度。
//二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。

//class TreeNode{
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    public TreeNode(int val) {
//        this.val = val;
//    }
//
//    public TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}
public class day18exercise_2 {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftLength = maxDepth(root.left);
        int rightLength = maxDepth(root.right);
        return Math.max(leftLength,rightLength) + 1;
    }
}
