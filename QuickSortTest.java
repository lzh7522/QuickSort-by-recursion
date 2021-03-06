import java.util.Arrays;

public class QuickSortTest {
	public static void main(String[] args) {
		int[] arr1 = new int[] { 4, 4, 6, 5, 3, 2, 8, 1 };
		QuickSortDoubleCirculation test1 = new QuickSortDoubleCirculation();
		test1.quickSort(arr1, 0, arr1.length - 1);
		System.out.println(Arrays.toString(arr1));

		int[] arr2 = new int[] { 4, 4, 6, 5, 3, 2, 8, 1 };
		QuickSortSingleCirculation test2 = new QuickSortSingleCirculation();
		test2.quickSort(arr2, 0, arr2.length - 1);
		System.out.println(Arrays.toString(arr2));
	}
}
