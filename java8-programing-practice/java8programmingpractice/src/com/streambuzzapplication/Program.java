package com.streambuzzapplication;
import java.util.*;


public class Program {
	
	List<CreatorStats> EngagementBoard;
	public void registerCreator(CreatorStats record) {
		if(record == null) return ;
		
		EngagementBoard.add(record);
	}

		
	public HashMap<String, Integer> GetTopPostCounts(List<CreatorStats> records, double likeThreshold){
		Map<String,Integer> counts = new HashMap<>();
		
		for(CreatorStats rec : records) {
			int count =0;
			for(int i=0;i<rec.WeeklyLikes.length;i++) {
				if(rec.WeeklyLikes[i]>=likeThreshold) {
					count++;
				}
			}
			counts.put(rec.creatorName, count);
		}
		
		return (HashMap<String, Integer>) counts;
	}
	
//	public double CalculateAverageLikes() {
		
//	}
	
}
