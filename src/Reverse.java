import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * A class for reversing List and array types.
 *
 * @author PUT YOUR NAME HERE
 * @version 2017-08-09
 */
public class Reverse {

    /**
     * Return a reversed copy of the argument array.
     * The passed array is NOT mutated.
     *
     * @param array An array.
     * @return A reversed copy of array.
     */
    public int[] reversed(int[] array) {
        int numberOfOperations= 0;
        int[] anotherArray= array.clone();
        for(int i = 0; i < anotherArray.length / 2; i++)
        {
            int temp = anotherArray[i];
            anotherArray[i] = anotherArray[anotherArray.length - i - 1];
            anotherArray[anotherArray.length - i - 1] = temp; // reverse the index of two mirrored elements in the array.
            numberOfOperations++; // counts the number of operations
        }
        return anotherArray;
    }

    /**
     * Return a reversed copy of the argument List.
     * The passed List is NOT mutated.
     *
     * @param list A List.
     * @return A reversed copy of list.
     */
    public List<Integer> reversed(List<Integer> list) {
        int numberOfOperations= 0;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i =list.size(); i>=0; i--)
            arrayList.add(list.get(i)); // fills a new arraylist with the elements of the old list but in reversed order
        numberOfOperations++; // counts the number of operations
        return arrayList;
    }
}
