package task2_S1_04_Level1;

public class CalculateDni {

    public static final int MIN_DNI = 0;
    public static final int MAX_DNI = 99999999;

    public static char calculateDni(int dniNumber) {
        if (dniNumber < MIN_DNI || dniNumber > MAX_DNI) {
            throw new IllegalArgumentException("Invalid DNI number");
        }
        char[] lettersDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int letter = dniNumber % 23;
        return lettersDNI[letter];
    }
}
