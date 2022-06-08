public class LL
{
    private int size;
    private Node head;
    private Node tail;

    public LL()
    {
        this.size=0;
    }
    public void InsertFirst(int val)
    {
        Node node = new Node(val);
        node.next = head;
        head =  node;

        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void Insert(int val,int index)
    {
        if(index == 0) {
            InsertFirst(val);
            return;
        }
        if(index==size) {
            InsertLast(val);
            return;
        }
        Node temp = head;
        for(int i=1 ; i<index ; i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);   // Node temp1 = temp.next;
        temp.next=node;                        // temp.next = node ;
        size++;                                 // node.next = temp1;
    }
    public void InsertLast(int val)
    {
        if(tail==null)
        {
            InsertFirst(val);
            return;
        }
        Node node =  new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    private class Node
    {
        int value;            // int data;
        Node next;
        public Node(int data)
        {
            this.value = data;
            //this.data = data;
        }
        public Node(int data , Node next){
            this.value = data;
            this.next = next;
        }
    }
}
