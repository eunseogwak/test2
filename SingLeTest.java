public class SingLeTest {
    private static Single instance = new Single();
    private Single() { }  //전용 생성자

    public static Single getInstance() {
        return instance;
    }
}

public class SingleTest {
    public static void main(String[] args){
        Single obj1 = SingLe.getInstance();
        Single obj2 = SingLe.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
