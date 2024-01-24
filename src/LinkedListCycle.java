import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LinkedListCycle {

    public static void main(String[] args) {
        LinkedListCycle obj  = new LinkedListCycle();
        obj.test();
    }

    public void test(){
        ListNode node = new ListNode(1);
        boolean output = hasCycle(node);
        System.out.println(output);
    }

     class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }
     }

    public static boolean hasCycle(ListNode head) {
        Map<ListNode,Integer> elements = new HashMap<>();
        int i=0;
        int pos=-1;
         while(head!=null && head.next!=null){
             if(elements.containsKey(head)){
                    pos=elements.get(head);
                    break;
             }
             else {
                 elements.put(head,i++);
             }
             head = head.next;
         }
        //System.out.println("position ::"+pos);
         if(pos>-1){
             return true;
         }
         return false;
    }

    public static boolean hasCycleV2(ListNode node){
        ListNode slowNode = node;
        ListNode fastNode = node;
        while(fastNode!=null && fastNode.next!=null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if(slowNode == fastNode)
                return true;
        }
        return false;
    }
}
