public class Merge2Lists {
    public static void main(String[] args) {
    }

    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    //1 -> 2 -> 3
    //1-> 4 -> 5
    private ListNode merge2Lists(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode(0,null);
        ListNode tail = dummy;
        while(list1!=null && list2!=null){
            if(list1.val <= list2.val){
                tail.next = list1;
                list1 = list1.next;
            }
            else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        if(list1!=null){
            tail.next = list1;
        }
        if (list2!=null){
            tail.next = list2;
        }
        return dummy.next;
    }


}
