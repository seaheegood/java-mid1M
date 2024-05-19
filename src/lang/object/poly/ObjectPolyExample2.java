package lang.object.poly;

public class ObjectPolyExample2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object(); //Object 인스턴스도 만들 수 있다.

        Object[] objects = {dog, car, object};

        size(objects);
    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는: " + objects.length);
    }
}

/**
 * Object 가 없다면?
 * void action(Object obj) 와 같이 모든 객체를 받을 수 있는 메서드를 만들 수 없다.
 * Object[] objects 처럼 모든 객체를 저장할 수 있는 배열을 만들 수 없다.
 */
