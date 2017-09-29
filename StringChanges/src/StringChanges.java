import java.util.Random;
/**
 * This class is for replacing one piece in one string by other piece from another
 */
public class StringChanges {

  /**
   * Generate random numbers
   * @param args is strings that will be changed
   * @return result changing from another method
   */
  public String randomNumbers(String[] args){
    if(args.length != 2){
      throw new IllegalArgumentException();
    }
    Random random = new Random();
    int firstIndex = random.nextInt(args[0].length());
    int firstLength = random.nextInt(args[0].length() - firstIndex);
    int secondIndex = random.nextInt(args[1].length());
    int secondLength = random.nextInt(args[1].length() - secondIndex);
    return makeChanges(args, firstIndex, firstLength, secondIndex, secondLength);
  }

  /**
   * This method splits string for 3 pieces
   * @param stringForCut is string that will be cut
   * @param firstIndexFragment is index when cutting starts
   * @param lengthFragment is length of cutting piece
   * @return array of pieces contained in string at first
   */
  private String[] splitForThreeFragments(String stringForCut, int firstIndexFragment,
                                          int lengthFragment) {
    int lastIndexFragment = firstIndexFragment + lengthFragment;
    String[] splitString = new String[3];
    splitString[0] = stringForCut.substring(0, firstIndexFragment);
    splitString[1] = stringForCut.substring(firstIndexFragment, lastIndexFragment);
    splitString[2] = stringForCut.substring(lastIndexFragment, stringForCut.length());
    return splitString;
  }

  /**
   * Replace random fragment from one string by another random fragment from another string
   * @param args two strings from command line
   * @param firstIndex - index starting first random fragment
   * @param firstLength - length first random fragment
   * @param secondIndex - index starting second random fragment
   * @param secondLength - length second random fragment
   * @return string which contains 2 static fragments from first string
   * and one fragment by another
   */
  private String makeChanges(String [] args, int firstIndex, int firstLength,
                           int secondIndex, int secondLength) {
    String[] firstSplit = splitForThreeFragments(args[0], firstIndex, firstLength);
    String[] secondSplit = splitForThreeFragments(args[1], secondIndex, secondLength);
    String result = firstSplit[0] + secondSplit[1] + firstSplit[2];
    return result;
  }
}