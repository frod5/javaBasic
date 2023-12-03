package cond.ex;

public class GradeSwitchEx {
    public static void main(String[] args) {
        String grade = "A";

        switch (grade) {
            case "A":
                System.out.println("탁월");
                break;
            case "B":
                System.out.println("준수");
                break;
            case "C":
                System.out.println("애매");
                break;
            case "D":
                System.out.println("에휴");
                break;
            case "F":
                System.out.println("탈락");
                break;
            default:
                System.out.println("이상한 값");
        }
    }
}
