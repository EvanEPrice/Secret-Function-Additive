package sfa.secret;

public class AdditiveSecret implements Secret{
    @Override
    public int secret(int number) {
        return number * 2;
    }
}
