package lang.wrapper;

public class AutoboxingMain2 {

    public static void main(String[] args) {
        //primitive -> wrapper
        int value = 7;
        Integer boxedValue = value; //Auto-boxing

        //wrapper -> primitive
        int unboxedValue = boxedValue; //Auto-unboxing

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
