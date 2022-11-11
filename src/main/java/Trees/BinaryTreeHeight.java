package Trees;

public class BinaryTreeHeight {

    public static Node insert(Node root, int data) {
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


    public static void main(String[] args){
        Node root = new Node(4);
        insert(root,2);
        insert(root,6);
        insert(root,1);
        insert(root,3);
        insert(root, 5);
        insert(root, 7);

        int height = height(root);
        System.out.println("Height of tree = " + height);

    }
}
