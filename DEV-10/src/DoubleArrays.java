import java.util.ArrayList;

/**
 * This class make array, that contains only non unique nembers from two-dimensional array.
 */
public class DoubleArrays {

  /**
   * Compare two double numbers with precision 1e-10.
   * @param first - double number.
   * @param second - double number.
   * @return result of comparing.
   */
  private boolean compare(double first, double second) {
    return Math.abs(first - second) < 1e-9;
  }

  /**
   * Check if there has a number in the arraylist
   * @param list - arraylist, that is checked
   * @param num - number, that is looking for
   * @return - result of cheking.
   */
  private boolean has(ArrayList<Double> list, double num) {
    for (int i = 0; i < list.size(); i++) {
      if (compare(list.get(i), num)) {
        return true;
      }
    }
    return false;
  }

  /**
   * Transform array from ArrayList.
   * @param list - arrayList, that is transformed to array.
   * @return - array, that is result of transforming arrayList to array.
   */
  private double[] makeArrayFromList(ArrayList<Double> list) {
    double[] outputArray = new double[list.size()];
    for (int i = 0; i < list.size(); i ++) {
      outputArray[i] = list.get(i);
    }
    return outputArray;
  }

  /**
   * Remove duplicates of one array.
   * @param inputArray - array, that is checked for duplicates.
   * @return array without duplicates.
   */
  private double[] removeNonUnique(double[] inputArray) {
    ArrayList<Double> tempOutputList = new ArrayList<Double>();
    for (int i = 0; i < inputArray.length; i++) {
      if (!has(tempOutputList, inputArray[i])) {
        tempOutputList.add(inputArray[i]);
      }
    }
    return makeArrayFromList(tempOutputList);
  }

  /**
   * Merge two-dimensional array in one array. Each array of two-dimensional array
   * duplicates is removed.
   * @param inputArray - two-dimensional array, that is inputed in main.
   * @return - array, that contains arrays without duplicates of two-dimensional array.
   */

  private double[] mergeArrays(double[][] inputArray) {
    ArrayList<Double> tempOutputList = new ArrayList<Double>();
    for (int i = 0; i < inputArray.length; i++) {
      double[] arrayWithoutDuplicates = removeNonUnique(inputArray[i]);
      for (int j = 0; j < arrayWithoutDuplicates.length; j++) {
        tempOutputList.add(arrayWithoutDuplicates[j]);
      }
    }
    return makeArrayFromList(tempOutputList);
  }

  /**
   * Looking for non unique numbers in array and make array of this non unique numbers.
   * @param inputArray - two-dimensional array, that is inputed in main.
   * @return - array with only non unique elements.
   */

  public double[] arrayOfOnlyDuplicates(double[][] inputArray) {
    double[] removedDuplicatesAndMerged = mergeArrays(inputArray);
    ArrayList<Double> tempList = new ArrayList<>();
    ArrayList<Double> tempOutputList = new ArrayList<>();
    for (int i = 0; i < removedDuplicatesAndMerged.length; i++) {
      if (has(tempList, removedDuplicatesAndMerged[i])) {
        tempOutputList.add(removedDuplicatesAndMerged[i]);
        tempList.add(removedDuplicatesAndMerged[i]);
      } else {
        tempList.add(removedDuplicatesAndMerged[i]);
      }
    }
    return removeNonUnique(makeArrayFromList(tempOutputList));
  }
}