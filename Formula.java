import java.util.Scanner;
public class Formula {

    public void basicOperations(){
        Scanner input = new Scanner(System.in);
        double num1,num2;
        int operations;
        int choice;

        do {
            System.out.println("Basic Calculator");
            System.out.println("----------------");

            System.out.println("1.Addition\n2.Subtraction\n3.Multiplication.\n4.Division\n5.Remainder");
            System.out.println();

            System.out.println("Which operation would you like to perform?");
            operations = input.nextInt();

            System.out.println("Enter the first number");
            num1 = input.nextFloat();

            System.out.println("Enter the second number");
            num2 = input.nextFloat();


            switch (operations) {
                case 1:
                    System.out.printf("%.2f + %.2f = %.2f", num1, num2, (num1 + num2));
                    break;

                case 2:
                    System.out.printf("%.2f - %.2f = %.2f", num1, num2, (num1 - num2));
                    break;

                case 3:
                    System.out.printf("%.2f * %.2f = %.2f", num1, num2, (num1 * num2));
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("Division by zero error");
                    } else {
                        System.out.printf("%.2f / %.2f = %.2f", num1, num2, (num1 / num2));
                    }
                    break;

                case 5:
                    double a;
                    a = num1 % num2;
                    System.out.println("Remainder:" + a);
                    break;

            }

            System.out.println();

            System.out.println("Enter 1 to perform another operation and 2 to end the program");
            choice = input.nextInt();
        }while(choice == 1);

    }

    public void tempConverter(){
        Scanner input = new Scanner(System.in);
        //Variable to store the unit that the user wants to convert from
        int currentUnit;

        //Variable to store the unit that the user wants to convert to
        int nextUnit;

        //Variable to store the user value
        float number;

        //Variable to store the new value
        double newNumber;

        int choice;

        do {

            System.out.println("Temperature Converter");
            System.out.println("---------------------");

            System.out.println("1.Celsius\n2.Kelvin\n3.Fahrenheit");
            System.out.println();

            System.out.println("Enter the unit that you have(eg 1)");
            currentUnit = input.nextInt();

            System.out.println("Enter the unit that you want to convert to(eg 2)");
            nextUnit = input.nextInt();

            System.out.println("Enter the number you want to convert");
            number = input.nextFloat();

            if (currentUnit == 1 && nextUnit == 2) {
                newNumber = number + 273.15;
                System.out.println(number + " (°C) is " + newNumber + " (K) ");
            }

            if (currentUnit == 1 && nextUnit == 3) {
                newNumber = (number * 1.8) + 32;
                System.out.println(number + " (°C) is " + newNumber + " (°F) ");
            }

            if (currentUnit == 2 && nextUnit == 3) {
                newNumber = (number - 273.15) * 1.8 + 32;
                System.out.println(number + " (K) is" + newNumber + " (°F) ");
            }

            if (currentUnit == 3 && nextUnit == 2) {
                newNumber = (number - 32) / 1.8 + 273.15;
                System.out.println(number + " (°F) is " + newNumber + " (K)");
            }

            if (currentUnit == 2 && nextUnit == 1) {
                newNumber = number - 273.15;
                System.out.println(number + "  (K) is " + newNumber + " (°C)");
            }

            if (currentUnit == 3 && nextUnit == 1) {
                newNumber = (number - 32) * 5 / 9;
                System.out.println(number + "  (°F) is " + newNumber + " (°C)");
            }

            System.out.println();
            System.out.println("Enter 1 to perform another operation and 2 to end the program");
            choice = input.nextInt();
        }while(choice == 1);

    }

    public void scientificCalc(){
        Scanner input = new Scanner(System.in);
        int operation;
        int n;
        int r;
        int a;
        int nPr,nCr;
        int factorial1 = 1;
        int factorial2 = 1;
        int factorial3 = 1;
        int choice;

        do {

            System.out.println("Scientific Calculator");
            System.out.println("---------------------");

            System.out.println("1.Permutation & Combinations");
            System.out.println();

            System.out.println("Enter the operation you want to perform");
            operation = input.nextInt();

            if (operation == 1) {
                System.out.println("Enter n");
                n = input.nextInt();

                System.out.println("Enter r");
                r = input.nextInt();

                for (int i = 1; i <= n; i++) {
                    factorial1 = factorial1 * i;
                }

                a = n - r;

                for (int i = 1; i <= a; i++) {
                    factorial2 = factorial2 * i;
                }

                for (int i = 1; i <= r; i++) {
                    factorial3 = factorial3 * i;
                }

                nPr = factorial1 / factorial2;
                System.out.println("Number of permutations is " + nPr);

                nCr = nPr / factorial3;
                System.out.println("Number of combinations is " + nCr);

            }

            System.out.println();
            System.out.println("Enter 1 to calculate again and 2 to end the program");
            choice = input.nextInt();

            System.out.println();
        }while(choice == 1);


    }
}
