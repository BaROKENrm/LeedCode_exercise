package day71;

// leetcode 剑指 Offer 26. 树的子结构
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left,TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class day71exercise_3 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A == null || B == null)  return false;


        return helper(A,B) || isSubStructure(A.left,B) || isSubStructure(A.right,B);
    }


    public boolean helper(TreeNode A, TreeNode B){
        if(B == null) return true;
        if(A == null || A.val != B.val) return false;

        return helper(A.left,B.left) && helper(A.right,B.right);
    }
}
