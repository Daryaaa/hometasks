import java.util.Random;

//Operates on strings for change them above the task

public class StringChanges {

  //Generates random numbers, that are needed for changes

  public void randomNumbers(Strings input) {
    Random random = new Random();
    int firstIndex = random.nextInt(input.first.length());
    int firstLength = random.nextInt(input.first.length() - firstIndex);
    int secondIndex = random.nextInt(input.second.length());
    int secondLength = random.nextInt(input.second.length() - secondIndex);
    makeChanges(input, firstIndex, firstLength, secondIndex, secondLength);
  }

  //Splits string for 3 fragments and return array of this 3 fragments

  private String[] splitForThreeFragments(String stringForCut, int firstIndexFragment,
                                          int lengthFragment) {
    int lastIndexFragment = firstIndexFragment + lengthFragment;
    String[] splitString = new String[3];
    splitString[0] = stringForCut.substring(0, firstIndexFragment);
    splitString[1] = stringForCut.substring(firstIndexFragment, lastIndexFragment);
    splitString[2] = stringForCut.substring(lastIndexFragment, stringForCut.length());
    return splitString;
  }

  //Replace random fragment from one string by another random fragment from another string

  private void makeChanges(Strings input, int firstIndex, int firstLength,
                           int secondIndex, int secondLength) {
    String[] firstSplit = splitForThreeFragments(input.first, firstIndex, firstLength);
    String[] secondSplit = splitForThreeFragments(input.second, secondIndex, secondLength);
    input.first = firstSplit[0] + secondSplit[1] + firstSplit[2];
  }
}