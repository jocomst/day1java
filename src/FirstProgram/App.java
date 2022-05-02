package FirstProgram;

public class App {
    public static void main(String[] args) {
        MyNameIs me = new MyNameIs();
        me.sayName();
        Vacation vacay = new Vacation();
        vacay.wantToVisit();
        HiFriend hello = new HiFriend();
        hello.sayHi("John", "Comstock");
    }
    
}
