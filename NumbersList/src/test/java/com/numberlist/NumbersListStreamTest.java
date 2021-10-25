package com.numberlist;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class NumbersListStreamTest
{
	/**
	 * Rigorous Test :-)
	 */

	@Test
	public void afterSortingElementsShouldReturnSortedList()
	{
		List<String> NumberStore = Arrays.asList("10", "25", "23", "55", "10", "23", "25", "33", "65", "46", "12");
		List<String> SortedList = Arrays.asList("10", "12", "23", "25", "33", "46", "55", "65");
		assertEquals(SortedList, NumbersListStream.ListSortingMethod(NumberStore));
	}
}
