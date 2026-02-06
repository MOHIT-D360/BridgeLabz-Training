package com.streamsapi;
import java.util.*;
import java.util.stream.*;

class Insurance{
	String type;
	double clam;
	Insurance(String type,double clam){
		this.type = type;
		this.clam = clam;
		
	}
	public String toString() {
		return type;
	}
}
public class InsuranceClaimAnalysier {
	public static void main(String[] args) {
		List<Insurance> list = new ArrayList<>();
		list.add(new Insurance("health",2300));
		list.add(new Insurance("health",4300));
		list.add(new Insurance("life",5300));
		list.add(new Insurance("health",6300));
		list.add(new Insurance("term",2200));
		list.add(new Insurance("term",2100));
		list.add(new Insurance("life",9000));
		
		Map<String,Double> avgClaimByType = list.stream()
				.collect(
						Collectors.groupingBy(
								i->i.type,
								Collectors.averagingDouble(i->i.clam)
								)
						);
		avgClaimByType.forEach(
			(type,avg)-> System.out.println(type+ " Average Claim :"+avg));
				

	
	}
}
