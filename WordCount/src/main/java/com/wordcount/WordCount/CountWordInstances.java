package com.wordcount.WordCount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class CountWordInstances 
{
	public static void main( String[] args ) throws IOException
	{
		Path path = Paths.get(System.getProperty("user.dir")).resolve("questions.txt");
		BufferedReader reader = new BufferedReader(new FileReader(path.toFile()));
		Map<String, Integer> frequency = new HashMap<>();
		String line = reader.readLine();
		System.out.println("Occurences: "+WordCountMapping(reader, line, frequency));
	}

	static Map<String, Integer> WordCountMapping(BufferedReader reader, String line, Map<String, Integer> frequency) throws IOException{

		while(line != null) {

			if (!line.trim().equals("")) {
				String [] words = line.split(" ");	

				for (String word : words) {
					if (word == null || word.trim().equals("")) {
						continue;
					}

					String processed = word.toLowerCase();

					if (frequency.containsKey(processed)) {
						frequency.put(processed, frequency.get(processed) + 1);						
					}
					else {
						frequency.put(processed, 1);
					}
				}
			}
			line = reader.readLine();			
		}
		return frequency;
	}
}
