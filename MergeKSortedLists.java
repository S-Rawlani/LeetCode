class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        PriorityQueue<ListNode> min = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>(){
            @Override
            public int compare (ListNode a, ListNode b){
                if(a.val > b.val)
                    return 1;
                else if (a.val < b.val)
                    return -1;
                else
                    return 0;
        }
        });
        for(int i = 0 ; i < lists.length; i++){
            while(lists[i] != null){
                min.add(lists[i]);
                lists[i] = lists[i].next;
            }
        }
        if(min.isEmpty())
        {
            return null;
        }
        ListNode node = min.poll();
        ListNode head = node;
        while(!min.isEmpty()){
            node.next = min.poll();
            node = node.next;
            
        }
        node.next = null;
        return head;
    }
}