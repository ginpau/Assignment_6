import java.util.LinkedList;
import java.util.Queue;

public class EncryptedBinaryTree {

    public static void main(String[] args){
        EncryptedBinaryTree obj = new EncryptedBinaryTree();

        int[] bt = {-2, -2, -1, -2, -1};
        int t = 1;
        System.out.println(obj.findElement(bt, t));

        int[] bt2 = {-2, -2, -2, -2, -1};
        int t2 = 13;
        System.out.println(obj.findElement(bt2, t2));

        int[] bt3 = {-2, -2, -1, -2, -1};
        int t3 = 99;
        System.out.println(obj.findElement(bt3, t3));

        int[] bt4 = {-1};
        int t4 = 1;
        System.out.println(obj.findElement(bt4, t4));
    }

    public boolean findElement(int[] bt, int t){
        if(bt == null || bt[0] == -1){
            return false;
        }

        Queue<Integer> indexQueue = new LinkedList<>();
        Queue<Integer> valueQueue = new LinkedList<>();

        indexQueue.add(0);
        valueQueue.add(1);

        while(!indexQueue.isEmpty()){

            int i = indexQueue.poll();
            int x = valueQueue.poll();

            if(i >= bt.length){
                continue;
            }

            if(bt[i] == -1){
                continue;
            }

            if(x == t){
                return true;
            }

            indexQueue.add(2*i + 1);
            valueQueue.add(3*x + 1);

            indexQueue.add(2*i + 2);
            valueQueue.add(2*x + 5);

        }

        return false;
    }
}
