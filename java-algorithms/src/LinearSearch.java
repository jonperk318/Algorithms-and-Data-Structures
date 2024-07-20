/*
LINEAR SEARCH: begins at one end of array and checks each element until the target element is found
Time Complexity:
    best case: O(1) (first element checked matches)
    average case: O(N)
Space complexity: O(N)
*/

import java.util.ArrayList;

public class LinearSearch {

    public static int search(ArrayList<Integer> arr, int key)
    {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == key)
                return i;
        }
        return -1; // key not found
    }

}