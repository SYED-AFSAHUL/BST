import java.util.Scanner;

/**
 * Created by dionysus on 13/7/17.
 */
public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        Node root = null;

        System.out.println("input root Node value");
        int value = input.nextInt();
        if(value != -1){
            root = new Node(value);
            treeInput(root);
        }else{
            System.out.println("No tree provided");
        }

        System.out.println("Would you like to check if the tree is BST? (y/n)");
        Character ch = input.next().charAt(0);
        if(ch.equals('y')){
            System.out.print("the tree is BST - ");
            BST bst = new BST();
            System.out.println(bst.CheckBST(root));

        }else{
            System.out.println("program complete");
        }
    }

    private static void treeInput(Node root){
        Node node = root;
        Node childNode;
        Scanner input = new Scanner(System.in);
        int value = 0,i=0;
        Node arr[] = new Node[20];
        boolean leftFilled = false;

        while (node!=null) {
            if(!leftFilled) {
                System.out.println("Enter left child value for node " + node.data);
                value = input.nextInt();
            }
            if (value != -1 && !leftFilled) {
                childNode = new Node(value);
                node.left = childNode;
                arr[i++] = node;
                node = childNode;
            }else {
                System.out.println("Enter right child value for node " + node.data);
                value = input.nextInt();
                if (value != -1) {
                    childNode = new Node(value);
                    node.right = childNode;
                    /*if(!leftFilled)
                        arr[i++] = node;*/
                    node = childNode;
                    leftFilled = false;
                }else{
                    if(i>=1) {
                        System.out.println("i is - " + i);
                        node = arr[--i];
                        leftFilled = true;
                    }else{
                        node = null;
                    }
                }
            }
        }
        System.out.println("process complete");
    }
}
