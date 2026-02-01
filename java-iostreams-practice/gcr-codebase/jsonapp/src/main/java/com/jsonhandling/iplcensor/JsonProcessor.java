package com.jsonhandling.iplcensor;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;
import java.io.File;
public class JsonProcessor {
	public static void processJson(String input,String output) throws Exception{
		ObjectMapper mapper = new ObjectMapper();
		ArrayNode matches = (ArrayNode) mapper.readTree(new File(input));
		ArrayNode result = mapper.createArrayNode();
		
		for(JsonNode match : matches) {
			ObjectNode obj = match.deepCopy();
			
			obj.put("team1",CensorUtil.maskTeam(match.get("team1").asText()));
			obj.put("team2",CensorUtil.maskTeam(match.get("team2").asText()));
			obj.put("winner",CensorUtil.maskTeam(match.get("winner").asText()));
			obj.put("player_of_match",CensorUtil.redactPlayer());
			
			result.add(obj);
		}
	    mapper.writerWithDefaultPrettyPrinter()
        .writeValue(new File(output), result);
	}
}
