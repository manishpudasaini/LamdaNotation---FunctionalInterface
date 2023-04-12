package FunctionalInterfaceLamda;

public interface Practice {

    //In functionalInterface we cann't have two abstract methods

    //String displayStr();
    int threeNumOperation(int a, int b, int c);

    default String print(){
        String text ="using Default access modifier to create body in interface";
        return text;
    }
}
