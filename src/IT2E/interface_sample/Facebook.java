package IT2E.interface_sample;

public class Facebook  extends UserInterface implements Authenticator  {
    @Override
    public void login() {
        System.out.println("Login Successful");
    }

    @Override
    public void sendOTP()
    {

    }
}
