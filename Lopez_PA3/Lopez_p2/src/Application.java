public class Application {

    public static void main (String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        SavingsAccount.modifyInterestRate(0.04);
        for ( int i=1; i<=12;i++){
            saver1.calculateMonthlyInterest();
            System.out.printf("Saver 1: Month %d balance, including interest: $ %.2f\n",i, saver1.giveSavingsBalance());
            saver2.calculateMonthlyInterest();
            System.out.printf("Saver 2: Month %d balance, including interest: $ %.2f\n\n\n",i, saver2.giveSavingsBalance());
        }
        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        System.out.printf("ATTENTION: change in interest rate- next months balance with new interest: $ %.2f\n",saver1.giveSavingsBalance());
        saver2.calculateMonthlyInterest();
        System.out.printf("ATTENTION: change in interest rate- next months balance with new interest: $ %.2f\n",saver2.giveSavingsBalance());


    }
}
