import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;

class IsMoon implements StringChecker {
  public boolean checkString(String s) {
    return s.equalsIgnoreCase("moon");
  }
}

public class TestListExamples {

  @Test
  public void testFilter(){
    List<String> strInputs = new ArrayList<>(Arrays.asList("Sailormoon", "MOON", "moons", "mOOn"));
    List<String> actual = ListExamples.filter(strInputs, new IsMoon());
    List<String> expected = new ArrayList<>(Arrays.asList( "MOON", "mOOn"));
    assertArrayEquals(expected, actual);
  }

  @Test(timeout = 500)
  public void testMergeRightEnd() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("a", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, merged);
  }
}
