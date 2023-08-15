public class Demo5 {
    public static void main(String[] args) {
        int firstBlock = 978;
        int secondBlock  = 3;
        int thirdBlock  = 16;
        int fourthBlock  = 1484100;

        String COLOR1 = "\033[32m";
        String COLOR2 = "\033[33m";
        String COLOR3 = "\033[34m";
        String COLOR4 = "\033[35m";
        String RESET = "\033[0m";

        System.out.printf("%s%s%s-%s%s%3$s-%s%s%3$s-%s%s%3$s\n", COLOR1,firstBlock ,RESET,COLOR2,secondBlock ,COLOR3,thirdBlock ,COLOR4,fourthBlock );
    }
}