import java.util.Scanner;

class Pin{
     int PIN=0601 ;
int pin;
   void pin1(){
        do{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Pin:");
        pin = sc.nextInt();  
        if(pin!=PIN){
        System.out.println("Enter Valid Pin");
}
}while(pin==PIN);
 }
}




    class Main extends Pin{
        double Bal=5000D;
        int WD,DP;
        long phone,uphone=9067729885L;

        void Menu(){
            System.out.println("*******************");
            System.out.println("1.Check Balance");
            System.out.println("2.Withdraw");
            System.out.println("3.Deposite");
            System.out.println("4.Change Pin"); 
            System.out.println("5.Exit");
            System.out.println("*******************");

        }
     void checkblance(){
         System.out.print("Your Balance is :"+Bal+"\n");
        //  Menu();

     }

     void Withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Amount:");
        WD = sc.nextInt();
	if(WD<Bal){
	Bal=WD-Bal;
  	System.out.println("THE AMOUNT IS WITHDRAW");
}
	else {
	System.out.println("Insufficient Balance");

}

        // Menu();
     }

     void Deposite(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Amount:");
        DP = sc.nextInt();
        Bal = Bal + DP;
        // Menu();
        System.out.println("YOUR AMOUNT DEPOSITED");
}

     void changepin(){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Phone No:");
       phone  = sc.nextLong();  
       if(phone == uphone ){
        System.out.println("Enter Your New Pin Here:");
        PIN = sc.nextInt();
       }
        else{

            System.out.println("This Phone Number Not Linked To The Account");
        }
        
       
     }
    }

public class ATM {
    public static void main(String[] args) {
        Main M = new Main();
        M.pin1();
        
        Scanner sc = new Scanner(System.in);
        int N ;
        
        do{
            M.Menu();
            System.out.println("Enter Choice:");
        N =sc.nextInt();
        switch(N){
           
            case 1 :
                M.checkblance();
                break;
            case 2 :
                M.Withdraw();
                break;
            case 3 :
                M.Deposite();
                break;
            case 4 :
                M.changepin();
                M.pin1();
                break;
            case 5 :
            System.out.println("Thank You For Visiting!!!!!");
            break;
            default:
            System.out.println("Enter The Valid Choice");
        }
    }while(N!=5);
        
    }
    
}
