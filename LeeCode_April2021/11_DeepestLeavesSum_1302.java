/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return root.val;
        }
        Queue<TreeNode> prime = new LinkedList<>();
        Queue<TreeNode> secon = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0, count = 0;
        prime.add(root);
        while(!prime.isEmpty()){
            TreeNode curr = prime.poll();
            if(curr.left!=null){
                secon.add(curr.left);
                sum += curr.left.val;
            }
            if(curr.right!=null){
                secon.add(curr.right);
                sum += curr.right.val;
            }
            if(prime.isEmpty()){
                
                Queue<TreeNode> temp = prime;
                prime = secon;
                secon = temp;
                arr.add(sum);
                sum = 0;
            }
        }
        return arr.get(arr.size()-2);
    }
}