class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> num1 = new Stack<>();
        Stack<Integer> num2 = new Stack<>();
        ListNode prev = new ListNode(0);
         ListNode head = prev;
        int carry = 0;
        while(l1 != null){
            num1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            num2.push(l2.val);
            l2 = l2.next;
        }
        while(!num1.isEmpty() && !num2.isEmpty()){
            if((num1.peek() + num2.peek() + carry) > 9){
                ListNode n = new ListNode((carry + num1.peek() + num2.peek())%10);
                prev.next = n;
                prev = prev.next;
                carry = 1;
            }
            else{
                ListNode n = new ListNode(carry + num1.peek() + num2.peek());
                prev.next = n;
                prev = prev.next;
                carry = 0;
            }    
            num1.pop();
            num2.pop();
        }
        while(!num1.isEmpty()){
            ListNode a;
                if(carry + num1.peek() > 9){
                    a = new ListNode((carry + num1.peek())%10);
                    carry = 1;
                }
                else{
                    a = new ListNode(carry + num1.peek());
                    carry = 0;
                }  
                prev.next = a;
                prev = prev.next;
                num1.pop();
        }
        while(!num2.isEmpty()){
             ListNode a;
                if(carry + num2.peek() > 9){
                    a = new ListNode((carry + num2.peek())%10);
                    carry = 1;
                }
                else{
                    a = new ListNode(carry + num2.peek());
                    carry = 0;
                }  
                prev.next = a;
                prev = prev.next;
                num2.pop();
        }
        if(carry == 1){
            ListNode a = new ListNode(carry);
            prev.next = a;
        }
        ListNode p = null;
        ListNode current = head.next;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = p;
            p = current;
            current = next;
        }
        return p;
     }
}