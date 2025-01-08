public class CalibrationSum {
    public static void main(String[] args) {
        String[] lines = {
            "ckmb52fldxkseven3fkjgcbzmnr7",
            "gckhqpb6twoqnjxqplthree2fourkspnsnzxlz1", 
        };
        
        int totalSum = 0;
        
        for (String line : lines) {
            int firstDigit = extractFirstDigit(line);
          int lastDigit = extractLastDigit(line);
            int calibrationValue = firstDigit * 10 + lastDigit;
            
            totalSum += calibrationValue;
        }
      
      System.out.println("Total Sum of Calibration Values: " + totalSum);
    }

  private static int extractFirstDigit(String line) {
        for (char c : line.toCharArray()) {
            if (Character.isDigit(c)) {
                return Character.getNumericValue(c);
            }
        }
                return 0; 
    }

   private static int extractLastDigit(String line) {
        for (int i = line.length() - 1; i >= 0; i--) {
            if (Character.isDigit(line.charAt(i))) {
                return Character.getNumericValue(line.charAt(i));
            }
        }
                return 0;
    }
}
