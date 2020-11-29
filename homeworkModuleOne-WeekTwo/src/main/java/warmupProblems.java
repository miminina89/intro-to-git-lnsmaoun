public class warmupProblems {


    /*
     * stringTimes()
     *
     * Given a string, str, and a non-negative and non-zero integer, n, return a larger string that is n copies of the original
     * string.
     *
     * Examples:
     * - stringTimes("Hi", 2) → "HiHi"
     * - stringTimes("Hi", 3) → "HiHiHi"
     * - stringTimes("Hi", 1) → "Hi"
     */
    private String str;
    private int n;

    public int getN() {
        return n;
    }

    public String getStr() {
        return str;
    }

    public String stringTimes(String str, int n) {
        this.str=str;
        this.n=n;
        if (str.length()>=1) {
            return str.repeat(n);
        }


        return null;
    }

    /*
     * icyHot()
     *
     * Given two temperatures, temp1 and temp2, return true if one is less than 0 and the other is greater than 100.
     *
     * Examples:
     * - icyHot(120, -1) → true
     * - icyHot(-1, 120) → true
     * - icyHot(2, 120) → false
     */
    private int temp1;
    private int temp2;

    public int getTemp1() {
        return temp1;
    }

    public int getTemp2() {
        return temp2;
    }

    public boolean icyHot(int temp1, int temp2) {
        this.temp1=temp1;
        this.temp2=temp2;
        if ( temp1<0 & temp2>100)
        {
            return true;
        }
        else if (temp1>100 & temp2<0)
        {
           return true;
        }

        return false;
    }
}
