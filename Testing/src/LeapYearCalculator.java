public class LeapYearCalculator {
    public static void main(String[] args) {
        int startYear = 1600;
        int endYear = 2100;
        int leapCount = 0;
        int lineCount = 0;

        System.out.println("Leap years for time period: " + startYear + " to " + endYear);
        for(int i = startYear; i <= 2100; i++){
            if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)){
                leapCount += 1;
                if (lineCount < 9){
                    System.out.print(i + " ");
                    lineCount ++;
                }
                else {
                    System.out.println(i + " ");
                    lineCount = 0;
                }
            }
        }
        System.out.println("\nTotal number of leap years: " + leapCount);

    }
}
