package com.lambdaexpressions.customsortinginecommerce;

import java.util.Comparator;

public interface PriceComparator<Shop> extends Comparator<Shop>{
	public int compare(Shop p1,Shop p2) ;
		
	

}
