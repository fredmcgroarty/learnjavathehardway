import java.util.Calendar;

public class ExerciseOne {
  public static void main( String[] args ) {
    System.out.println(
      "Hello " + args[0]
    );

    System.out.println(
      "Today's date is: " + Calendar.getInstance().getTime()
    );
  }
}
