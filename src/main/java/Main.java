import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    String[] arr = {"aaa", "bb", "cccc", "1"};
        System.out.println(Arrays.toString(arr));
    swapElements(arr, 2, 3);
        System.out.println(Arrays.toString(arr));
}

    private static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static <E> List<String> convertToList(E[] array) {
        return (List<String>) Arrays.asList(array);

    }
}
