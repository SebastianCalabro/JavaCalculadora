import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float numberOne = 0;
        float numberTwo = 0;
        String operator = "lala";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce the first number:");
        numberOne = sc.nextFloat();
        System.out.println("Introduce the second number");
        numberTwo = sc.nextFloat();
        sc.nextLine();
        System.out.println("What type of operation do you want? (sum, subtract, multiply, divide)");
        operator = sc.nextLine();
        sc.close();

        Operations operations = new Operations(numberOne, numberTwo);
        float result = 3.14f;

        switch(operator) {
            case "sum": result = operations.sum(); 
            break;
            case "subtract": result = operations.subtract();
            break;
            case "multiply": result = operations.multiply();
            break;
            case "divide": result = operations.divide();
            break;
        }
        if(result == 3.14f){
            System.out.println("That operator does not exists");
        }else{
            System.out.println("The result is " + result);
        }
    }
}
