import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Formula formulaObject = new Formula();

        //Variable to store type of calculator the user needs
        int calcType ;

        System.out.println("1.Basic calculator\n2.Temperature converter\n3.Scientific calculator");
        System.out.println();

        System.out.println("Enter the calculator you want to use");
        calcType = input.nextInt();

        System.out.println();

        if(calcType == 1){
            formulaObject.basicOperations();
        }

        if(calcType == 2){
            formulaObject.tempConverter();
        }

        if(calcType == 3){
            formulaObject.scientificCalc();
        }
    }
}
