public class Node {

    int data;
    String color;
    Node left;
    Node right;
    Node parent;

    Node(int data){
        this.data = data;
        this.color = "RED";
        this.left = null;
        this.right = null;
        this.parent = null;
    }
}
