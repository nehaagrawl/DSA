public class BST {

    public class Node {
        int element;
        Node left;
        Node right;

        public Node(int e, Node l, Node r) {
            element = e;
            left = l;
            right = r;
        }
    }

    Node root;
    public BST() {
        root = null;
    }

    public void Insert(Node troot, int e) {
        Node tmp = null;
       while(troot!=null)
        {
        tmp = troot;
        if(e== troot.element)
         return;
        else if(e< troot.element)
         troot = troot.left;
        else
               troot = troot.right;
       }
       Node n = new Node(e,null, null);
       if(root!=null) {
           if(e < tmp.element)
               tmp.left = n;
           else
               tmp.right = n;
       }
       else
           root = n;
   }

   public void Sorting(Node troot) {
       if(troot!=null) {
           Sorting(troot.left);
           System.out.print(troot.element + " ");
           Sorting(troot.right);
       }
   }

    public static void main(String args[]) {
        BST B = new BST();
        B.Insert(B.root, 50);
        B.Insert(B.root, 30);
        B.Insert(B.root, 80);
        B.Insert(B.root, 10);
        B.Insert(B.root, 40);
        B.Insert(B.root, 60);
        B.Insert(B.root, 90);
        System.out.print("Sorted order\n");
        B.Sorting(B.root);
    
       }
}
