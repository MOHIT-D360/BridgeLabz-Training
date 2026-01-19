package com.ambulanceroute;

public class HospitalUnit {
	Department head;
	Department current;
	
	Department emergency = new Department("Emergency");
	Department radiology = new Department("Radiology");
	Department surgery = new Department("Surgery");
	Department iCU = new Department("ICU");
	HospitalUnit(){		
		head = emergency;
		head.next = radiology;
		head.next.next = surgery;
		surgery.next = iCU;
		iCU.next = emergency;
		current= head;
	}
	public void putPatient(Patient p) {
		int count =0;
		while(count<4) {
			if(!current.isOpen) {
				current.isOpen = true;
				current.put(p);
				return ;
			}
			current = current.next;
			count++;
			 
		 }
		System.out.println("All departments are full");
	}
	
	public Department getCurrent() {
		return current;
	}
	
	void remove() {
		if(current.isOpen) {
			
			current.p = null;
			current.isOpen =false;
			System.out.println("Successfully removed");
			current = current.next;
		}	
		else {
			System.out.println("Already vacant");
		}
	}
	
	public void show() {
		Department temp = head;
		for(int i=0;i<4;i++) {
			if(temp.p != null) {
				
				System.out.println(temp.p.name +"  :"+ "Department  :"+temp.title);
			}
			temp= temp.next;
		}
	}
	
}
