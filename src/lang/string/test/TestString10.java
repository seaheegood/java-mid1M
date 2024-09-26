package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] fruitsArray = fruits.split(",");
        for (String s : fruitsArray) {
            System.out.println(s);
        }

        String joinedString = String.join("->", fruitsArray);
        System.out.println("joinedString = " + joinedString);
    }
}
