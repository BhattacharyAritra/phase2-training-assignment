package com.wordcount.WordCount;

import static org.junit.Assert.assertEquals;

//import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//import static org.junit.Assert.assertTrue;

//import java.util.HashMap;
//import java.util.Map;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class WordCountTest 
{
	/**
	 * Rigorous Test :-)
	 */
//	@Test
//	public void shouldReturnWithCountofEachWordInaMap() throws IOException
//	{
//		Map<String, Integer> inputMap = new HashMap<>(), outputMap = new HashMap<>();
//		Path path = Paths.get(System.getProperty("user.dir")).resolve("questions.txt");
//		BufferedReader reader = new BufferedReader(new FileReader(path.toFile()));
//		String line = reader.readLine();
//
//		inputMap.put("numbers", 4);
//		inputMap.put("write", 3);
//		inputMap.put("from", 1);
//		inputMap.put("it", 5);
//		inputMap.put("model", 3);
//		inputMap.put("(for", 1);
//		inputMap.put("create", 3);
//		inputMap.put("deploy", 1);
//		inputMap.put("input", 2);
//		inputMap.put("java", 4);
//		inputMap.put("using", 6);
//		inputMap.put("streams", 1);
//
//		assertEquals(inputMap, CountWordInstances.WordCountMapping(reader, line, outputMap));
//	}

	@Test
	public void ReadFromFileTest() throws IOException{

		Path path = Paths.get("questions.txt");
		assertEquals(true, Files.exists(path));
		assertEquals(true, Files.isReadable(path));
	}
}
