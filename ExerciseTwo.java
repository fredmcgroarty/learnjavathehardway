public class ExerciseTwo {

    private static String printReceipt (){
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

    public static void main( String[] args ) {
        System.out.println(printReceipt());
    }
}
