import java.util.Scanner;  // Import the Scanner class
// import java.lang.reflect;  // inspect java elements
// Import the HashMap class
import java.util.HashMap;
public class ExerciseTwo {

    public static void main( String[] args ) {

        Scanner scannerInput = new Scanner(System.in);
        CountryQuerier countryQuerier = new CountryQuerier();

        System.out.println("You choose: ");
        countryQuerier.optionsHash().forEach((key,value) -> System.out.println(key + ". " + value + "\n"));

        String input = scannerInput.nextLine();

        while (!countryQuerier.isValid(input)) {

            System.out.println(
                input + " is invalid. Please choose a number between"
            );
            System.out.println("...");

            input = scannerInput.nextLine();

        }


        // ReceiptPrinter receiptPrinter = new ReceiptPrinter();
        // System.out.println(receiptPrinter.perform());
    }


    // private String chooseCountry (Scanner scannerInput){


    //     // String country = scannerInput.nextLine();




    // }
}

class CountryQuerier {

    public HashMap optionsHash() {
        HashMap<String, String> regionsHash = new HashMap<String, String>();
        regionsHash.put("US", "1");
        regionsHash.put("UK", "2");
        regionsHash.put("EU", "3");

        return regionsHash;
    }

    public boolean isValid(String selection) {
        return optionsHash().containsValue(selection);
    }
}

class ReceiptPrinter {

    public String perform (){
        String s;
        s = "+------------------------+ \n"
          + "|                        | \n"
          + "|      CORNER STORE      | \n"
          + "|                        | \n"
          + "| 2015-03-29  04:38PM    | \n"
          + "|                        | \n"
          + "| Gallons:       10.870  | \n"
          + "| Price/gallon: $ 2.089  | \n"
          + "|                        | \n"
          + "| Fuel total:  $ 22.71   | \n"
          + "|                        | \n"
          + "+------------------------+ \n";
          return s;
    }
}
