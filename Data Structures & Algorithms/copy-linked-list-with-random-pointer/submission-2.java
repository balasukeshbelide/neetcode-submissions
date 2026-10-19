/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {

    public void print(Node node) {
        while(node!=null) {
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.println(" ");
    }

    public Node copyRandomList(Node head) {
        if(head==null) return head;
        if(head.next==null) {
            Node res = new Node(head.val);
            res.random = head.random;
        }

        Node ptr = head;
        while(ptr!=null) {
            Node newNode = new Node(ptr.val);
            newNode.next = ptr.next;
            ptr.next = newNode;
            ptr = ptr.next.next;
        }
        ptr = head;
        Node res = head.next;
        while(ptr!=null) {
            if(ptr.random==null) ptr.next.random = null;
            else ptr.next.random = ptr.random.next;
            ptr = ptr.next.next;
        }
        ptr = head;
        while(ptr!=null && ptr.next!=null) {
            Node temp = ptr.next.next;
            if(temp==null) break;
            ptr.next.next = temp.next;
            ptr.next = temp;
            ptr = ptr.next;
        }
        ptr.next=null;
        return res;
    }
}
