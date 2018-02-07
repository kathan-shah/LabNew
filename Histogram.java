import java.util.Scanner;

public class Histogram {
    int m;
    int n;
    int difference;
    int[] list1;
    String base;

    public Histogram(int m, int n){
        if(m <= n) {
            this.m = m;
            this.n = n;
        }
        else {
            this.m = n;
            this.n = m;
        }
        difference = n - m;
        list1 = new int[difference+1];

        for (int i = 0; i<=difference;i++){
            list1[i] = 0;

        }
        base = "************************************";
    }

    public boolean add(int i){
        if(i <= n && i >= m)
            return true;
        else
            return false;
    }

    public void append(int i){
        int index;
        index = i-m;
        list1[index]++;
    }

    public void to(){
        int counter=0;
        for (int i : list1){
            System.out.println((counter+m) + ": " +(base.substring(0,i)));
            counter++;
        }

    }
    public static void main(String[] args) {
        System.out.print("Range? ");
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner = new Scanner(scanner2.nextLine());
        int m1 = scanner.nextInt();
        int n1 = scanner.nextInt();

        System.out.print("Data? ");
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(scanner3.nextLine());
        Histogram h = new Histogram(m1,n1);

        while(scanner4.hasNext()){
            int m2 = scanner4.nextInt();
            if(!h.add(m2))
                System.out.println(m2 + " is not in range");
            else
                h.append(m2);
        }
        h.to();

    }
}