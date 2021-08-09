package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;
	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Int Minimum value = " + myMinIntValue);
        System.out.println("Int Maximum value = " + myMaxIntValue);
        System.out.println("Busted MAX value = "  + (myMaxIntValue + 1));
        System.out.println("Busted MIN value =  " + (myMinIntValue - 1));

        int myMaxIntTest = 214_748_367;
        System.out.println(myMaxIntTest);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value = " + myMinByteValue);
        System.out.println("Byte Maximum value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value = " + myMinShortValue);
        System.out.println("Short Maximum value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum value = " + myMinLongValue);
        System.out.println("Long Maximum value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2 );

        byte myChallengeByteValue = 64;

        short myChallengeShortValue = 28802;

        int myChallengeIntValue = 1_934_567_890;

        long myChallengeLongValue = 50000L + 10L * ( myChallengeByteValue + myChallengeShortValue + myChallengeIntValue);

        System.out.println(myChallengeLongValue);

    }
}
