public class Application {
    private List<Integer> integerList;
    private List<String> stringList;
    InputValidator input;

    public Application(InputValidator input){
        this.input=input;
    }

    public void insert(String str){
        if (input.selectList(str)){
            if (integerList == null){
                integerList = new List<>();
            }
            integerList.insert(Integer.parseInt(str));
        } else {
            if (stringList == null){
                stringList = new List<>();
            }
            stringList.insert(str);
        }
    }

    public void remove(String str){
        if (input.selectList(str)){
            if (integerList==null) {
                System.out.println("No element in the list");
                return;
            }
            System.out.println(integerList.remove(Integer.parseInt(str)));
        } else {
            if (stringList==null) {
                System.out.println("No element in the list");
                return;
            }
            System.out.println(stringList.remove(str));
        }
    }

    public void printInteger(){
        if (integerList==null){
            System.out.println("No element in the list");
        } else {
            System.out.println(integerList.toString());
        }
    }

    public void printString(){
        if (stringList==null){
            System.out.println("No element in the list");
        } else {
            System.out.println(stringList.toString());
        }
    }
}
