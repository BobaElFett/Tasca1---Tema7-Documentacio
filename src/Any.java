public class Any {
    private long any;
    public Any(long any) {
        this.any = any;
    }

    public static int digitsDiferents(long any) {
        int numDigits = 0;
        while (any != 0) {
            any = any / 10;
            numDigits++;
        }
        return numDigits;
    }

    public long getAny() {
        return any;
    }
}
