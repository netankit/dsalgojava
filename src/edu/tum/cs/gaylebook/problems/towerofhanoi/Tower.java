package edu.tum.cs.gaylebook.problems.towerofhanoi;

import java.util.Stack;

//Classic Tower of Hanoi Problem -- Solved using Recursive Approach
public class Tower {
	private final int index;
	private final Stack<Integer> disks;

	// Constructor Definition
	public Tower(int i) {
		// TODO Auto-generated constructor stub
		disks = new Stack<Integer>();
		index = i;
	}

	public static void main(String[] args) {
		int n = 3;
		Tower[] towers = new Tower[n];
		for (int i = 0; i < n; i++) {
			towers[i] = new Tower(i);
		}
		for (int i = n - 1; i >= 0; i--) {
			towers[0].add(i);
		}
		// Origin.movedisk(numOFDisks, Destination, Buffer )
		towers[0].moveDisks(n, towers[2], towers[1]);
	}

	private void moveDisks(int n, Tower destination, Tower buffer) {
		// Three steps for moving all disks from origin to destination.
		if (n > 0) {
			moveDisks(n - 1, buffer, destination);
			moveTopTo(destination);
			buffer.moveDisks(n - 1, destination, this);
		}

	}

	private void moveTopTo(Tower t) {
		int top = disks.pop();
		t.add(top);
		System.out.println("Move disk " + top + " from Tower:" + index()
				+ " to Tower:" + t.index());
	}

	private int index() {
		return index;
	}

	private void add(int d) {
		if (!disks.isEmpty() && disks.peek() <= d) {
			System.out.println("Error placing disk " + d);
		} else {
			disks.push(d);
		}
	}
}
