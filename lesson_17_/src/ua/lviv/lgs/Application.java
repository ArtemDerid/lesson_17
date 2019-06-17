package ua.lviv.lgs;

import ua.lviv.lgs.Iterator.Collection;

public class Application {
	public static void main(String[] args) {
		
//		task 1.

		Integer[] array = { 23, 4546, 42, 431, 23, 5, 89, 9, 6, 4, 3, 6, 8, 5 };

		Collection collection = new Collection(array);
		Iterator iteratorForward = collection.oddToZero();

		System.out.println();
		
//		task 2.

		Integer[] array1 = { 23, 4546, 42, 431, 23, 5, 89, 9, 6, 4, 3, 6, 8, 5 };
		Collection collection1 = new Collection(array1);
		Iterator iteratorBackward = collection1.nextButOne();
		
		System.out.println();
		
//		task 3.
		
		Integer[] array2 = { 23, 4546, 42, 430, 23, 5, 89, 9, 6, 4, 3, 6, 8, 5 };
		Collection collection2 = new Collection(array2);
		Iterator iteratorAnonymous = collection2.anonymousIterator();
		iteratorAnonymous.next();
		
		System.out.println();
		
//		task 4.

		Integer[] array3 = { 23, 4546, 42, 431, 20, 30, 89, 9, 6, 40, 80, 6, 8, 5 };
		Collection collection3 = new Collection(array3);
		Iterator localIterator = collection3.localIterator();
		localIterator.next();
		
		System.out.println();
		
//		task 5.

		Integer[] array4 = { 23, 4546, 42, 431, 20, 30, 89, 9, 6, 40, 80, 6, 8, 5 };
		Collection collection4 = new Collection(array4);
		Iterator staticIterator = collection4.isNextButOneIsEven();

	}

}
