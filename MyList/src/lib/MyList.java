package lib;

/**
 * Created by User on 30.07.2015.
 */
public class MyList {
    private MyNode currentNode;


    public void addToTail(int value) {
        currentNode = new MyNode(value, currentNode);
    }

    public int getTail() {
        return currentNode.getValue();
    }

    public int getNext() {
        return currentNode.getNext().getValue();
    }

    public int length() {
        MyNode temp = currentNode;
        int counter = 0;
        while (temp.hasNext()==true){
         counter++;
            temp = temp.getNext();
        }
        return counter+1;
    }
    private int max(int a, int b){
        if(a>b){
            return a;
        }
        else
            return b;
    }
    public void addToHead(int value){
        MyNode temp = currentNode;
        while (temp.hasNext()==true){
            temp = temp.getNext();
        }
        temp.setNext(new MyNode(value, null));
    }
    public void printList(){
        print(currentNode);


    }

    private void print(MyNode element) {

        if (element.hasNext()==false){
            System.out.println(element.getValue());
            return;
        }
        else
        System.out.println(element.getValue());
        print(element.getNext());
        return;
    }
    public void remove(int index){
       MyNode previous = null;
        MyNode next = null;
        MyNode temp = currentNode;
        for (int i = 0; i<=index;i++) {
            if (i == index - 1) {
                previous = temp;
            } else if(i==index) {
                next = temp.getNext();
                temp.setNext(null);
            }
            else
                temp = temp.getNext();
        }
        previous.setNext(next);



    }

}




