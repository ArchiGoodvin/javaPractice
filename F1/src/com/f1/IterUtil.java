package com.f1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by User on 29.08.2015.
 */
public class IterUtil implements Iterator {
    public static Iterator<Integer> merge(Iterator<Integer> one, Iterator<Integer> two){
        return new IterUtil(one, two);
    }

    Iterator<Integer> one;
    Iterator<Integer> two;
    Integer oneValue;
    Integer twoValue;
    Iterator<Integer> lastIter;
    boolean oneValueExists;
    boolean twoValueExists;
   IterUtil(Iterator<Integer> one, Iterator<Integer> two){
        this.one = one;
        this.two = two;
        oneValueExists = one.hasNext();
        twoValueExists = two.hasNext();
        try {
            oneValue = one.next();
            twoValue = two.next();
        }
        catch (NoSuchElementException e){
            //NOP
        }

    }

    @Override
    public boolean hasNext() {
        if(oneValueExists||twoValueExists)
            return true;
        else
            return false;
    }

    @Override
    public Integer next() {
        Integer result = 0;
        if (oneValueExists&&twoValueExists) {
            if (oneValue <= twoValue) {
                result = oneValue;
                try {
                    oneValue = one.next();
                } catch (NoSuchElementException e) {
                    oneValueExists = false;
                }

            } else if (oneValue > twoValue) {
                result = twoValue;
                try {
                    twoValue = two.next();
                } catch (NoSuchElementException e) {
                    twoValueExists = false;

                }
            }
        }
        else if(oneValueExists&&!twoValueExists) {
            result = oneValue;
            try {
                oneValue = one.next();
            } catch (NoSuchElementException e) {
                oneValueExists = false;
            }
        }
        else {
            if (!oneValueExists && twoValueExists) {
                result = twoValue;
                try {
                    twoValue = two.next();
                } catch (NoSuchElementException e) {
                    twoValueExists = false;

                }
            }
        }


        return result;
    }

    private void nextValue(Iterator<Integer> iter) {
        oneValue = one.next();

    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();

    }
}
