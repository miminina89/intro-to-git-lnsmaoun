import javax.swing.*;

public class stringProblems {



    /*
     * smallestStringSorter()
     *
     * Given two strings, stringA and stringB, return the smallest string, however, if one of the strings has a length
     * of 0, return the other string.  If both strings are the same length, return a new string mashing stringA and
     * stringB together.
     *
     * Examples:
     * - smallestStringSorter("two", "fifteen") -> "two"
     * - smallestStringSorter("", "tomorrow") -> "tomorrow"
     * - smallestStringSorter("zizzer", "zazzer") -> "zizzerzazzer"
     */
    private String stringA;
    private String stringB;

    public String getStringA()
    {
        return stringA;
    }
    public String getStringB()
    {
        return stringB;
    }


    public String smallestStringSorter(String stringA, String stringB){
        this.stringA=stringA;
        this.stringB=stringB;
        if(stringA.length()==0) {

            return stringB;
        }
        else if (stringB.length()==0){

        }
        else if (stringA.length()>stringB.length()) {

            return stringB;
        }

        else if (stringA.length()<stringB.length()) {

            return stringA;
        }
        else if (stringA.length()==stringB.length()) {


            return stringA + stringB;
        }

        return null;
    }

    /*
     * evenUpperCaseOrOddLowerCase()
     *
     * Given a string, str, transform the string's characters to upper case characters if the length is even or lower
     * case if the length is odd.
     *
     * Examples:
     * - evenUpperCaseOrOddLowerCase("Hello") -> "hello"
     * - evenUpperCaseOrOddLowerCase("Zizzer Zazzer Zuzz") -> "ZIZZER ZAZZER ZUZZ"
     */
    private  String str;

    public String getStr() {
        return str;
    }

    public String evenUpperCaseOrOddLowerCase(String str){
        this.str=str;
        if (str.length()%2==0)
        {
            return str.toUpperCase();
        }
        else if (str.length()%2!=0)
        {
            return str.toLowerCase();
        }


        return null;
    }

    /*
     * stringCombiner()
     *
     * Given two strings, stringA and stringB, return a new string that combines the two strings, but the strings should
     * be combined in ascending alphabetically order.
     *
     * Examples:
     * - stringCombiner("Hello", "There") -> "HelloThere"
     * - stringCombiner("Zizzer" "zazzer") -> "zazzerZizzer"
     */

    public String stringCombiner(String stringA, String stringB){
        this.stringA=stringA;
        this.stringB=stringB;
        if (stringA.compareToIgnoreCase(stringB)<0)
        {
            return stringA+stringB;
        }
        else if (stringA.compareToIgnoreCase(stringB)>0)
        {
            return stringB+stringA;
        }


        return null;
    }

    /*
     * left2()
     * Given a string, str, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length
     * will be at least 2.
     *
     * Examples:
     * - left2("Hello") → "lloHe"
     * - left2("java") → "vaja"
     * - left2("Hi") → "Hi"
     */

    public String left2(String str){
        this.str=str;
        if (str.length()>1) {

            str = str.substring(2) + str.substring(0, 2);
            return str;
        }



        return null;
    }
}
