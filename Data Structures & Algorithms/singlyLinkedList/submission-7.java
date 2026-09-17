class LinkedList {

    Node head;  

    private static class Node{
        int val;
        Node next = null;

    
        public Node(int val){
            this.val = val;        
            next = null;
        }
    }

    

    public LinkedList() {
        head = null;

    }

    public int get(int index) {
        Node curr = head;
        if(head==null) return -1;
        for (int i =0; i < index; i++){
            if(curr.next !=null){
                curr = curr.next;
            } else return -1;
            
        }
        return curr.val;
    }

    public void insertHead(int val) {
        Node temp = new Node(val);
        temp.next = head;
        this.head = temp;        
        System.out.println(getValues());
    }

    public void insertTail(int val) {
        if(head == null){
            head = new Node(val);
            return;
        }
        Node curr = head;
        while(curr.next !=null){
                curr = curr.next;
        }
        Node tail = new Node(val);
        curr.next = tail;
        System.out.println(getValues());
    }

    public boolean remove(int index) {
        if (head==null){
            return false;
        }
        if (index == 0) {
            head = head.next;
            return true;
        }
        Node curr = head;
        Node previous= head;
         for (int i=0; i < index; i++){
            if(curr.next !=null){
                previous = curr;
                curr = curr.next;
            } else return false;            
        }
        previous.next = curr.next;
        System.out.println(getValues());
        return true;
    }

    public ArrayList<Integer> getValues() {
        Node curr = head;
        ArrayList<Integer> list = new ArrayList<>();
            while(curr !=null){
                list.add(curr.val);
                curr = curr.next;
        }
        return list;
    }
}
