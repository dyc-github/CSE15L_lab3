import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ListTests {
    @Test
    public void testFilter(){
        StringChecker sc = new StringChecker() {
            @Override
            public boolean checkString(String s) {
                return s.charAt(0) == 'a';
            }
        };

        List<String> list1 = new ArrayList<String>(Arrays.asList(new String[]{}));
        List<String> expected1 = new ArrayList<String>(Arrays.asList(new String[]{}));

        List<String> list2 = new ArrayList<String>(Arrays.asList(new String[]{"hello", "world"}));
        List<String> expected2 = new ArrayList<String>(Arrays.asList(new String[]{}));

        List<String> list3 = new ArrayList<String>(Arrays.asList(new String[]{"apple", "bapple", "astro"}));
        List<String> expected3 = new ArrayList<String>(Arrays.asList(new String[]{"apple", "astro"}));

        Assert.assertEquals(expected1, ListExamples.filter(list1, sc));
        Assert.assertEquals(expected2, ListExamples.filter(list2, sc));
        Assert.assertEquals(expected3, ListExamples.filter(list3, sc));
    }

    @Test
    public void testMerge(){
        List<String> list1A = new ArrayList<String>(Arrays.asList(new String[]{}));
        List<String> list1B = new ArrayList<String>(Arrays.asList(new String[]{}));
        List<String> expected1 = new ArrayList<String>(Arrays.asList(new String[]{}));

        List<String> list2A = new ArrayList<String>(Arrays.asList(new String[]{}));
        List<String> list2B = new ArrayList<String>(Arrays.asList(new String[]{"a", "b"}));
        List<String> expected2 = new ArrayList<String>(Arrays.asList(new String[]{"a", "b"}));

        List<String> list3A = new ArrayList<String>(Arrays.asList(new String[]{"a", "b"}));
        List<String> list3B = new ArrayList<String>(Arrays.asList(new String[]{}));
        List<String> expected3 = new ArrayList<String>(Arrays.asList(new String[]{"a", "b"}));

        List<String> list4A = new ArrayList<String>(Arrays.asList(new String[]{"a", "c"}));
        List<String> list4B = new ArrayList<String>(Arrays.asList(new String[]{"a", "b"}));
        List<String> expected4 = new ArrayList<String>(Arrays.asList(new String[]{"a", "a", "b", "c"}));


        Assert.assertEquals(expected1, ListExamples.merge(list1A, list1B));
        Assert.assertEquals(expected2, ListExamples.merge(list2A, list2B));
        Assert.assertEquals(expected3, ListExamples.merge(list3A, list3B));
        Assert.assertEquals(expected4, ListExamples.merge(list4A, list4B));
    }
}
