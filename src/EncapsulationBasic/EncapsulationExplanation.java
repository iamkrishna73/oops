package EncapsulationBasic;

class Rectangle{
    private int length;
    private int breadth;

    public void setLength(int length) {
        this.length = length;
        if(length <= 0){
            System.out.println("Length can't be Negative or zero");
        }
    }
    public int getLength() {
        return length;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
        if(breadth <= 0){
            System.out.println("breadth can't be Negative or zero");
        }
    }
    public int getBreadth() {
        return breadth;
    }

    public void displayResult(){
        System.out.println("The Area of rectangle: " + length*breadth);
    }
}

public class EncapsulationExplanation {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5);
        rectangle.setBreadth(2);
        if(rectangle.getLength() <= 0 || rectangle.getBreadth() <= 0){
            System.out.println("Unknown Input");
        }
        else {
            rectangle.displayResult();
        }
    }
}
