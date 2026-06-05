import java.util.*;

class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
    }
}

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Node head = null, tail = null;

        for (int i = 0; i < n; i++) {
            Node temp = new Node(sc.nextInt());

            if (head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
            }
        }

        k %= n;

        if (k > 0) {

            Node newTail = head;

            for (int i = 1; i < n - k; i++) {
                newTail = newTail.next;
            }

            Node newHead = newTail.next;

            newTail.next = null;
            newHead.prev = null;

            tail.next = head;
            head.prev = tail;

            head = newHead;
        }

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}