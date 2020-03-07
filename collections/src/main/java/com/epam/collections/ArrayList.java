package com.epam.collections;


import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayList<E> {
	public static final Logger LOGGER = LogManager.getLogger(App.class);
	private int size=0;
	private static int capacity=10;
	private Object num[];
	public ArrayList() {
		num=new Object[capacity];
	}
	public void addElement(E e) {
		if(size==num.length) {
			increaseSize();
		}
		num[size++]=e;
	}
	private void increaseSize() {
		int newsize=num.length*2;
		num=Arrays.copyOf(num, newsize);
	}

	@SuppressWarnings("unchecked")
	public E getElement(int i) {
		if(i<0 || i>=size) {
			throw new IndexOutOfBoundsException("Index out of range");
		}
		else {
			return (E) num[i];
		}
	}
	
	@SuppressWarnings("unchecked")
	public E delete(int i) {
		if(i<0 || i>=size) {
			throw new IndexOutOfBoundsException("Index out of range");
		}
		Object x=num[i];
		for(int k=i;k<size;k++) {
			num[i]=num[i+1];
		}
		size--;
		return (E)x;
	}
	public void print() {
		LOGGER.info("List is :");
		for(int i=0;i<size;i++) {
			LOGGER.info(num[i]+" ");
		}
	}
}
