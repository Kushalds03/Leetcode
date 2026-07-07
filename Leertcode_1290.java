public class Leertcode_1290{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;

        }
    }

    public static int getDecimalValue(Node head){
            int sum = 0;
            Node curr = head;
            while(curr!=null){
                sum = (sum*2)+curr.data;
                curr = curr.next;
            }
            return sum;
    }

    public static void main (String args[]){
           Node head = new Node(1);
           head.next = new Node(0);
           head.next.next = new Node(1);
           int result = getDecimalValue(head);
           System.out.println("The result is "+result);

    }

}