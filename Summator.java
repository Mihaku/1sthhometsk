import java.math.BigInteger;

public class Summator {
    private BigInteger firstNumber, secondNumber ;
    public void setFirstNumber(BigInteger a) {
        firstNumber = a;
    }
    public void setSecondNumber(BigInteger b) {
        secondNumber = b;
    }
    public BigInteger sum() {
        BigInteger result = firstNumber.add(secondNumber);
        return result;
    }
}