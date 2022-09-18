public class YearlyMaintenanceCost {
    public static void main(String[] args) {
        double SpringCost = 1000.5;
        double SummerCost = 2005.34;
        double FallCost = 839.61;
        double WinterCost = 4013.23;
        double TotalCost;

        TotalCost = SpringCost + SummerCost + FallCost + WinterCost;

        System.out.println("The cost after spring, $" + SpringCost + ", Summer, $" + SummerCost + ", Fall, $" + FallCost +", and Winter, $" + WinterCost + ", is a total of $" + TotalCost);

    }
}