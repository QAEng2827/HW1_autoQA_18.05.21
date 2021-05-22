import java.io.IOException;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

import static sun.swing.MenuItemLayoutHelper.max;

public class Task_13 {
    /*
    Найти максимальное число в массиве

public class Main {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] getArray() throws IOException {
        // создай и заполни массив

     */
//private  static int[] iArr;

    public static void main(String[] args) throws Exception {
        int[] array = getArray();
      // OptionalInt max = Arrays.stream(array).max();
        int max = max(array);
        System.out.println(  "Максимальное число в массиве: " +max);
    }

    public static int[] getArray() throws IOException {

        System.out.println("Задайте размер массива");
        Scanner inputSize = new Scanner(System.in);
        int arrSize = inputSize.nextInt();
        int[] iArr = new int[arrSize];

        for (int i = 0; i< arrSize; i++) {
            iArr[i] = randIntegerGenetration();
            System.out.println(i +" - "+iArr[i]);
        }

        return iArr;
    }
    public static  int randIntegerGenetration(){
        Random rand = new Random();
        int randInt= rand.nextInt(100);
     return randInt;
    }
    public static int max(int[] array) {
        int max = 0;

        for (int j = 0; j< array.length; j++){
            if (array[j] > max){
                max = array[j];
            }
        }
                     return max;
    }

    }

