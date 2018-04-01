import java.util.HashMap;

public enum Option {
    INSERT(1),
    REMOVE(2),
    PRINTINTEGER(3),
    PRINTSTRING(4),
    EXIT(5);

    private int optCode;

    private static final HashMap<Integer, Option> codeMap = new HashMap<>();

    static {
        for (Option option : values()) {
            codeMap.put(option.optCode, option);
        }
    }

    private Option(int opt) {
        optCode = opt;
    }

    public static Option fromCode(int opt) {
        return codeMap.get(opt);
    }
}