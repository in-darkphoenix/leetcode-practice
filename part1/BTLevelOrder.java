package part1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BTLevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lo = new ArrayList<>();
        if (root == null)
            return lo;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.removeFirst();
                l.add(temp.val);
                if (temp.left != null)
                    queue.addLast(temp.left);
                if (temp.right != null)
                    queue.addLast(temp.right);
            }
            lo.add(l);

        }
        return lo;

    }
}
