package calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int staff_expenses;
        int other_expenses;
        double net_income;

        String bubblegum = "Bubblegum: $";
        int bubblegumEarn = 202;
        String tofee = "Toffee: $";
        int tofeeEarn = 118;
        String iceCream = "Ice cream: $";
        int iceCreamEarn = 2250;
        String milkChocolate = "Milk chocolate: $";
        int milkChocolateEarn = 1680;
        String doughnut = "Doughnut: $";
        int doughnutEarn = 1075;
        String pancake = "Pancake: $";
        int pancakeEarn = 80;

        String Prices = "Earned amount:\n" + bubblegum + bubblegumEarn + "\n" + tofee + tofeeEarn + "\n" + iceCream + iceCreamEarn + "\n" + milkChocolate + milkChocolateEarn + "\n" + doughnut + doughnutEarn + "\n" + pancake + pancakeEarn;
        double earned_amount = bubblegumEarn + tofeeEarn + iceCreamEarn + milkChocolateEarn + doughnutEarn + pancakeEarn;

        System.out.println(Prices + "\n");
        System.out.printf("Income: $ %.2f \n", earned_amount);

        System.out.println("Staff expenses:");
        staff_expenses = scanner.nextInt();
        System.out.println("Other expenses:");
        other_expenses = scanner.nextInt();

        net_income = earned_amount - staff_expenses - other_expenses;
        System.out.printf("Net income: $%.2f", net_income);
    }
}
