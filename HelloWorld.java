public class HelloWorld {

    //    ctrl + alt + L
    public static void main(String[] args) {
        // code
        System.out.println("Hello world!");

        int value = 9;
//        value = value + 1;
//        value += 1;
        value++;
        System.out.println(value);

        int first = 50;
        int second = 5;

        boolean result = first > second;

        System.out.println(result);
    }

    @Override
    public String toString() {
        return "HelloWorld{}";
    }
}

