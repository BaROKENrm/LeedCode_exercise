package day45;

import java.util.*;
//给定一个二叉树，返回其节点值的锯齿形层序遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）


//leetcode 103

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class day45exercise_2 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ret =  new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();
        if(root == null){
            return null;
        }
       int flag = 1;
        deque.add(root);
        List<Integer> list = null;
        while(!deque.isEmpty()){
            int size = deque.size();
            list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.poll();
                list.add(node.val);
                if(node.left != null){
                    deque.offerFirst(node.left);
                }
                if(node.right != null){
                    deque.offerFirst(node.right);
                }
            }
            if(flag % 2 != 0){
                Collections.reverse(list);
            }
            flag++;
            ret.add(list);
        }
        return ret;
    }
}

