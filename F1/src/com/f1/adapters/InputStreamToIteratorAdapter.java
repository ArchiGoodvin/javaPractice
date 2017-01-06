package com.f1.adapters;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

/**
 * Created by User on 29.08.2015.
 */
public class InputStreamToIteratorAdapter implements Iterator {
    private InputStream inputStream;
    private int nextByte;
    private boolean freshByte;
   public InputStreamToIteratorAdapter(InputStream inputStream){
        this.inputStream = inputStream;
        freshByte = false;
    }
    @Override
    public boolean hasNext() {
        if(!freshByte){
            try {
                nextByte = inputStream.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            freshByte = true;
          return nextByte!=-1;
        }
        else
        return nextByte!=-1;
    }

    @Override
    public Integer next() {
        if(freshByte) {
            freshByte = false;
            return nextByte;
        }
        else
            try {
                nextByte = inputStream.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        return nextByte;

    }

    @Override
    public void remove() {
throw new UnsupportedOperationException();
    }


}
