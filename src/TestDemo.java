/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-14
 * Time:20:13
 **/
public class TestDemo {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(20);
        myLinkedList.addLast(30);
        myLinkedList.addLast(20);
        myLinkedList.addLast(20);
       myLinkedList.RemoveAllKey(20);
        myLinkedList.display();
    }
}
