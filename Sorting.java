
public class Sorting<T extends Comparable<T>> {
	int comparisons = 0, exchanges = 0;

	// insertion sorting
	public void insertionSort(T[] list) 
	{
		for (int i = 1; i < list.length; i++) {
			T key = list[i];
			int j = i;

			while (j > 0 && (list[j - 1].compareTo(key) > 0)) {
				comparisons++;
				list[j] = list[j - 1];
				j--;
				exchanges++;
			}
			list[j] = key;
		}
		System.out.println("Number of comparisons: " + comparisons);
		System.out.println("Number of exchanges: " + exchanges);
	}

	// selection sorting
	public void selectionSort(T[] list) 
	{
		int min;
		int n = list.length;
		for (int i = 0; i < n - 1; i++) {
			min = i;
			for (int j = i + 1; j < n; j++){
				comparisons++;
			if (list[j].compareTo(list[min]) < 0)
				min = j;
		}
			T temp = list[min];
			list[min] = list[i];
			list[i] = temp;
			exchanges++;
		}
		System.out.println("Number of comparisons: " + comparisons);
		System.out.println("Number of exchanges: " + exchanges);
	}

	// bubble sorting
	public void bubbleSort(T[] list) 
	{
		int n = list.length;
		T temp;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - 1); j++) {
				comparisons++;
				if (list[j - 1].compareTo(list[i]) > 0) {
					temp = list[j - 1];
					list[j - 1] = list[j];
					list[j] = temp;
					exchanges++;
				}
			}
		}
		System.out.println("Number of comparisons: " + comparisons);
		System.out.println("Number of exchanges: " + exchanges);
	}
}
