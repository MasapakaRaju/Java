
public class bst {
    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 5);
        root = insert(root, 2);
        root = insert(root, 3);
        root = insert(root, 1);
        root = insert(root, 4);
        root = insert(root, 6);
        root = insert(root, 7);
        display(root);
        root = delete(root, 2);
        System.out.println();
        display(root);
        System.out.println();
        if (true == search(root, 1))
            System.out.println("found");
        else
            System.out.println("not found");
    }

    static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (key == root.data) {
            return true;
        } else if (root.data < key) {
            return search(root.right, key);
        } else if (root.data > key) {
            return search(root.left, key);
        }
        return false;
    }

    static Node insert(Node root, int data) {
        if (root == null)
            root = new Node(data);
        else if (data > root.data)
            root.right = insert(root.right, data);
        else if (data < root.data)
            root.left = insert(root.left, data);
        return root;
    }

    static Node delete(Node root, int key) {
        if (root.data == key) {
            if (root.left == null && root.right == null) {
                root = null;
                return root;
            } else if (root.left == null || root.right == null) {
                if (root.right == null) {
                    return root.left;
                }
                if (root.left == null) {
                    return root.right;
                }
            } else if (root.left != null && root.right != null) {
                Node tempkey = successor(root.right);
                root.data = tempkey.data;
                root.right = delete(root.right, tempkey.data);

            }
        } else if (key < root.data)
            root.left = delete(root.left, key);
        else if (key > root.data)
            root.right = delete(root.right, key);
        return root;

    }

    static Node successor(Node root) {
        while (null != root.left)
            root = root.left;
        return root;

    }

    static void display(Node root) {
        if (null != root) {
            display(root.left);
            System.out.print(root.data + " ");
            display(root.right);
        }
    }
}

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}
