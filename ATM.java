import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int pin=1223;
        double balence=10000.00;
        boolean exit=true;
        Scanner sc= new Scanner(System.in);
        while(exit){
            System.out.println("******Wellcome to MY ATM******");
            System.out.println("1.view balence\n2.withdraw\n3.deposit\n4.ChangePin5.exit\n");
            int ch=sc.nextInt();
            switch(ch){
                case 1:{
                    System.out.println("Enter the pin to check the balence");
                    int checkPin=sc.nextInt();
                    if(pin == checkPin){
                        System.out.println("Your Balence : "+balence);
                    }
                    else{
                        System.out.println("Check your pin");
                    }
                    break;
                }
                case 2:{
                    System.out.println("Enter the pin to WithDraw");
                    int checkPin=sc.nextInt();
                    if(pin == checkPin){
                        System.out.println("Enter the Ammount to WithDraw");
                        double withdraw=sc.nextDouble();
                        if(balence>withdraw){
                            balence-=withdraw;
                            System.out.println("WithDrawn  Sucsessfully");
                        }else{
                            System.out.println("Insuffisiant Balence");
                        }
                        break;
                    }
                    else{
                        System.out.println("Check your pin");
                    }
                    break;
                }
                case 3:{
                    System.out.println("Enter the pin to deposit");
                    int checkPin=sc.nextInt();
                    if(pin == checkPin){
                        System.out.println("Enter the Ammount to Deposit");
                        double Deposit=sc.nextDouble();
                        if(Deposit>0.0){
                            balence+=Deposit;
                            System.out.println("Ammount Deposited Sucsessfully");
                        }else{
                            System.out.println("Ammount Could not Deposit");
                        }
                        break;
                    }
                    else{
                        System.out.println("Check your pin");
                    }
                    break;
                }
                case 4:{
                        System.out.println("Enter the old pin to change");
                        int c=sc.nextInt();
                        if(c==pin){
                            System.out.println("Enter the new pin to change");
                            int newPin=sc.nextInt();
                            pin=newPin;
                            System.out.println("pin changed Sucsessfully");
                        }
                        else{
                            System.out.println("Check your pin");
                        }
                }
                case 5:{
                    while(exit){
                        exit=true;
                        System.out.println("Enter the ");
                        char c=sc.next().charAt(0);
                        if(c == 'y' || c=='Y'){
                            exit=false;
                        }   
                        if(c == 'n' || c=='N'){
                            System.out.println("You ar still logged in");
                        }   
                    }
                    break;
                }
            }
        }
        sc.close();
    }
}
