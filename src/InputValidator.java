import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidator {
    private Scanner input = new Scanner(System.in);

    public String getString() {
        return input.nextLine();
    }

    public boolean selectList(String input){
        try {
            Integer.parseInt(input);
            return true;
        }
        catch (NumberFormatException | InputMismatchException e){
            return false;
        }
    }

    public Option getOption() {
        String str = input.nextLine();
        str = str.trim();
        try {
            int value = Integer.parseInt(str);
            if(value < 1 || value > 5 ){
                System.err.println("Your enter is not valid. Please try again.");
                return getOption();
            }
            else {
                return Option.fromCode(value);
            }
        } catch (NumberFormatException | InputMismatchException e) {
            System.err.println("Your enter is not valid. Please try again.");
            return getOption();
        }
    }
}
