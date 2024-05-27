package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello"); //x001
        String str2 = new String("hello"); //x002

        System.out.println("new String() == 비교: " + (str1 == str2)); //false : 참조값이 다르다!
        System.out.println("new String equals 비교: " + (str1.equals(str2))); //true : 문자의 값이 같다!

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교: " + (str3 == str4)); //true : 문자열 리터럴을 사용하는 경우 자바는 메모리 효율성과 성능 최적화를 위해
        //문자열 풀(String Pool)을 사용한다.
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));
    }
}
