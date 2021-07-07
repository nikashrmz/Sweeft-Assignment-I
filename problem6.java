//creating class equivalent to stack
public class problem6 {
    //creating subclass node which, in this case, holds data of type string

    public static class Node{
        String data;
        Node next;
    }

    private Node headnode;

    public problem6(){
        headnode = null;
    }

    public void push(String str){
        Node newNode = new Node();
        newNode.data = str;
        if(headnode != null){
            newNode.next = headnode;

        }
        headnode = newNode;
    }

    public String pop(){
        if(headnode == null)
            return null;
        String head = headnode.data;
        headnode = headnode.next;
        return head;
    }

    public String peek(){
        if(headnode == null)
            return null;
        return headnode.data;
    }

    public boolean isEmpty(){
        if(headnode == null)
            return true;
        return false;
    }
}
