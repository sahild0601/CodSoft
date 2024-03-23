import java.util.Scanner;
    class GameNumber{
     
        public static void main(String[] args) {
            int n,Number;
             int Limit=5;
            System.out.println("\t\t\tWelcome TO Guessing Number Game\n");
            Number = (int)(Math.random()*(100-1)+1);
            // System.out.println(Number);
            do{
            System.out.print("\nEnter Your Guess(1 to 100):");
            Scanner sc = new Scanner(System.in);
                n = sc.nextInt();
                if(n>100){
                    System.out.println("Please Enter Number Between 1 TO 100");  
                }
                
                else if(Number == n){
                    System.out.println("Hurry!!!! You Gussed Perfect Number "+Number);
                    break;
                }
                
                else if(Number > n){
                    System.out.println("You Enterd Number is Lower\n Your Attempt is Remaining:"+Limit);
                    Limit--;
                }
                else if(Number < n) {
                    System.out.println("You Enterd Number is Higher\nYour Attempt is Remaining:"+Limit);
                    Limit--;
                }
               
        }while(Limit!=-1);
        System.out.println("\n\n\t\tYour Limit Is Over!!!!! You Lost The Game \n\t\t The Number Was:"+Number);

        }
            
        }
    

   
       
