
public class Long {

    public static void main(String[] args){
        float number; //treating this as float for now, later change it to string
        String longHand = " ";

        int tens = number % 100;

        String numArr =  "",
                " one",
                " two",
                " three",
                " four",
                " five",
                " six",
                " seven",
                " eight",
                " nine",
                " ten",
                " eleven",
                " twelve",
                " thirteen",
                " fourteen",
                " fifteen",
                " sixteen",
                " seventeen",
                " eighteen",
                " nineteen" ;

        String num1Arr = "",
                " ten",
                " twenty",
                " thirty",
                " forty",
                " fifty",
                " sixty",
                " seventy",
                " eighty",
                " ninety" ;

        // XXXnnnnnnnnn
        int billions = Integer.parseInt(number.substring(0,3));
        // nnnXXXnnnnnn
        int millions  = Integer.parseInt(number.substring(3,6));
        // nnnnnnXXXnnn
        int hundredThousands = Integer.parseInt(number.substring(6,9));
        // nnnnnnnnnXXX
        int thousands = Integer.parseInt(number.substring(9,12));

        if (billions<20)
            longHand = longHand + numArr[billions] + "billions";
        else if
            longHand = longHAnd + num1Arr[(billions.substring(1,2)] + numArr[billions % 10] + "billions";

        if (millions<20)
            longHand = longHand + numArr[millions] + "millions";
        else if
        longHand = longHAnd + num1Arr[(millions.substring(1,2)] + numArr[millions % 10] + "millions";

        if (hundredThousands<20)
            longHand = longHand + numArr[hundredThousands] + "thousand";
        else if
        longHand = longHAnd + num1Arr[(hundredThousands.substring(1,2)] + numArr[hundredThousands % 10] + "thousand";

        if (thousands<20)
            longHand = longHand + numArr[thousands] ;
        else if
        longHand = longHAnd + num1Arr[(thousands.substring(1,2)] + numArr[thousands % 10] ;








    }
}