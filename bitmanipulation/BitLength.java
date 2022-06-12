/*
 * 
 * Input: 8

Output: 4 (1000)


Steps:

    Initialize a variable bitsCounter with value 0.
    Now, left-shift bitsCounter until its values is less or equals to given number.
        if true, increament the bitsCounter. on each iteration.
        else, return bitsCounter.

 */
class BitLength {
    static int bitsLength(int number) {
        int bitsCounter = 0;

        while ((1 << bitsCounter) <= number) {
            bitsCounter += 1;
        }
        return bitsCounter;
    }

    public static void main(String[] args) {
        System.out.println(bitsLength(8));
        System.out.println(bitsLength(2));
        System.out.println(bitsLength(7));
    }
}