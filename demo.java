import java.util.*;


class Node {
    Node prev;
    int data;
    Node next;

    Node(int data1) {
        this.prev = null;
        this.data = data1;
        this.next = null;
    }

    Node(int data1, Node next1) {
        this.prev = null;
        this.data = data1;
        this.next = next1;
    }
    Node(Node prev1, int data1) {
        this.prev = prev1;
        this.data = data1;
        this.next = null;
    }
    Node(Node prev1, int data1, Node next1) {
        this.prev = prev1;
        this.data = data1;
        this.next = next1;
    }
}


class doubleLinked{
    static Node convertToDLL(int[] nums){
        Node head = new Node(nums[0]);
        Node mover = head;
        mover.prev = null;

        for(int i=1; i<nums.length; i++){
            Node temp = new Node(nums[i]);
            mover.next = temp;
            temp.prev = mover;
            mover = temp;
        }
        return head;
    }

    //insertion at head

    static Node insertHead(Node head, int val){
        Node temp = new Node(val);

        if(head == null){
            return temp;
        }

        head.prev = temp;
        temp.next = head;
        head = temp;
        return head;
    }

    //reversal of linked list

    static Node reverse(Node head){

        if(head == null || head.next == null) return head;
        Node current = head;
        Node last = null;
        while (current != null) {
            last = current.prev;
            current.prev = current.next;
            current.next = last;

            current= current.prev;
        }
        head = last.prev;
        return head;
    }
}
public class demo {
  public static void main(String[] args) {
        // int[] nums = { 2, 4, 7, 8 };
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        Node head = doubleLinked.convertToDLL(nums); 
        System.out.println(head.data);
        // Node temp = doubleLinked.insertHead(head, 23);
        Node temp = doubleLinked.reverse(head);
        int count=0;

        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
            count++;
        }  
    }
}