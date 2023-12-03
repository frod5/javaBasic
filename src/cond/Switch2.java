package cond;

public class Switch2 {
    public static void main(String[] args) {
        int grade = 2;

        //Java 14에 도입된 새 switch
        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 3000;
        };

        System.out.println("coupon = " + coupon);
    }
}
