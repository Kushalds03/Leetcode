public class Leetcode203{
    static class Node{ 
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
        public static Node removeElement(Node head,int val){
            Node dummy = new Node(0);
            Node curr = dummy;
            dummy.next = head;
            while(curr.next!=null){
                if(curr.next.data == val){
                    curr.next = curr.next.next;
                }else{
                    curr = curr.next;
                }
            }
            return dummy.next;
            
}
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(6);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(6);
        int val = 6;
       
        Node result  = removeElement(head,val);
        System.out.println("Modified List");

        Node temp = null;
        temp = result;
        while(temp!=null){
    
            System.out.print(temp.data + (temp.next!=null? "->":" "));
            temp = temp.next;
        }
        System.out.println();
    

        
    }
}