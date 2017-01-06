package lib;

import javax.xml.soap.Node;

/**
 * Created by User on 30.07.2015.
 */
public class MyNode {
   private int value;
    private MyNode next;


   public MyNode(int value, MyNode next){
        this.value = value;
        this.next = next;

    }

    public int getValue(){return value;}
    public MyNode getNext(){return next;}
    public boolean hasNext(){
        if (next != null){
            return true;
        }
        else {
            return false;
        }

    }
    public void setNext(MyNode next){
        this.next = next;
    }



}
