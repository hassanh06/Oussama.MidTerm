package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> cars = new LinkedList<>();

		cars.add("corola");
		cars.add("camry");
		cars.add("sonata");
		cars.add("elentra");
		cars.add("rav4");
		cars.add("fusion");

		System.out.println("Elements in cars are: " + cars);

		cars.remove();
		System.out.println("Elements in cars after using remove: " + cars);

		System.out.println("The head element of cars is: "+ cars.peek());

		cars.poll();
		System.out.println("Elements in cars after using poll: " + cars);

		System.out.print("\nThe Queue items using For Each: ");
		for(String item: cars)
			System.out.print(item + ", ");

		System.out.print("\nThe Queue items using iterator: ");
		Iterator<String> iter = cars.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + ", ");


		}
	}

}
