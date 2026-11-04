package com.qa.utilities;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JSONReader {
	
	public static JsonNode getUser(String userType) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode root = mapper.readTree(
                new File("src/test/resources/users.json"));

        return root.get(userType);
    }

}
