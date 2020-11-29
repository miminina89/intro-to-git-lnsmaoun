public class logicProblems {



    /*
     * squirrelPlay()
     * The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between
     * 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature
     * and a boolean isSummer, return true if the squirrels play and false otherwise.
     *
     * Examples:
     * - squirrelPlay(70, false) → true
     * - squirrelPlay(95, false) → false
     * - squirrelPlay(95, true) → true
     */
    private int temp;
    private boolean isSummer;
    public int getTemp ()
    {
        return temp;
    }
    public boolean getIsSummer ()
    {
        return isSummer;
    }
    public boolean squirrelPlay(int temp, boolean isSummer) {
      this.temp=temp;
        this.isSummer=isSummer;
       if (temp>60 & temp<90 & isSummer==false)
       {
           System.out.println("squirrel Play");
            return true;

       }

       if (temp>90 & temp<=100 & isSummer==true)
        {
            System.out.println("squirrel Play");
            return true;
        }
        else
            {
                System.out.println("squirrel don't Play");
            }

        return false;
    }

    /*
     * nearTen()
     * Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the
     * remainder of dividing a by b, so (7 % 5) is 2.
     *
     * Examples:
     * - nearTen(12) → true
     * - nearTen(17) → false
     * - nearTen(19) → true
     */
    private int num;
    public int getNum()
    {
        return num;
    }
    public boolean nearTen(int num) {
        this.num=num;
        if (num%10<=2) {
            return true;
        }
        else if (num%10 >=8)
        {
            return true;
        }


        return false;
    }

}
