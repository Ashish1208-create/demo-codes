import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            Node temp = new Node(x);

            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        tail.next = head; // make circular

        int k = sc.nextInt();

        Node curr = head;
        Node prev = tail;

        while (curr != curr.next) {

            for (int i = 1; i < k; i++) {
                prev = curr;
                curr = curr.next;
            }

            prev.next = curr.next; // delete kth node
            curr = curr.next;
        }

        System.out.println(curr.data);
    }
}