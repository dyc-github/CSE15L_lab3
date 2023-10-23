import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] input2 = { 1, 2, 3 };
    int[] input3 = { 1, 2, 3, 4 };
    int[] input4 = { 3, 1, 3 };
    ArrayExamples.reverseInPlace(input1);
    ArrayExamples.reverseInPlace(input2);
    ArrayExamples.reverseInPlace(input3);
    ArrayExamples.reverseInPlace(input4);
    assertArrayEquals(new int[]{ 3 }, input1);
    assertArrayEquals(new int[]{ 3, 2, 1 }, input2);
    assertArrayEquals(new int[]{ 4, 3, 2, 1}, input3);
    assertArrayEquals(new int[]{ 3, 1, 3 }, input4);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] input2 = { 1, 2, 3 };
    int[] input3 = { 1, 2, 3, 4 };
    int[] input4 = { 3, 1, 3 };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{ 3, 2, 1 }, ArrayExamples.reversed(input2));
    assertArrayEquals(new int[]{ 4, 3, 2, 1}, ArrayExamples.reversed(input3));
    assertArrayEquals(new int[]{ 3, 1, 3 }, ArrayExamples.reversed(input4));
  }

  @Test
  public void testAverageWithoutLowest(){
    //Larry's test
    double[] input1 = { 1, 1, 10 };
    //My tests
    double[] input2 = {};
    double[] input3 = {1};
    double[] input4 = { 1, 2, 3 };
    assertEquals(5, ArrayExamples.averageWithoutLowest(input1), .01);
    assertEquals(0, ArrayExamples.averageWithoutLowest(input2), .01);
    assertEquals(0, ArrayExamples.averageWithoutLowest(input3), .01);
    assertEquals(2.5, ArrayExamples.averageWithoutLowest(input4), .01);
  }
}
