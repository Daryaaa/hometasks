import java.io.*;
public class IsFibonacci {
  public static String IsNumberFibonacci(int n) {
    String result = null;
    int firstFibonacci = 0;
    int secondFibonacci = 1;
    if ( n < firstFibonacci ) {
      result = "Illegal input";
    } else  if (n == firstFibonacci || n == secondFibonacci) {
      result = "Is Fibonacci";
    } else if (n > secondFibonacci) {
      int thirdFibonacci = 1;
      for (int sum = 0; sum < n; sum++) {
        sum = secondFibonacci+thirdFibonacci;
        secondFibonacci = thirdFibonacci;
        thirdFibonacci = sum;
        if (sum == n) {
          result = "Is Fibonacci";
        } else if (sum > n) {
          result = "Isn't Fibonacci";
        }
      }
    } System.out.println(result);
      return result;
  }
  public static void main(String[] args) throws IOException {
    InputStream inputStream = System.in;
    Reader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    String sn = bufferedReader.readLine();
    int n = Integer.parseInt(sn);
    IsNumberFibonacci(n);
  }
}