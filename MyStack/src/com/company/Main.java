package com.company;

import javax.xml.soap.Node;

public class Main {

    public static void main(String[] args) {
//        MyNode tail = null;
//        tail = new MyNode(1,tail);
//        tail = new MyNode(2,tail);
//        tail = new MyNode(5,tail);
//        tail = new MyNode(10,tail);
//
//       MyNode temp = tail;
//        while(temp != null){
//            System.out.println(" "+temp.value);
//            temp = temp.next;
//        }
        MyStack stack1 = new MyStack();
        stack1.add(5);
        stack1.add(1);
        stack1.add(3);
        stack1.add(2);
        stack1.printStack();
        System.out.println();
        System.out.println(stack1.getElement(4).value);


    }
}
