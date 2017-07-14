/**
 * Created by dionysus on 13/7/17.
 */
class Node {
    int data;
    Node left, right = null;

    Node(int item){
        data = item;
        right = left = null;
    }
}
