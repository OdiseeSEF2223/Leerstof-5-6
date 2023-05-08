import java.util.Arrays;

public class StringCalculator {
    public static int calculate(String s) {
        if(s == ""){
            return 0;
        } else {
            return Integer.parseInt(s);
        }
    }

    /**
     * Useful code snippets to use in the implementation
     */
    public void usefulCode() {
        String s="a:b=c";
        s.split("[:=]");  //returns array {a,b,c}
        String n="5";
        Integer.parseInt(n); // returns integer 5
    }

}
