import java.util.Scanner;

public class mainProblems {
    public static void main (String [] args)
    {
       //logic problem  squirrelPla()
        int temperature;
        boolean summer;
        int num;
        Scanner input =new Scanner(System.in);
       System.out.println ("what is the temperature");
        temperature = input.nextInt();
        System.out.println("are we on summer");
        summer = input.nextBoolean();
        logicProblems play = new logicProblems();
       // play.squirrelPlay(temperature,summer);
        System.out.println(play.squirrelPlay(temperature,summer));

        //logic problem nearTen()
        System.out.println("please enter a number");
        num= input.nextInt();
        logicProblems number= new logicProblems();
        System.out.println (number.nearTen(num));

        // string problem smallestStringSorter()

        String string1;
        String string2;
        System.out.println("please enter two strings");
        string1 = input.nextLine();
        string2= input.nextLine();
        stringProblems smallString = new stringProblems();
        System.out.println(smallString.smallestStringSorter(string1,string2));

        // string problem evenUpperCaseOrOddLowerCase()

        String str;
        System.out.println("please enter a strings");
        str= input.nextLine();
        stringProblems word =new stringProblems();
        System.out.println(word.evenUpperCaseOrOddLowerCase(str));

    //string problem stringCombiner()

       String str1;
        String str2;
        System.out.println ("please enter tow String");
        str1= input.nextLine();
        str2= input.nextLine();
        stringProblems combination =new stringProblems();
        System.out.println( combination.stringCombiner(str1,str2));


        //string problem left2()
        String st ;
        System.out.println("enter a string");
        st= input.nextLine();
        stringProblems revers = new stringProblems();
        System.out.println(revers.left2(st));

        // warmup problem stringTime()

        int n;
        String name;
        System.out.println("please enter a name");
        name=input.nextLine();
        System.out.println("how many time you want the name repeated");
        n= input.nextInt();
        warmupProblems repeatition = new warmupProblems();
        System.out.println(repeatition.stringTimes(name,n));


        // warmup problem icyHot
        int temp1;
        int temp2;
        System.out.println("please enter two temperature ");
        temp1= input.nextInt();
        temp2= input.nextInt();
        warmupProblems icy = new warmupProblems();
        System.out.println(icy.icyHot(temp1,temp2));


    }


}
