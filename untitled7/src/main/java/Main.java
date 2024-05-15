import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //String tempName, tempPose;
        //int wallet;
        //System.out.println("Input a name of employer:");
        //tempName = input.nextLine();
        //System.out.println("Input a employer's pose:");
        //tempPose = input.nextLine();
        //System.out.println("Current wallet:");
        //wallet = input.nextInt();
        hourlyPaymentEmployer employer_1 = new hourlyPaymentEmployer("Ivanov A A", "Janitor", 0, 100);
        fullTimeEmployer employer_2 = new fullTimeEmployer("Petrov V V", "Office worker", 0, 200);

        System.out.println(employer_1.check());
        System.out.println("Pay to " + employer_1.name + ": *YES / NO*");
        String temp = input.nextLine();
        if(temp.equals("YES")) {
            System.out.println("How many hours " + employer_1.name + " works:");
            int countOfHours = input.nextInt();
            employer_1.wallet =  employer_1.pay(employer_1.payment, countOfHours);
        }else{
            System.out.println("You don't pay" + employer_1.name);
        }
        System.out.println(employer_1.checkWallet());

        System.out.println("\n\n");
        System.out.println(employer_2.check());
        System.out.println("Pay to " + employer_2.name + ": *YES / NO*");
        temp = input.nextLine();
        if(temp.equals("YES")) {
            employer_2.wallet =  employer_2.pay(employer_2.payment);
        }else{
            System.out.println("You don't pay" + employer_2.name);
        }
        System.out.println(employer_2.checkWallet());

        System.out.println("\n\n");
        procentPaymentEmployer employer_3 = new procentPaymentEmployer("Smirnov A V", "rialto", 0, 45);
        System.out.println(employer_3.check());
        System.out.println("How many " + employer_3.name + "receive for last operation: ");
        double countOfPayment = input.nextDouble();
        System.out.println(employer_3.name + "earned " + (employer_3.pay(countOfPayment)));
        employer_3.wallet = (int)(employer_3.pay(countOfPayment));
        System.out.println(employer_3.checkWallet());
    }
}
