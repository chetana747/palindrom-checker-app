class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
    }
}

public class PalindromeRecursion {

    static Node left;

    static boolean check(Node right) {
        if (right == null)
            return true;

        if (!check(right.next))
            return false;

        if (left.data != right.data)
            return false;

        left = left.next;
        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        left = head;

        if (check(head))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
