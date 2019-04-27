import java.security.NoSuchAlgorithmException;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return 0;
    }


    public double div(double a, double b) {
        return 0;

    }

    public double mod(double a, double b) {
        if(b == 0){
            throw new IllegalArgumentException("IllegalArgumentExcpetion by zero");
        }
        return a % b;
    }

    public double pow(double a, double n) {
        return Math.pow(a, n);
    }

    //Shift는 반환형 자신이 정해서 그것으로 테스트할것
    public int leftShift(int a, int n) {
        return a << n;
    }

    public int rightShift(int a, int n) {
        return a >> n;
    }

    //2진수 변환
    public String toBinary(int integerDeca) {
        StringBuilder sb = new StringBuilder();
        for(int index = 31; index > -1; index--){
            int mask = 1 << index;
            int DecaToBinary = ((integerDeca & mask) != 0) ? 1 : 0;
            sb.append(DecaToBinary);
        }
        return sb.toString();
    }

    public String toHexa(int integerDeca) {
        String intToString = Integer.toString(integerDeca);
        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < intToString.length(); ++index) {
            sb.append((Character.digit(intToString.charAt(index), 16)));
        }
        return sb.toString();
    }
}