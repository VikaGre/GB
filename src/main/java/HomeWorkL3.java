import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkL3 {
    public static void main(String[] args) {
        ChangeNumbers();
        FillArray();
        Doubling();
        Square();
        TwoArguments();
        MinMax();
        Task7();
        System.out.println();
        Task8();
    }

    public static void ChangeNumbers() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for(int i = 0; i < array.length; i++) {
            if(array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void FillArray() {
        int[] arr = new int[100];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Doubling() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Square() {
        int[][] arr = new int[5][5];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(i == j) {
                    arr[i][j] = 1;
                }
                if(j == arr.length - 1 - i) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void TwoArguments() {
        System.out.print("Input the len: ");
        Scanner inputLen = new Scanner(System.in);
        int len = inputLen.nextInt();

        System.out.print("Input the initialValue: ");
        Scanner inputInitialValue = new Scanner(System.in);
        int initialValue = inputInitialValue.nextInt();

        int[] arr = new int[len];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void MinMax() {
        int[] arr = {5, -9, 36, 4, 7, -15, 68, 34, 5, -77, 21};
        int min = 0;
        int max = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
        System.out.println();
    }

    public static boolean Task7() {
        int[] arr = {1, 1, 1, 2, 1};
        int sum = 0;
        int halfSum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for(int i = 0; i < arr.length; i++) {
            halfSum += arr[i];
            if(i == arr.length - 3) {
                break;
            }
            if (halfSum == sum/2 && sum%2 == 0) {
                break;
            }
        }
        if(halfSum == sum/2) {
            return true;
        } else {
            return false;
        }
    }

    public static void Task8() {
        System.out.print("Input the number n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = {1, 2, 3, 4, 5, 6};

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int temp = arr[arr.length - 1];
                for(int j = arr.length - 1; j >= 0; j--) {
                    if(j == 0) {
                        arr[j] = temp;
                    } else {
                        arr[j] = arr[j-1];
                    }
                }
            }
            System.out.print(Arrays.toString(arr));
        }
        if (n < 0) {
            for (int i = 0; i > n; i--) {
                int temp = arr[0];
                for(int j = 0; j < arr.length; j++) {
                    if(j == (arr.length)-1) {
                        arr[j] = temp;
                    } else {
                        arr[j] = arr[j+1];
                    }
                }
            }
            System.out.print(Arrays.toString(arr));
        }
    }
}
