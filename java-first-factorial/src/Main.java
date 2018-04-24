public class Main {

    public static int FirstFactorial(int num) {
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    public static void main(String[] args) {
	    System.out.println(FirstFactorial(4));
        System.out.println(FirstFactorial(8));
    }
}
