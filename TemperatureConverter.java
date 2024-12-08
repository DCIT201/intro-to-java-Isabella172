import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What unit of temperature do you want to convert from? \n" + "Please choose from either Celsius or Fahrenheit: ");
        String unit = input.nextLine().toLowerCase();


        try{
            switch (unit) {
                case "celsius":
                    System.out.println("Enter the temperature in celsius");
                    double celsius = input.nextDouble();
                    System.out.println(celsius + " degrees Celsius is " + celsiusToFahrenheit(celsius) + " Fahrenheit");
                    break;
                case "fahrenheit":
                    System.out.println("Enter the temperature in fahrenheit");
                    double fahrenheit = input.nextDouble();
                    System.out.println(fahrenheit + " fahrenheit is " + fahrenheitToCelsius(fahrenheit) + " degree Celsius");
                    break;
                default:
                    System.out.println("Invalid input. PLease check your spelling or select from either Celsius or Fahrenheit");
            }
        }catch (InputMismatchException e) {
            System.out.println("Please enter a valid numerical value");
            input.nextLine();
        }finally {
            input.close();
        }

    }
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
