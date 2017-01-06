package com.company;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

/**
 * Created by User on 04.02.2016.
 */
public class MyStack {
    private static MyNode tail;

    MyStack(){
        this.tail = null;
    }
    public MyNode getTail(){return tail;}
    public int getTailValue(){return tail.value;}

    public void add(int elem){
        tail = new MyNode(elem, tail);
    }
    public void remove(){
        if (tail != null)
        tail = tail.next;
    }
    public MyNode getElement(int ind){
        if(tail == null) throw new EmptyStackException();
        MyNode curElem = tail;
        int i = 0;
        while(curElem != null){
            if(i == ind) return  curElem;
            else {
                curElem = curElem.next;
                i++;
            }
        }
        if(curElem == null) throw new IndexOutOfBoundsException();
        return null;
    }
    public void printStack(){
        if (tail == null){
            System.out.println("Empty stack");
        }
        else
            printIter(tail);
            return;
        }
    private void printIter(MyNode curElem){
        if(curElem == null) return;
        else {
            System.out.println(curElem.value);
            printIter(curElem.next);
        }
    }

}
