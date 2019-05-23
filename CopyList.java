class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)
            return null;
        Node current = head;
        Node node = head;
        while(current != null)
        {
            Node temp = current.next;
            Node copy = new Node(current.val, current.next, current.random);
            current.next = copy;
            copy.next = temp;
            current = current.next.next; 
        }
        while(node != null)
        {
            if(node.random != null){
                node.next.random = node.random.next;
                node = node.next.next;
            }
            else{
                node = node.next;
            }
        }
        Node newHead = head;
        Node copyHead = head.next;
        Node currentHead = head.next;
        while(newHead.next != null)
        {
            Node temp = newHead.next;
            Node temp1 = newHead.next.next;
            newHead.next = temp1;
            newHead = currentHead;
            currentHead = temp1;
        }
        return copyHead;
    }
}