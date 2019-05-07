class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode t2 = head;
        int len = 0;
        while(t2!=null)
        {
            len++;
            t2 = t2.next;
        }
        if(len<k)
        {
            return head;
        }
        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;
        int i = 0;
        ListNode prev = null;
        ListNode current = head, t1 = null;
        while(current != null){
            t1 = current;
            int count = 0;
            while(current != null && count != k){
                st.push(current);
                current = current.next;
                count++;
            }
            if(count == k){
                while(!st.isEmpty()){
                    if(prev == null){
                        prev = st.peek();
                        head = prev;
                        st.pop();
                    }
                    else{
                        prev.next = st.pop();
                        prev = prev.next;
                    }
                }
                prev.next = null;
            }
            else{
                prev.next = t1;
            
            }
        }
        
        
        return head;
       
    }
}