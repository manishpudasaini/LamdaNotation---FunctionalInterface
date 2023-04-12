package FunctionalInterfaceLamda;

public class PracticeImpAnnonomousClass {
    public static void main(String[] args) {
//        Practice practice = new Practice() {
//            @Override
//            public String displayStr() {
//                String text = "Halamadrid";
//                return text;
//            }
//        };

        //without using annonomous class we can us lamda notation
        //Practice practice1 = ()->"Manish pudasaini";
        Practice add = (a,b,c)-> a+b+c;
        Practice subtract = (a,b,c)-> a+b-c;
        Practice multiply = (a,b,c)-> a*b*c;


        System.out.println("Addition = "+add.threeNumOperation(2,5,5));
        System.out.println("Subtraction = "+subtract.threeNumOperation(10,5,5));
        System.out.println("Multiplication = "+multiply.threeNumOperation(2,5,5));

        System.out.println("Default access modifier output = "+multiply.print());
    }
}
