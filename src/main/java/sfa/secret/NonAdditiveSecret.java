package sfa.secret;

public class NonAdditiveSecret implements Secret {
    @Override
    public int secret(int number) {
        return number + 2;
    }
}
