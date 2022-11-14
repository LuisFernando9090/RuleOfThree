package Percentage;

import java.util.Scanner;

public class RuleOfThree {

    Scanner input = new Scanner(System.in);

    private float valueOfPercentage;
    private float percentageTotal = 100;
    private float valueOrAmount;
    private float total;

    public void inputValue() {
        System.out.println("Value of Porcentage? ");
        this.valueOfPercentage = input.nextInt();
        System.out.println("Value or Amount? ");
        this.valueOrAmount = input.nextInt();
    }

    public void expressionIncrease() {
        this.total = (this.valueOfPercentage / this.percentageTotal) * this.valueOrAmount;
        System.out.printf("Increase: R$ %.2f %n", this.total);
        this.total = this.total + this.valueOrAmount;
        System.out.printf("New Value: R& %.2f %n", this.total);
    }
}
