package part1;

public class MaxDepthBT {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 1;
        return (Math.max(maxDepth(root.left), maxDepth(root.right))) + 1;
    }
}
