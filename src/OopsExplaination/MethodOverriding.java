package OopsExplaination;

class Tv{
    void changeChannel(){System.out.println("Tv Channel Change");}
    void changeVolume(){System.out.println("Tv Volume Change");}
}
class smartTv extends Tv{
    @Override
    void changeChannel(){System.out.println("Tv Channel Change");}
    @Override
    void changeVolume(){System.out.println("Tv Volume Change");}
    void Browsing(){System.out.println("SmartTv you can connect to Internet");}
}

public class MethodOverriding {
    public static void main(String [] args){
        Tv tv = new Tv();
        tv.changeChannel();
        tv.changeVolume();

    }
}
