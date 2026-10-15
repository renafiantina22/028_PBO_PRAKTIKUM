import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String[] stringList;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.print("How many strings do you want to sort? ");
        size = scan.nextInt();
        scan.nextLine();

        stringList = new String[size];

        System.out.println("Enter the strings...");
        for (int i = 0; i < size; i++) {
            stringList[i] = scan.nextLine();
        }

        Sorting.insertionSort(stringList);

        System.out.println("Your strings in sorted order:");
        for (int i = 0; i < size; i++) {
            System.out.println(stringList[i]);
        }

        scan.close();
    }
}
