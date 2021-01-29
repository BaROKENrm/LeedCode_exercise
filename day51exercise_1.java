package day51;


//leetcode 113
import java.util.*;


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left,TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class day51exercise_1 {
    List<List<Integer>> ret = new ArrayList<>();
    Deque<Integer> deque = new ArrayDeque<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
         dfs(root,targetSum);
         return ret;
    }
    public void dfs(TreeNode root,int sum){

        if(root == null){
            return;
        }

        sum -= root.val;
        deque.offerLast(root.val);

        if(root.left == null && root.right == null && sum == 0){
            ret.add(new ArrayList<>(deque));
        }

        dfs(root.left,sum);
        dfs(root.right,sum);
        deque.pollLast();

    }
}
























