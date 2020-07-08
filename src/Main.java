import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        boolean isRun = true;
        while (isRun){
            System.out.println("\nEnter two number");
            try {
                double number1 = scannerInt.nextInt();
                double number2 = scannerInt.nextInt();
                int number3 = (int) number1;
                int number4 = (int) number2;
                System.out.println("1. Plus; 2. Minus; 3. Multiplication; 4. Divide.");
                int input = scannerInt.nextInt();
                switch (input) {
                    case 1: {
                        Number<Integer> getPlus = (x, y) -> x + y;
                        System.out.println(getPlus.result(number3, number4));
                        break;
                    }
                    case 2: {
                        Number<Integer> getMinus = (x, y) -> x - y;
                        System.out.println(getMinus.result(number3, number4));
                        break;
                    }
                    case 3: {
                        Number<Integer> getMultiplication = (x, y) -> x * y;
                        System.out.println(getMultiplication.result(number3, number4));
                        break;
                    }
                    case 4: {
                        Number<Double> getDivide = (x, y) -> x / y;
                        System.out.printf("%.2f", getDivide.result(number1, number2));
                        break;
                    }
                    default: {
                        System.err.print("Invalid input!");
                    }
                }
            }catch (InputMismatchException e){
                System.err.print("Invalid input!");
                isRun = false;
            }

        }
    }
}

@FunctionalInterface
interface Number<I>{
    I result(I i, I a);
}
