package com.linkedlist.circularlinkedlist.roundrobin;

public class TestLinkedList {
	public static void main(String[] args) {
        RoundRobin scheduler = new RoundRobin();

        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);

        scheduler.displayQueue();

        scheduler.schedule(3);
    }
}
