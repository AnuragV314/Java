package LinkedList;

// with java package/Api

import java.util.LinkedList;

public class JavaLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<Integer>();
        num.add(10);
        num.add(11);
        num.add(12);
        num.add(13);

        System.out.println(num);
    }
}

/*
 * When To Use ?
 * Use an ArrayList for storing and accessing data,
 * and LinkedList to manipulate data.
 */

/*
 * LinkedList Methods:
 * 
Method	Description	

addFirst()	Adds an item to the beginning of the list.	
addLast()	Add an item to the end of the list	
removeFirst()	Remove an item from the beginning of the list.	
removeLast()	Remove an item from the end of the list	
getFirst()	Get the item at the beginning of the list	
getLast()	Get the item at the end of the list
 */
