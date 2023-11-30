package operator;

public class Operator2 {
    public static void main(String[] args) {
        //문자열과 문자열 더하기1
        String result1 = "Hello" + "world";
        System.out.println("result1 = " + result1);

        //문자열과 문자열 더하기2
        String s1 = "String1";
        String s2 = "String2";
        System.out.println(s1+s2);

        //문자열과 숫자더하기
        String result3 = "a + b =" + 10;
        System.out.println("result3 = " + result3);

        //문자열과 숫자더하기2
        int num = 20;
        String str = "a+b = ";
        String result4 = str + num;
        System.out.println("result4 = " + result4);

        //문자열에 더하는건 모두 문자열로 바뀐 후 더해진다.
    }
}
