/*
 * [707] Design Linked List
 */


class MyLinkedList {

    class ListNode {
        int val;
        ListNode next;
        
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    
    private ListNode head;

    public MyLinkedList() {
        head = null;
    }
    
    public int get(int index) {
        if (index < 0 || head == null) {
            return -1;
        }
        
        ListNode current = head;
        for (int i = 0; i < index; i++) {
            if (current.next == null) {
                return -1;
            }
            current = current.next;
        }
        
        return current.val;
    }
    
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }
    
    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        
        if (head == null) {
            head = newNode;
            return;
        }
        
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        
        current.next = newNode;
    }
    
    public void addAtIndex(int index, int val) {
        if (index <= 0) {
            addAtHead(val);
            return;
        }
        
        ListNode newNode = new ListNode(val);
        ListNode current = head;
        
        for (int i = 0; i < index - 1; i++) {
            if (current == null) {
                return;
            }
            current = current.next;
        }
        
        if (current == null) {
            return;
        }
        
        newNode.next = current.next;
        current.next = newNode;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || head == null) {
            return;
        }
        
        if (index == 0) {
            head = head.next;
            return;
        }
        
        ListNode current = head;
        
        for (int i = 0; i < index - 1; i++) {
            if (current == null) {
                return;
            }
            current = current.next;
        }
        
        if (current == null || current.next == null) {
            return;
        }
        
        current.next = current.next.next;
    }
}


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */


