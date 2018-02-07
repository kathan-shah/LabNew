import java.util.Scanner;
public class Long {
   private static final String[] lowNames = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten","eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    private static final String[] tensNames = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    private static final String[] bigNames = {"thousand", "million", "billion"};

    public static String convertNumberToWords (int n) {
        if (n < 0) {
            return "minus " + convertNumberToWords(-n); }
        if (n <= 999) {
            return convert999(n); }

    String s = "";
    int t = 0;

    while (n > 0) {
        if (n % 1000 != 0) {
            String s2 = convert999(n % 1000);
        if (t > 0) {
            s2 = s2 + " " + bigNames[t-1]; }
        if (s == "") {
            s = s2; }
        else 
            s = s2 + ", " + s; }
      n /= 1000;
      t++; }

   return s; }

   private static String convert999 (int n) {
        String s1 = lowNames[n / 100] + " hundred";
        String s2 = convert99(n % 100);
   
        if (n <= 99) {
            return s2; }
        else if (n % 100 == 0) {
            return s1; }
        else 
            return s1 + " " + s2; 

        }

    private static String convert99 (int n) {
        if (n < 20) {
            return lowNames[n]; }
        
        String s = tensNames[n / 10 - 2];
   
        if (n % 10 == 0) 
            return s; 
   
        return s + "-" + lowNames[n % 10]; 
   }

    public static void main(String[] args) {
        String dollar;
        String cent;
        Scanner scanner2 = new Scanner(System.in);
        String scanner = scanner2.nextLine();
        dollar = scanner.substring(1,scanner.length()-3);
        cent = scanner.substring(scanner.length()-2,scanner.length());
        System.out.println(convertNumberToWords(Integer.parseInt(dollar))+" dollars and "+cent+"/100 cents");
    }
}