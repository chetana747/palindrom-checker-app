class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class PalindromeRecursion {

    static Node left;

    static boolean isPalindrome(Node right) {
        if (right == null)
            return true;

        boolean result = isPalindrome(right.next);
        if (!result)
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

        if (isPalindrome(head))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
