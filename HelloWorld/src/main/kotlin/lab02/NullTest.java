package lab02;

public class NullTest {

    static String dogName = "Sharik";

    public static void main(String[] args) {
//        dogName = "Bobik";

        if (dogName != null){
            System.out.printf("Довжина імені моєї собаки = %d", dogName.length());
        } else {
            System.out.printf("Довжина імені моєї собаки = null");
        }

    }

    void foo(String bar){
        if (bar == null){
            return;
        }

        System.out.println("foo is working...");
    }

}
