package OopsExplaination;

class SuperClass1{
    void method1(){
        System.out.println("Super Method1");
    }
    void method2(){
        System.out.println("Super Method2");
    }
}
class Sub extends SuperClass1{

    void method2(){
        System.out.println("Sub Method2");
    }
    void method3(){
        System.out.println("Sub Method3");
    }
}

public class DynamicDispatch {
    public static void main(String [] args){
        SuperClass1 sup = new SuperClass1();
        sup.method1();
        sup.method2();
        System.out.println("--------");
        Sub sub = new Sub();
        sub.method1();
        sub.method2();
        sub.method3();
        System.out.println("--------");
        SuperClass1 sup2 = new Sub();
        sup2.method1();
        sup2.method2();
    }
}
