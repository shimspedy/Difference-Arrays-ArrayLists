// Difference-Arrays-ArrayLists.java
import java.util.ArrayList;

public class DifferenceArraysArrayLists {
    public static void main(String[] args) {
        // Array example
        int[] intArray = new int[4]; // Fixed size array
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        intArray[3] = 40;
        
        System.out.println("Array elements starts here :");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        
        // Attempt to add more elements (this will cause an error) this will happen because the array index is limited to 5 
        // intArray[4] = 50; // if you run this line will cause ArrayIndexOutOfBoundsException

        // ArrayList example this arrray is not limited to any number of index
        ArrayList<Integer> intArrayList = new ArrayList<>(); // Dynamic size ArrayList
        intArrayList.add(100);
        intArrayList.add(200);
        intArrayList.add(300);
        intArrayList.add(400);
        intArrayList.add(500);
        
        System.out.println("ArrayList elements starts here:");
        for (int i = 0; i < intArrayList.size(); i++) {
            System.out.println(intArrayList.get(i));
        }
        
        // Add more elements to ArrayList this will not affect the array because there is no limit
        intArrayList.add(600);
        intArrayList.add(890);
        
        System.out.println("full ArrayList after you add some elements :");
        for (int i = 0; i < intArrayList.size(); i++) {
            System.out.println(intArrayList.get(i));
        }
    }
}
