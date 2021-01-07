package stage6.hw29;

public class BigIntegerConverter {
    public static Number getBigInteger(String number) {
        java.math.BigInteger bigNumber = new java.math.BigInteger(number);
        return bigNumber;
    }
}
