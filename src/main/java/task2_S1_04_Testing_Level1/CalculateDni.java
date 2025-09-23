package task2_S1_04_Testing_Level1;

public class CalculateDni {

    public static char calculateDni(int dniNumber) {
        if (dniNumber < 0 || dniNumber > 99999999) {
            throw new IllegalArgumentException("Invalid DNI number");
        }
        char[] lettersDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int letter = dniNumber % 23;
        return lettersDNI[letter];
    }

}
