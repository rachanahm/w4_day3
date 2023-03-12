import java.util.Scanner;

class Sumidx {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int sum = 0;
    int arr[] = { 10, 24, 20, 6, 40 };
    System.out.println("enter the no sum of index numbers");
    int num = s.nextInt();
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        sum = arr[i] + arr[j];
        if (sum == num) {
          System.out.println(i + " " + j);
        }
      }

    }
  }
}