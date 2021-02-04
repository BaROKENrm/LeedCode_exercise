package day56;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode() {}
//    TreeNode(int val) { this.val = val; }
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}
//根据前序遍历和中序遍历构造二叉树

public class day56exercise_5 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preLen = preorder.length;
        int inLen = inorder.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < inLen; i++) {
            map.put(inorder[i],i);
        }

        return build(preorder,0,preLen - 1,0,inLen - 1,map);

    }

    private TreeNode build(int[] preorder, int preLeft, int preRight,  int inLeft, int inRight, HashMap<Integer, Integer> map) {
        if(preLeft > preLeft || inLeft > inRight){
            return null;
        }
        int val = preorder[preLeft];
        int pIndex = map.get(val);
        TreeNode root = new TreeNode(val);
        int leftStart = preLeft + 1;
        int leftEnd = pIndex + preLeft - inLeft;
        int rightStart = pIndex + preLeft - inLeft + 1;
        int rightEnd = preRight;
        root.left = build(preorder,preLeft + 1,pIndex + preLeft - inLeft,inLeft,pIndex - 1,map);
        root.right = build(preorder,pIndex + preLeft - inLeft + 1,preRight,pIndex + 1,inRight,map);
        return root;
    }


}
