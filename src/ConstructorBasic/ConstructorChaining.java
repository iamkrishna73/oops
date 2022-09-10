package ConstructorBasic;

class A{
    A(){
        this(5);
        System.out.println("Super class first constructor");

    }
    A(int i){
        System.out.println("Super class Second constructor");
    }
}
class B extends A{
    B(int i){
        System.out.println("Sub class first constructor");
    }
    B(){
        super(3);
        System.out.println("Sub class second constructor");
    }
}

public class ConstructorChaining {
    public static void main(String [] args){
        B b1 = new B(10);
        B b2 = new B();
    }
}
