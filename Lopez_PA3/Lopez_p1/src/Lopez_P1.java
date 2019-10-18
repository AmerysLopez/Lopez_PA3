import java.util.Scanner;
import java.security.SecureRandom;

public class Lopez_P1 {



        public static int GetRandomNumbers(int digits) {
            SecureRandom random = new SecureRandom();
            int integer=0;
            switch(digits){
                case 1:
                    integer = random.nextInt(10);
                    break;
                case 2:
                    integer = random.nextInt((99-10)+1)+10;
                    break;
                case 3:
                    integer = random.nextInt((999-100)+1)+100;
                    break;
                case 4:
                    integer = random.nextInt((9999-1000)+1)+1000;
                    break;
                default:
                    break;
            }
            return integer;
        }

        public static void GetNegativeResponse() {
            SecureRandom random = new SecureRandom();
            int integer = random.nextInt((4-1)+1)+1;
            //   System.out.println(integer);
            switch (integer){
                case 1:
                    System.out.println("No. Please try again.");
                    break;
                case 2:
                    System.out.println("Wrong. Try once more.");
                    break;
                case 3:
                    System.out.println("Don’t give up!");
                    break;
                case 4:
                    System.out.println("No. Keep trying.");
                    break;
            }
        }


        public static void GetPositiveResponse() {
            SecureRandom random = new SecureRandom();
            int integer = random.nextInt((4-1)+1)+1;
            //   System.out.println(integer);
            switch (integer){
                case 1:
                    System.out.println("Very good!");
                    break;
                case 2:
                    System.out.println("Excellent!");
                    break;
                case 3:
                    System.out.println("Nice work!");
                    break;
                case 4:
                    System.out.println("Keep up the good work!");
                    break;
            }
        }

        public static void GetPercentage(int amountCorrect, int amountIncorrect) {
            double percentage = (amountCorrect/10.000)*100.00;
            System.out.printf("\n\nPercentage correct: %.2f",percentage);
            System.out.println("%");
            System.out.println("Amount correct: "+amountCorrect);
            System.out.println("Amount incorrect: "+ amountIncorrect);

            if (percentage<75){System.out.println("Please ask your teacher for extra help.\n\n");}
            else {System.out.println("Congratulations, you are ready to go to the next level!\n\n");}

        }

        public static void Multiplication(int digit){
            int amountCorrect = 0;
            int amountIncorrect = 0;
            for (int i = 0; i < 10; i++) {
                Scanner scnr = new Scanner(System.in);
                int integer1 = GetRandomNumbers(digit);
                int integer2 = GetRandomNumbers(digit);
                double answer;
                System.out.println("\nHow much is " + integer1 + " times " + integer2 + "?");
                answer = scnr.nextDouble();
                if (Math.abs(answer -(integer1*integer2)) < 0.01) {
                    GetPositiveResponse();
                    amountCorrect++;
                } else {
                    GetNegativeResponse();
                    amountIncorrect++;
                }
            }
            GetPercentage(amountCorrect, amountIncorrect);

        }

        public static void Addition(int digit){
            int amountCorrect = 0;
            int amountIncorrect = 0;
            for (int i = 0; i < 10; i++) {
                Scanner scnr = new Scanner(System.in);
                int integer1 = GetRandomNumbers(digit);
                int integer2 = GetRandomNumbers(digit);
                double answer;
                System.out.println("\nHow much is " + integer1 + " plus " + integer2 + "?");
                answer = scnr.nextDouble();
                if (Math.abs(answer -(integer1+integer2)) < 0.01) {
                    GetPositiveResponse();
                    amountCorrect++;
                } else {
                    GetNegativeResponse();
                    amountIncorrect++;
                }
            }
            GetPercentage(amountCorrect, amountIncorrect);

        }
        public static void Division(int digit){
            int amountCorrect = 0;
            int amountIncorrect = 0;
            for (int i = 0; i < 10; i++) {
                Scanner scnr = new Scanner(System.in);
                int integer1 = GetRandomNumbers(digit);
                int integer2 = GetRandomNumbers(digit);
                double answer;
                System.out.println("\nHow much is " + integer1 + " divided by " + integer2 + "?");
                answer = scnr.nextDouble();
                if (Math.abs(answer -(integer1/integer2)) < 0.01) {
                    GetPositiveResponse();
                    amountCorrect++;
                } else {
                    GetNegativeResponse();
                    amountIncorrect++;
                }
            }
            GetPercentage(amountCorrect, amountIncorrect);

        }
        public static void Subtraction(int digit){
            int amountCorrect = 0;
            int amountIncorrect = 0;
            for (int i = 0; i < 10; i++) {
                Scanner scnr = new Scanner(System.in);
                int integer1 = GetRandomNumbers(digit);
                int integer2 = GetRandomNumbers(digit);
                double answer;
                System.out.println("\nHow much is " + integer1 + " minus " + integer2 + "?");
                answer = scnr.nextDouble();
                if (Math.abs(answer -(integer1-integer2)) < 0.01) {
                    GetPositiveResponse();
                    amountCorrect++;
                } else {
                    GetNegativeResponse();
                    amountIncorrect++;
                }
            }
            GetPercentage(amountCorrect, amountIncorrect);

        }


        public static void AllMixed(int digit){
            SecureRandom random = new SecureRandom();
            int amountCorrect = 0;
            int amountIncorrect = 0;
            for (int i = 0; i < 10; i++) {
                Scanner scnr = new Scanner(System.in);
                int integer1 = GetRandomNumbers(digit);
                int integer2 = GetRandomNumbers(digit);
                double answer;
                int SpecificType = random.nextInt(4);
                switch (SpecificType){
                    case 1:
                        System.out.println("\nHow much is " + integer1 + " minus " + integer2 + "?");
                        answer = scnr.nextDouble();
                        if (Math.abs(answer -(integer1-integer2)) < 0.01) {
                            GetPositiveResponse();
                            amountCorrect++;
                        } else {
                            GetNegativeResponse();
                            amountIncorrect++;
                        }
                        break;
                    case 2:
                        System.out.println("\nHow much is " + integer1 + " plus " + integer2 + "?");
                        answer = scnr.nextDouble();
                        if (Math.abs(answer -(integer1+integer2)) < 0.01) {
                            GetPositiveResponse();
                            amountCorrect++;
                        } else {
                            GetNegativeResponse();
                            amountIncorrect++;
                        }
                        break;
                    case 3:
                        System.out.println("\nHow much is " + integer1 + " divided by " + integer2 + "?");
                        answer = scnr.nextDouble();
                        if (Math.abs(answer -(integer1/integer2)) < 0.01) {
                            GetPositiveResponse();
                            amountCorrect++;
                        } else {
                            GetNegativeResponse();
                            amountIncorrect++;
                        }
                        break;
                    case 4:
                        System.out.println("\nHow much is " + integer1 + " times " + integer2 + "?");
                        answer = scnr.nextDouble();
                        if (Math.abs(answer -(integer1*  integer2)) < 0.01) {
                            GetPositiveResponse();
                            amountCorrect++;
                        } else {
                            GetNegativeResponse();
                            amountIncorrect++;
                        }
                        break;
                }

            }
            GetPercentage(amountCorrect, amountIncorrect);

        }





        public static void GetProblemType(int digit, int type){
            switch(type){
                case 1:
                    Addition(digit);
                    break;
                case 2:
                    Multiplication(digit);
                    break;
                case 3:
                    Subtraction(digit);
                    break;
                case 4:
                    Division(digit);
                    break;
                case 5:
                    AllMixed(digit);
                    break;
            }
        }


        public static void main(String[] args) {
            int digit;
            int type;
            int cont=1;
            Scanner scnr = new Scanner(System.in);
            do {
                System.out.println("What level of difficulty would you like? Please enter value 1-4:");
                digit = scnr.nextInt();
                System.out.println("What types of math problems would you like? Please enter a number 1-5. 1 is addition only, 2 is multiplication only, 3 is subtraction only, 4 is division only, and 5 is a mix of addition, subtraction, multiplication, and division.");
                type = scnr.nextInt();
                GetProblemType(digit, type);
                System.out.println("Would you like to begin a new session? Enter 1 to do so, enter any other number to terminate:");
                cont=scnr.nextInt();
            }while (cont==1);

        }


    }



