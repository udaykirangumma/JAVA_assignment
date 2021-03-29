import java.util.Scanner;

public class assignment1_pro3 {
    public static void main(String[] args) {
        Scanner integerInput = new Scanner(System.in);
        System.out.println("Please enter an integer input");

        int numberInput = integerInput.nextInt();
        
        for(int i = 1; i < numberInput; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        for(int i = numberInput; i >= 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        integerInput.close();
    }
}
