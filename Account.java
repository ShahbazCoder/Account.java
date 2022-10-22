import java.util.Scanner;

class Account {
    Scanner sc = new Scanner(System.in);

    private String name, type;
    private long accNo;
    private double balanceAmount;

    public static long trans = 0;

   
    public Account(String n, String t, long no, double am) {
        name = n;
        type = t;
        accNo = no;
        balanceAmount = am;
    }


    public double amount() {
        return balanceAmount;
    }

 
    public void deposit(double d) {
        
        balanceAmount += d;

        trans++;
    }

    public void withdrawal(double w) {
        if(w<=balanceAmount){
       	balanceAmount -= w;

        trans++;
        }
    }

    public String toString() {
        return "Name:"+name+"\nType:"+ type+"\nAccount No.:"+ accNo+"\nAccount Balance:"+ balanceAmount;
    }
}

class Driver3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name, type;
        long accNo;
        double balanceAmount;

        System.out.print("Enter Account Holder Name : ");
        name = sc.nextLine();

        System.out.print("Enter Account Type : ");
        type = sc.nextLine();

        System.out.print("Enter Account Number : ");
        accNo = sc.nextLong();

        System.out.print("Enter Balance Amount : ");
        balanceAmount = sc.nextDouble();

        Account Ac = new Account(name, type, accNo, balanceAmount);

        System.out.println(Ac);
        System.out.println("Enter deposit amount: ");
        double d = sc.nextDouble();
        Ac.deposit(d);
        System.out.println("Balance: "+Ac.amount());
        
        System.out.println("Enter withdrawal amount: ");
        double w = sc.nextDouble();
        Ac.withdrawal(w);
        System.out.println("Balance: "+Ac.amount());
    }
}