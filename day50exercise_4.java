package day50;

//leetcode 129 
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class day50exercise_4 {

    public int sumNumbers(TreeNode root) {
        return dfs(root,0);
    }
     public int dfs(TreeNode root, int pre){
        if(root == null){
            return 0;
        }
        int ret = pre * 10 + root.val;
        if(root.left == null || root.right == null){
            return ret;
        }
        else {
            return dfs(root.left,ret) + dfs(root.right,ret);
        }
     }
}
