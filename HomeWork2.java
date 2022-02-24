public class HomeWork2 {
    public static void main (String[] args) {
        System.out.println(sum());
        two();
        System.out.println(three());
        four();

    }
    public static boolean sum () {
        int a = 5;
        int b = 6;
        int c = a + b;

        if (10 <= c && c <= 20) {
            return true;
        }else {
            return false;
        }
    }
    public static void two () {
        int a = -2;
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
    public static boolean three (){
        int z = 3;
        if (z > 0) {
            return false;
        }else {
            return true;
        }
    }
    public static void four () {
        for (int i = 0; i < 5; i++) {
            System.out.println("Здесь должна быть жизненая цитата");
        }
    }
}
