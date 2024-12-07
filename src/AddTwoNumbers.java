public class AddTwoNumbers {

    public static void main(String[] args) {
        Linkedlist node1 = new Linkedlist();
        node1.add(2);
        node1.add(4);
        node1.add(3);

        Linkedlist node2 = new Linkedlist();
        node2.add(5);
        node2.add(6);
        node2.add(4);

        Linkedlist result = addTwoNumbers(node1.head, node2.head);

        ListNode current = result.head;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    public static Linkedlist addTwoNumbers(ListNode l1, ListNode l2) {
        Linkedlist answer = new Linkedlist();
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            answer.add(sum % 10);
            carry = sum / 10;
        }

        return answer;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Linkedlist {
    ListNode head;

    public void add(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
}
