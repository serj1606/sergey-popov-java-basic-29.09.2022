package Interface;

public class SmartMain {
    public static void main(String[] args) {
        Androids androids = new Androids();
        IPhones iPhones = new IPhones();

        androids.call();
        androids.sms();
        androids.internet();

        System.out.println("----------------------------");

        iPhones.call();
        iPhones.sms();
        iPhones.internet();
    }
}