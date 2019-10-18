import java.util.Scanner;
public class SavingsAccount {


        private static double annualInterestRate;
        private double savingsBalance;

        public SavingsAccount(double savingsBalance){
            this.savingsBalance=savingsBalance;
        }

        public void calculateMonthlyInterest() {
            double monthlyInterestRate = (this.savingsBalance * annualInterestRate) / 12;
            this.savingsBalance += monthlyInterestRate;
        }

        public static void modifyInterestRate (double annualInterestRateNew) {
            annualInterestRate= annualInterestRateNew;
        }

        public double giveSavingsBalance ( ) {
            return this.savingsBalance;
        }

        public double giveAnnualInterestRate ( ) {
            return annualInterestRate;
        }

    }

