import java.util.ArrayList;
import java.util.Collections;

/**
 * This class count amounts of repeating elements in collection. Before counting collection
 * is sorted.
 */
public class RepeatingElements {

  /**
   * This method sort arrayList of integers from down to up.
   *
   * @param arrayList - unsorted arrayList.
   * @return - sorted arrayList
   */
  private ArrayList<Integer> sortInputCollection(ArrayList<Integer> arrayList) {
    Collections.sort(arrayList);
    return arrayList;
  }

  /**
   * This method count amount of repeats.
   * @param arrayList unsorted arrayList.
   * @return amount repeats.
   */
  public int countAmountsRepeats(ArrayList<Integer> arrayList) {
    ArrayList<Integer> tempArrayList = arrayList;
    sortInputCollection(tempArrayList);
    int count = 0;
    int tempcount = 0;
    for (int i = 0; i < tempArrayList.size(); i++) {
      for (int j = 0; j < tempArrayList.size(); j++) {
        if (tempArrayList.get(i) == tempArrayList.get(j)) {
          tempcount++;
          tempArrayList.remove(i);
        }
      }
      if (tempcount > 1) {
        count++;
      }
      tempcount = 0;
    }
    return count;
  }
}