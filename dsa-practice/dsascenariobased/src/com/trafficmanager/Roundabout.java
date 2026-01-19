package com.trafficmanager;

public class Roundabout {
	NodeVehicle head = null;
	 
	void addCar(String number) {
		NodeVehicle newVehicle = new NodeVehicle(number);
		
		if(head == null) {
			head = newVehicle;
			newVehicle.next = head;
			
		}
		else {
			NodeVehicle temp = head;
			while(temp.next != head) {
				temp = temp.next;
			}
			temp.next = newVehicle;
			newVehicle.next= head;
			
		}
		System.out.println(number+"Entered in roundabout");
		
	}
	void removeCar() {
		if(head == null) {
			System.out.println("roundabout is empty");
			return ;
		}
		if(head.next == head) {
			System.out.println(head.number+" exit");
			head = null;
					return;
		}
		NodeVehicle temp = head;
		while(temp.next != head) {
			temp = temp.next;
			
		}
		System.out.println(head.number+" exit");
		temp.next = head.next;
		head = head.next;
		
		
	}
	void display() {
        if (head == null) {
            System.out.println("Roundabout empty");
            return;
        }

        NodeVehicle temp = head;
        System.out.print("Roundabout State: ");
        do {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }

}
