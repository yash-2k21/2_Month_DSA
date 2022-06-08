public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.InsertFirst(3);
        list.InsertFirst(5);
        list.InsertFirst(4);
        list.InsertFirst(9);
        list.InsertFirst(6);
        list.InsertLast(99);
        list.Insert(7,3);
        list.display();
    }
}
