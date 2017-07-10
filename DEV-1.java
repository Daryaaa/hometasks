public class NumbersOnScreen {

    public static void main(String[] args) {

        int i = 0;
        while(i < 101) {
            if (i % 3 == 0){
                System.out.print(" " + "3*" + i/3 + " ");
                i++;
            }
            System.out.print(" " + i + " ");
            i++;
        }
    }
}