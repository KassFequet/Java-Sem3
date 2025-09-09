package PracticeWeek1;

public class LabTask13 {
    public static void main(String[] args) {
        float investment = 1000.0f;
        float rate = 0.05f;
        int years = 10;

        System.out.println("Year\tAmount on deposit");

        for (int year = 1; year <= years; year++) {
            investment = investment * (1 + rate);
            System.out.printf("%d\t%.2f\n", year, investment);
        }
    }
}

