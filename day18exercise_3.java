package day18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
//给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
public class day18exercise_3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if(root == null){
            return ret;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> array = new ArrayList<>();
            int size = queue.size();
            for (int i = 1; i <= size ; i++) {
                TreeNode node = queue.poll();
                array.add(node.val);
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right!= null){
                    queue.offer(node.right);
                }

            }
            ret.add(array);
        }
        return ret;
    }

}
