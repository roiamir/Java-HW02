package relayware.java.training.java_HW02;

import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.TestCase;

public class HW02Test extends TestCase {
	@Test
	public void testGetSumOfNumbers_SimpleString_Calculated() {
		int actual = HW02.getSumOfNumbers("12 some text 3  7");
		int expected = 22;
		assertEquals(expected, actual);
	}

	@Test
	public void testGetSumOfNumbers_SimpleString2_Calculated() {
		int actual = HW02.getSumOfNumbers("1 2 3 aa1a 3");
		int expected = 9;
		assertEquals(expected, actual);
	}

	@Test
	public void testGetSumOfNumbers_zero() {
		int actual = HW02.getSumOfNumbers("a1 b2 c3 aa1a d3");
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetSumOfNumbers_NegatveNumber() {
		int actual = HW02.getSumOfNumbers("ab 23 cd -23 ef 1");
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetSumOfNumbers_EmptyString() {
		int actual = HW02.getSumOfNumbers("");
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void testGetSumOfNumbers_null() {
		int actual = HW02.getSumOfNumbers(null);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void testSortIgnoringSpaces_SimpleArray_Calculated() {
		String[] actual = {"a", " c", "b"};
		HW02.sortIgnoringSpaces(actual);
		String[] expected = {"a", "b", " c"};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testSortIgnoringSpaces_null() {
		String[] actual = null;
		HW02.sortIgnoringSpaces(actual);
		String[] expected = null;
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testSortIgnoringSpaces_empty (){
		String[] actual = {};
		HW02.sortIgnoringSpaces(actual);
		String[] expected = {};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testSortIgnoringSpaces_SimpleArray2(){
		String[] actual = {" bb ", "aa", " vv ", "cc "};
		HW02.sortIgnoringSpaces(actual);
		String[] expected = {"aa", " bb ", "cc ", " vv "};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testSortIgnoringSpaces_SecondCharacter(){
		String[] actual = {" ba ", "bg ", " bb ", " bcc "};
		HW02.sortIgnoringSpaces(actual);
		String[] expected = {" ba ", " bb ", " bcc ", "bg "};
		assertArrayEquals(expected, actual);
	}
}
