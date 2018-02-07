import java.util.Scanner;

public class Histogram {
    int m;
    int n;
    int difference;

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
        int[] list1 = {0,0,0,0,0,0};
        this.list1 = list1;
        for (int i = 0; i<=difference;i++){
            list1[i] = 5;
            System.out.println(list1[i]);
        }
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
        for (int i : list1){
            System.out.println(i);
        }

    }
    public static void main(String[] args) {
        System.out.print("Range? ");
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner = new Scanner(scanner2.nextLine());
        int m1 = scanner.nextInt();
        int n1 = scanner.nextInt();
        System.out.println(m1);

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



    }
}