package OopsExplaination;

class SuperClass {
    void display(){
        System.out.println("Hello Super Class");
    }
}
class SubClass extends SuperClass {
    void display() {
        System.out.println("Hello Sub Class");
    }
}

public class MethodOverridingConcept {
    public static void main(String [] args){
        SuperClass sup = new SuperClass();
        sup.display();
        SubClass sup1 = new SubClass();
        sup1.display();
        //SubClass sup3 = new SuperClass(); Error
        //sup3.display();
        SuperClass sup4 = new SubClass();
        sup4.display();
    }
}

