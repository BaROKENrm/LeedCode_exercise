package day18;

//        给定两个二叉树，编写一个函数来检验它们是否相同。
//        如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class day18exercise_1 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        else if(p == null || q == null){
            return false;
        }
        else if(p.val != q.val){
            return false;
        }
        else{
            return isSameTree(p.right,q.right) && isSameTree(p.left,q.left);
        }
    }
}
