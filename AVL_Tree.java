public class AVL_Tree {
    static class Node{
        int data,height;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            height = 1;
        }
    }
    public static Node root;
    public static int height(Node root){
        if(root == null){
            return 0;
        }
            return root.height;
    }
    // Get Balance factor of Node
    public static int getBalance(Node root){
        if(root == null){
            return 0 ;
        }
        return height(root.left) - height(root.right);
    }
    //Right Rotate subtree rooted with y
    public static Node rightRotate(Node y){
        Node x = y.left;
        Node t2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = t2;
        // Update height
        y.height = Math.max(height(y.left),height(y.right))+1;
        x.height = Math.max(height(x.left),height(x.right))+1;

        //Return new root
        return x;
    }

    // Left Rotate subtree rooted with x - 
    public static Node leftRotate(Node x){
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation 
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left),height(x.right))+1;
        y.height = Math.max(height(y.left),height(y.right))+1;
        return y;
    }
    public static Node insert(Node root,int key){
        if(root == null){
            return new Node(key);
        }
        if(key<root.data){
            root.left = insert(root.left, key);
        }else if(key>root.data){
            root.right = insert(root.right, key);
        }else{
            return root; // Duplicate key not allowed
        }
        // Update root height
        root.height = 1+Math.max(height(root.left),height(root.right));

        // Get root's balance factor
        int bf = getBalance(root);

        // Left Left Case - 1
        if(bf>1 && key<root.left.data){
            return rightRotate(root);
        }

        // Right Right case - 2
        if(bf<-1 && key>root.right.data){
            return leftRotate(root);
        }

        // Left Right Case - 3
        if(bf > 1 && key>root.left.data){
              root .left = leftRotate(root.left);
              return rightRotate(root);
        }
        //  Right Left Case - 4
        if(bf < -1 && key<root.right.data){
            root .right = rightRotate(root.right);
            return leftRotate(root);
      }
      return root;
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        preOrder(root);
        
    }
}
