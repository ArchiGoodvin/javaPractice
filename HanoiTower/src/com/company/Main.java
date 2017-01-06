package com.company;

import java.util.Stack;

public class Main {
    private static final int DISKS = 6;
    private static int moves = 0;
    private static Stack<Integer> stick1 = new Stack<Integer>();
    private static Stack<Integer> stick2= new Stack<Integer>();
    private static Stack<Integer> stick3 = new Stack<Integer>();


    public static void main(String[] args) {
      startFill(DISKS);
        hanoi(DISKS, stick1, stick3, stick2);
        System.out.println("________________________");
        System.out.println("MOVES DONE: " + moves);


   }
    private static void hanoi(int disksLeft, Stack<Integer> from,Stack<Integer> to, Stack<Integer> free) {
        if (disksLeft == 1) {
            to.push(from.pop());
            System.out.println(getStack(from)+"-->"+getStack(to));
            moves++;
            return;
        }
        else
            hanoi(disksLeft-1, from, free, to);
        to.push(from.pop());
        System.out.println(getStack(from) + "-->" + getStack(to));
        moves++;
        hanoi(disksLeft - 1, free, to, from);


    }

    private static void startFill(int numOfHoops) {
        for(int i = numOfHoops;i>0;i--){
            stick1.push(i);
        }
    }
    private static int getStack(Stack<Integer> stack){
        if (stack == stick1)
            return 1;
        else if (stack == stick2)
            return 2;
        else
            return 3;

    }




}
