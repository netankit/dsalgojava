package edu.tum.cs.gaylebook.problems.removedupsull;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

// Write code to remove duplicates from an unsorted linked list

public class App {
	public static void main(String[] args) {

		LinkedList<Integer> listIn = new LinkedList<Integer>();
		listIn.add(2);
		listIn.add(9);
		listIn.add(5);
		listIn.add(6);
		listIn.add(2);
		listIn.add(8);
		listIn.add(9);
		listIn.add(8);

		LinkedList<Integer> listOut = new LinkedList<Integer>();

		listOut = removeDuplicatesUnsortedLL(listIn);

		for (Iterator iterator = listOut.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer + " ");

		}

	}

	private static LinkedList<Integer> removeDuplicatesUnsortedLL(
			LinkedList<Integer> listIn) {
		// TODO Auto-generated method stub
		LinkedList<Integer> listTemp = new LinkedList<Integer>();
		HashSet<Integer> temp = new HashSet<Integer>();
		for (Iterator<Integer> iterator = listIn.iterator(); iterator.hasNext();) {
			Integer integer = iterator.next();
			if (temp.size() == 0) {
				temp.add(integer);
				listTemp.add(integer);
				continue;
			} else {
				if (!temp.contains(integer)) {
					temp.add(integer);
					listTemp.add(integer);
				}
			}
		}

		return listTemp;
	}
}
