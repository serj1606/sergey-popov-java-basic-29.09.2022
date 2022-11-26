package Interface;

public class IPhones implements Smartphones, IOS{


    @Override
    public void call() {
        System.out.println("call iphone");
    }

    @Override
    public void sms() {
        System.out.println("send sms iphone");
    }

    @Override
    public void internet() {
        System.out.println("use the internet iphone");
    }
}
