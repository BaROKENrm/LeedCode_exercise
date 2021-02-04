package day56;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
     TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
         this.right = right;
     }
  }
public class day56exercise_4 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        pre(root,list);
        return list;
    }

    public void pre(TreeNode root,List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        pre(root.left,list);
        pre(root.right,list);
    }


    public void pro(TreeNode root,List<Integer> list){
        if(root == null){
            return;
        }

        pro(root.left,list);
        pro(root.right,list);
        list.add(root.val);
    }
}
