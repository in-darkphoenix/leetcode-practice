package part1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

// https://leetcode.com/problems/binary-tree-inorder-traversal/

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {

    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Deque<TreeNode> d = new ArrayDeque<TreeNode>();
        TreeNode node = root;

        while (node != null || !d.isEmpty()) {

            while (node != null) {
                d.push(node);
                node = node.left;
            }

            node = d.pop();
            list.add(node.val);
            node = node.right;
        }

        return list;
    }
}
