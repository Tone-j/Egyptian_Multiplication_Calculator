package EgyptianMultiplicationCalculator;

import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;
import java.util.List;

public class EgyptianMultiplication {

    public EgyptianMultiplication(){

    }

    static Data data = new Data();
    private static final ArrayList<Integer> left = new ArrayList<>();
    private static final ArrayList<Integer> right = new ArrayList<>();

    /**
     * GetList1Algo is a methode that takes the first values given in the equation and
     creates a first row list of integers that are Halved and return the list at the end for testing purposes.
     */
    public static ArrayList<Integer> getList1Algo(int value1) {

        int current = 1;

        while (current <= value1) {
            left.add(current);
            current *= 2;
        }
        return left;
    }

    /**
     * GetList2Algo is a method that takes the Second values given in the equation and
     creates a second row list of integers that are doubled and return the list at the end for testing purposes.
     */
    public static ArrayList<Integer> getList2Algo(int value2) {

        int current = value2;

        for (int i = 0; i < left.size(); i++) {
            right.add(current);
            current *= 2;
        }
        return right;
    }

    /**
     *The Egyptian Algorithm that works by spreading out (distributing) the multiplication
      and then adding the products.
     */
    public static int product(int value){

        int sum = 0;
        int currentLeft = 0;
        int i = left.size() - 1;

        while (currentLeft != value){

            int temp = currentLeft + left.get(i);

            if (temp <= value){
                currentLeft = temp;
                sum += right.get(i);
            }
            i --;
        }
        System.out.println("The product of the given value is: " + sum);
        return sum;
    }

    @VisibleForTesting
    public static int product(int value, List<Integer> left, List<Integer> right) {

        int sum1 = 0;
        int currentLeft = 0;
        int i = left.size() - 1;

        while (currentLeft != value){

            int temp = currentLeft + left.get(i);

            if (temp <= value){
                currentLeft = temp;
                sum1 += right.get(i);
            }
            i --;
        }

        return sum1;
    }


    public static void main(String[] args) {

        int calc = 1;

        while (calc > 0) {
            int valueOne = data.getFirstNumber();
            int valueTwo = data.getSecondNumber();

            getList1Algo(valueOne);
            getList2Algo(valueTwo);

            product(valueOne);

            calc = data.calcController();

            left.clear();
            right.clear();
        }

        System.out.println("Shutting Down............................");

    }
}