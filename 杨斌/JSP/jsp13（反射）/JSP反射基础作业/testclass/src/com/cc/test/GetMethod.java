package com.cc.test;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Random;

public class GetMethod {

	/**
	 * @param args
	 */
	 public static void swap(Integer[] arr, int i, int j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	 public static <T> void testSortMethod(Class<T> clazz) throws Exception { 
		 Random random = new Random(); 
		 Integer[] arr = new Integer[20]; 
		 for (int i = 0; i < arr.length; i++) { 
			 arr[i] = random.nextInt(100); 
			 } System.out.println(Arrays.toString(arr));
			 Method sortMethod = clazz.getMethod("sort", Integer[].class); 
			 sortMethod.invoke(clazz.newInstance(), (Object) arr); 
			 System.out.println(Arrays.toString(arr)); boolean flag = true; 
			 for (int i = 1; i < arr.length; i++) { 
				 if (!flag) { 
					 break; 
					 } 
				 if (arr[i] < arr[i - 1]) { 
					 flag = false; 
					 } 
				} 
			 System.out.println("arr is sorted : " + flag); 

		}
	}

