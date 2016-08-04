import java.io.*;

public class TestSort {
	public static void main(String[] args) throws IOException {
		Integer[] values = { 2, 4, 9, 5, 3, 7, 10, 6, 8, 1 };
		Integer[] values1 = { 22, 55, 69, 87, 24, 18, 1, 28, 11 };
		Integer[] values2 = { 90, 85, 75, 60, 55, 47, 36, 25, 18, 11 };
		Sorting<Integer> sort = new Sorting<Integer>();
		// int count = 2000;
		// Integer[] array = new Integer[count];
		PrintStream outPut = new PrintStream(new File("output.txt"));
		System.setOut(outPut);
		
		/* 
		 * Random random = new Random(); for (int i = 0; i < array.length; i++)
		 * array[i] = new Integer(random.nextInt());
		 */
		System.out.println("Instertion Sort test: ");
		System.out.println("Best case: ");
		sort.insertionSort(values);
		System.out.println("Sorted list :");
		for (Integer line : values)
			System.out.print(line + " ");
		System.out.println();

		System.out.println("Worst case: ");
		sort.insertionSort(values1);
		System.out.println("Sorted list :");
		for (Integer line : values1)
			System.out.print(line + " ");
		System.out.println();

		System.out.println("Average case: ");
		sort.insertionSort(values2);
		System.out.println("Sorted list :");
		for (Integer line : values2)
			System.out.print(line + " ");
		System.out.println("\n");

		System.out.println("Selection Sort test: ");
		System.out.println("Best case: ");
		sort.selectionSort(values);
		System.out.println("Sorted list :");
		for (Integer line : values)
			System.out.print(line + " ");
		System.out.println();

		System.out.println("Worst case: ");
		sort.selectionSort(values1);
		System.out.println("Sorted list :");
		for (Integer line : values1)
			System.out.print(line + " ");
		System.out.println();

		System.out.println("Average case: ");
		sort.selectionSort(values2);
		System.out.println("Sorted list :");
		for (Integer line : values2)
			System.out.print(line + " ");
		System.out.println("\n");

		System.out.println("Bubble Sort test: ");
		System.out.println("Best case: ");
		sort.bubbleSort(values);
		System.out.println("Sorted list :");
		for (Integer line : values)
			System.out.print(line + " ");
		System.out.println();

		System.out.println("Worst case: ");
		sort.bubbleSort(values1);
		System.out.println("Sorted list :");
		for (Integer line : values1)
			System.out.print(line + " ");
		System.out.println();

		System.out.println("Average case: ");
		sort.bubbleSort(values2);
		System.out.println("Sorted list :");
		for (Integer line : values2)
			System.out.print(line + " ");
		System.out.println();

	}
}
