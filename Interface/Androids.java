package Interface;

public class Androids implements Smartphones, LinuxOS{


    @Override
    public void call() {
        System.out.println("call android");
    }

    @Override
    public void sms() {
        System.out.println("send sms android");
    }

    @Override
    public void internet() {
        System.out.println("use the internet android");
    }
}
