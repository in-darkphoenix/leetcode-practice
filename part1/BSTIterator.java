package part1;

import java.util.ArrayDeque;
import java.util.Deque;

// https://leetcode.com/problems/binary-search-tree-iterator/

public class BSTIterator {

    Deque<TreeNode> s = new ArrayDeque<TreeNode>();

    public BSTIterator(TreeNode root) {
        fill(root);
    }

    public int next() {
        TreeNode temp = s.pop();
        fill(temp.right);
        return temp.val;
    }

    public boolean hasNext() {
        return !s.isEmpty();
    }

    private void fill(TreeNode node) {
        while (node != null) {
            s.push(node);
            node = node.left;
        }
    }
}
