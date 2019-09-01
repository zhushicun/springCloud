package com.shawn.desigener.desigenernew.Iterator;

public class NameRepository implements Container {
    public String[] name=new String[]{"A","B","C"};
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    public class NameIterator implements Iterator{

        int index;

        @Override
        public Boolean hasNext() {
            if(index<name.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return name[index++];
        }
    }
}
