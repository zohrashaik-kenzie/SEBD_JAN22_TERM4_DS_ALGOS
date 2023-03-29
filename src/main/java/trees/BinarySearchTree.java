package trees;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int key) {
        root = insert(root, key);
    }

    public  Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static int height(Node root) {
        if(root == null) return -1;
        return Math.max(height(root.left)+1, height(root.right)+1);
    }

    //minNode() will find out the minimum node
    public static Node minNode(Node root) {
        if (root.left != null)
            return minNode(root.left);
        else
            return root;
    }

    //maxNode() will find out the minimum node
    public static Node maxNode(Node root) {
        if (root.right != null)
            return maxNode(root.right);
        else
            return root;
    }

    public String getOrder() {
        StringBuilder sb = new StringBuilder();
        preOrderTraversal(root, sb);
        return sb.toString();
    }

    private void preOrderTraversal(Node node, StringBuilder sb) {
        if (node != null) {

            if (sb != null) {
                sb.append(node.getData() + ";");
            }
            preOrderTraversal(node.left, sb);
            preOrderTraversal(node.right, sb);
        }
    }
}
