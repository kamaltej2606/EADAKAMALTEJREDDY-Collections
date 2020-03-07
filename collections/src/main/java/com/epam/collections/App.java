package com.epam.collections;

@SuppressWarnings("rawtypes")
public class App extends ArrayList
{

    @SuppressWarnings("unchecked")
public static void main( String[] args )
    {
        ArrayList<Integer> list=new ArrayList();
        list.addElement(10);
        list.addElement(20);
        list.addElement(30);
        list.addElement(40);
        list.addElement(50);
        list.addElement(60);
        list.addElement(70);
        list.addElement(80);
        list.addElement(90);
        list.addElement(100);
        list.addElement(110);
        list.addElement(120);
        list.addElement(130);
        LOGGER.info(list.getElement(6));
        list.delete(5);
        list.print();
    }
}