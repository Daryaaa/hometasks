public class EnterPoint {
  public static void main(String[] args) {
    DoubleArrays example = new DoubleArrays();
    double [][] inputArray = {
        {0.4, 2.3, 5.4, 2.3, 5.6, 0.000000000000000000000000000001},
        {0.7, 6.8, 8.1, 3.2, 5.5, 0.000000000000000000000000000001},
        {0.8, 0.4, 2.3, 8.1, 0.9, -10.0},
        {7.1, 8.1, 9.1, 7.6, 8.1, -9.9999999999999999},
        {9.1, 3.3, 0.4, 0.9, 2.2, 7.2},
    };
    double[] outArray = example.arrayOfOnlyDuplicates(inputArray);
    for (int i = 0; i < outArray.length; i++) {
      System.out.print(outArray[i] + " ");
    }
  }
}
