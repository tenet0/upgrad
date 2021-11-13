import java.util.*;
import static java.lang.Math.signum;

public class NegPos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Enter size of array
        int arr[] = new int[n]; // Create array of size n
        for (int i = 0; i < n; i++) { // Loop n times and add number in array "arr"
            arr[i] = sc.nextInt();
        }
        partition(n, arr); // Invoke partition funtion and pass array and array size
    }

    static boolean checkSign(int a) { // This function will check sign and return true if Positive and False if negative
        if (signum(a) == 0 || signum(a) == 1) {
            return true;
        } else {
            return false;
        }
    }
    static void printResult(ArrayList result){ // This function prints sorted array result.
        for(Object s: result){
            System.out.print(s);

        }
    }

    // Method to partition negative and positive numbers without comparing with 0
    static void partition(int n, int arr[]) {
        // Write your code here
        ArrayList<String> pos = new ArrayList<>();
        ArrayList<String> neg = new ArrayList<>();
        boolean isFirstPositive = checkSign(arr[0]); // This checks the sign of first element. Which array to display
        // first depends on the sing of first arra

        for(int i = 0; i < n ; i++){ // traverse through array "arr" check the sign by invoking checkSign function and
            // add to pos and neg Arraylist accordingly.
            if(checkSign(arr[i])){
                pos.add(arr[i] + " ");
            }
            else{
                neg.add(arr[i] + " ");
            }
        }
        if(pos.isEmpty()){ // If positive array is empty, print negative array
            printResult(neg);
            System.out.print("\n");
            System.out.println("Array doesn't have positive numbers");
        }
        else if(neg.isEmpty()){ // If negative array is empty, print positive array.
            printResult(pos);
            System.out.print("\n");
            System.out.println("Array doesn't have negative numbers");
        }
        else{
            if(isFirstPositive) { // Check the sign of first element and display the array with same sign first.
                printResult(pos);
                System.out.print("\n");
                printResult(neg);
            }
            else{
                printResult(neg);
                System.out.print("\n");
                printResult(pos);

            }

        }
    }
}

