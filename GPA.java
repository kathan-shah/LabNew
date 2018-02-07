import java.util.Scanner;
public class GPA {
    public static void main(String[] args) {
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner = new Scanner(scanner2.nextLine());
        double totgpa = 0.0;
        double totcredit = 0.0;
        while (scanner.hasNext()){
            String Grade = scanner.next();
            double points = 0;
            switch (Grade){
                case "a":
                    points = 4.0;
                    break;
                case "a-":
                    points = 3.667;
                    break;
                case "b+":
                    points = 3.333;
                    break;
                case "b":
                    points = 3.0;
                    break;
                case "b-":
                    points = 2.667;
                    break;
                case "c+":
                    points = 2.333;
                    break;
                case "c":
                    points = 2.0;
                    break;
                case "c-":
                    points = 1.667;
                    break;
                case "d+":
                    points = 1.333;
                    break;
                case "d":
                    points = 1.0;
                    break;
                case "f":
                    points = 0.0;
                    break;
            }
            
            int credit = scanner.nextInt();
            totgpa += (points*credit);
            totcredit += credit;
        }
    System.out.println(totgpa/totcredit);

    }
}
