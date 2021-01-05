package ru.progwards.java2.lessons.generics;

public class ArraySort <T extends Comparable<T>> {
	
	private T [] data ;
	
	public  void sort () {
		for(int i =0; i< data.length; i++) {
			
			for(int j = i+1 ; j< data.length; j++) {
					if(data[i].compareTo(data[j]) == 1) {
						T tmp = data[i];
						data[i] = data[j];
						data[j] = tmp;
					}
			}
		}
	}

}
