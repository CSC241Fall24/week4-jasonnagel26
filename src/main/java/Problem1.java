// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        // TODO: Implement the concatenate method
        // This method should concatenate l2 to l1 and return l1
        // Remember to create new nodes instead of directly linking l1 to l2
        
        if(l1 == null){
            l1 = l2;
            return l1;
        }
        ListNode current = l1;
        while (current.next != null) {
            current = current.next;
        }
    
        
        ListNode l2Current = l2;
        while (l2Current != null) {
            current.next = new ListNode(l2Current.val); 
            current = current.next; 
            l2Current = l2Current.next; 
        }
    
        return l1; 

        
    }
}