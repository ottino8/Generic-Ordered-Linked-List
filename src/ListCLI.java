import java.util.Random;

public class ListCLI {
    InputValidator input = new InputValidator();
    private Application application = new Application(input);

    private void showOptions(){
        System.out.println("1) Insert a new element in the list \n2) Remove element from list\n3) Print integer list\n4) Print string list\n5) Exit the program");
    }

    public void chooseOption(){
        showOptions();
        Option option = input.getOption();
        while (option != Option.EXIT) {
            switch (option) {
                case INSERT:
                    String str = input.getString();
                    application.insert(str);
                    break;
                case REMOVE:
                    str = input.getString();
                    application.remove(str);
                    break;
                case PRINTSTRING:
                    application.printString();
                    break;
                case PRINTINTEGER:
                    application.printInteger();
                    break;
                case EXIT:
                    System.exit(0);
                    break;
                default:
                    break;
            }
            showOptions();
            option = input.getOption();
        }
    }

    public static void main (String[] Args){
        ListCLI cli = new ListCLI();

        for (String s: Args) {
            cli.application.insert(s);
        }

        cli.chooseOption();
    }
}
