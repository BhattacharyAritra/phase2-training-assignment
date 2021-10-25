package com.numberlist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class NumbersListStream 
{
	public static void main( String[] args ) throws IOException
	{
		Path path = Paths.get(System.getProperty("user.dir")).resolve("numbers.csv");
		BufferedReader reader = new BufferedReader(new FileReader(path.toFile()));
		List<String> NumberStore = new ArrayList<>();
		String line = reader.readLine();

		while (line != null) {
			NumberStore.add(line);
			line = reader.readLine();
		}

		//		List<List<String>> CombinedList = Arrays.asList(NumberStore);
		//		List<String> ExtractedList = CombinedList.stream().flatMap(i -> i.stream()).collect(Collectors.toList());
		//		List<String> SortedList = ExtractedList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		//		SortedList.stream().distinct().forEach(System.out::println);

		//		NumbersListStream sortObj = new NumbersListStream();

		ListSortingMethod(NumberStore).forEach(System.out::println);
	} 

	static List<String> ListSortingMethod(List<String> NumberStore){

		List<List<String>> CombinedList = Arrays.asList(NumberStore);
		List<String> ExtractedList = CombinedList.stream().flatMap(i -> i.stream()).collect(Collectors.toList());
		List<String> SortedList = ExtractedList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		return SortedList.stream().distinct().collect(Collectors.toList());

	}
}
