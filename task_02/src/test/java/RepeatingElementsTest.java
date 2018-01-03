import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RepeatingElementsTest {
  RepeatingElements repeatingElements = new RepeatingElements();
  ArrayList<Integer> user = new ArrayList<Integer>();
  @Test
  public void countAmountsRepeats(){
    user.add(7); user.add(8); user.add(9); user.add(3); user.add(7);
    user.add(0); user.add(0); user.add(0);user.add(0);
    assertEquals(repeatingElements.countAmountsRepeats(user), 2);
  }
}