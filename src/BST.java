/**
 * Created by dionysus on 13/7/17.
 */
class BST {

    boolean CheckBST(Node root){
        boolean leftChecked = false;
        Node node = root;
        Node arr[] = new Node[20];
        int i=0;

        while (node!=null){
            if(node.left != null && !leftChecked) {
                if (node.data > node.left.data) {
                    arr[i++] = node;
                    node = node.left;
                } else {
                    return false;
                }
            }else{
                //node = arr[--i];
                if(node.right != null){
                    if(node.data < node.right.data){
                       // arr[i++] = node;
                        node = node.right;
                        leftChecked = false;
                    } else {
                        return false;
                    }
                }else{
                    if(i>=1){
                        node = arr[--i];
                        leftChecked = true;
                    }else{
                        node = null;
                    }
                }

            }

        }
        return true;
    }
}
