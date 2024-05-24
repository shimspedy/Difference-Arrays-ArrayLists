# Difference-Arrays-ArrayLists

This project demonstrates the differences between arrays and ArrayLists in Java.

## Functions of Array and ArrayLists in Java
An array in Java is a fixed-size structure that holds elements of the same type. You access each element by its index, starting from 0. Arrays are great when you know how many items you need to store in advance however this can be more useful in a small program with satic arrays that dont need to change.

An ArrayList in Java is a part of the Java Collections Framework. Unlike arrays, ArrayLists can change size dynamically. They can store elements of different types as objects and offer more functions for adding, removing, and searching elements are commonly used in data colection functional way like signing up for something online or writing on a file (json)

### here are some diference&nbsp;&nbsp;


- when it comes to size Array are Fixed size which means you cannot change once set. while for ArrayList they are dynamic size since you can add elements or remove.
- Array also Stores primitive data types and objects like `int` and `chr` while with ArrayList you can Stores only objects, using wrapper classes for primitives which doesnt limit you to either having string s or intergers.
- Now when it comes to performance Array are more memory-efficient and faster. than ArrayList which slightly less efficient due to resizing and using wrapper classes and thier dynamic nature.
- Array are easy to work with but you will have with limited methods compared to ArrayList which are more flexible with many utility methods.

## Example Code

```java
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
```
