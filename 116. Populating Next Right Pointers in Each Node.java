Runtime: 5 ms, faster than 20.26% of Java online submissions for Populating Next Right Pointers in Each Node.
class Solution {
    public Node connect(Node root) {
        if(root == null){
            return null;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            Node rightNode = null;
            for(int i = q.size(); i > 0; i--) {
                Node curr = q.poll();
                curr.next = rightNode;
                rightNode = curr;
                if(curr.right != null) {
                    q.offer(curr.right);
                    q.offer(curr.left);
                }
            }
        }
        return root;        
    }
}
