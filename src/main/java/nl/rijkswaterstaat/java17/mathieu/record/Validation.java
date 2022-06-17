package nl.rijkswaterstaat.java17.mathieu.record;

public final class Validation {
    public static void checkThat(boolean expr, String message){
        if(!expr){
            throw new IllegalArgumentException(message);
        }
    }
}
