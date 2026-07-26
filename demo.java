import java.util.*;


class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

class Linked{
    public static Node convertToLL(int[] nums) {
        Node head = new Node(nums[0]);
        Node mover = head;
        for (int i = 1; i < nums.length; i++) {
            Node temp = new Node(nums[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    static Node deleteHead(Node head){
        Node temp = head;
        head = temp.next;
        
        return head;
    }

    static Node deleteTail(Node head){
        Node mover = head;

        while(mover.next.next != null){
            mover = mover.next;
        }
        mover.next = null;
        // head = mover;
        return head;
    }

    static Node deleteByPos(Node head, int n){
        Node mover = head;

        for(int i=0; i<n-1; i++){
            mover = mover.next;
        }
        
        if (mover == null || mover.next == null)
        return head;

        mover.next = mover.next.next;
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
        Node head = Linked.convertToLL(nums);
        System.out.println(head.data);
        Node temp = head;
        int count=0;

        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
            count++;
        }
        int count1 = 0;
        System.out.println("\nAfter deletion of head");
        Node temp1 = Linked.deleteHead(head);
        while (temp1 != null) {
            System.out.print(temp1.data + " ");
            temp1 = temp1.next;
            count1++;
        }

        System.out.println("\nAfter deletion by position at 2");
        Node temp3 = Linked.deleteByPos(head, 2);
        while (temp3 != null) {
            System.out.print(temp3.data + " ");
            temp3 = temp3.next;
            // count2++;
        }
        
        int count2 = 0;
        System.out.println("\nAfter deletion of Tail");
        Node temp2 = Linked.deleteTail(head);
        while (temp2 != null) {
            System.out.print(temp2.data + " ");
            temp2 = temp2.next;
            count2++;
        }
        
        
        System.out.println("\nLength of linked list: " + count);
        System.out.println("Length of linked list after deletion: " + count1);
    }
}