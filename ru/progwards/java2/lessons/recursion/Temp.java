//package ru.progwards.java2.lessons.recursion;
//
//import java.util.Arrays;
//
//public class Temp {
////	public String reverseChars(String str){
////    if(str.length() == 0) 
////    {
////        return str;
////    }
////    System.out.print(str.substring( str.length()-1));
////    return reverseChars(str.substring(0, str.length()-1));
////}
//	
//	int [] array = {0,1,5,8,0,3};
//	
//	for(int i = 0; i<array.length; i++) {
//		System.out.println (array[i]);
//	}
//		 
//	System.out.println(Arrays.toString(array));
//	int [] cp = Arrays.copyOf(array, array.length);
//	System.out.println(Arrays.toString(cp));
//	Arrays.sort(cp);
//	System.out.println(Arrays.toString(cp));
//	
//	
//	for(int i = 0; i< array.length; i++) {
//		// desc
//		for (int j = i+1; j < array.length; j++) {
//			if(array[i] < array[j]) {
//				int tmp = array[i];
//				array[i] = array[j];
//				array[j] = tmp;
//			}
//		}
//		System.out.println("step");
//		System.out.println(Arrays.toString(array));
//	}
//	
//	System.out.println(Arrays.equals(array, cp));
//	// deepEquals для двумерных
//}
