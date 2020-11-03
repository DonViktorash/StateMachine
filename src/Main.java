import java.util.*;

public class Main {
    public static final int START = 0;
    public static final int DIGITS = 1;
    public static void main(String[] args) {
        List<Character> digits = Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9','$');
        Set<Integer> endStates = Collections.singleton(DIGITS);
        StateMachine  sm  =  new  StateMachine(START,  endStates);
        sm.add(START, digits, DIGITS);
        sm.add(DIGITS,  digits,  DIGITS);
        String  str  =  "1000$abba  01.01.2017  xyzzy  02.02.2017";
        sm.findAll(str);
    }
}