import java.util.Stack;

public class Solution {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot == null) {
            return null;
        }
        int count = 0;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode temp = null;
        while (!stack.isEmpty() || pRoot!=null) {
            while (pRoot != null) {
                stack.push(pRoot);
                pRoot = pRoot.left;
            }
            TreeNode node = stack.pop();
            count++;
            if (count == k) {
                temp = node;
            }
            pRoot = node.right;
        }
        return temp;
    }
}
