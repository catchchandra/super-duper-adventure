/*
 * We need to write a program with minimum flips to make the two bits’ OR operation equal a number.
 * Number Of Flips Required To Make a|b Equal to c
 */

class MinFlips {
    private static int helper(int a, int b, int c) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int bitC = ((c >> i) & 1);
            int bitA = ((a >> i) & 1);
            int bitB = ((b >> i) & 1);
            
            if ((bitA | bitB) != bitC) {
                if (bitC == 0) {
                    if (bitA == 1 && bitB == 1) {
                        ans += 2;
                    } else {
                        ans += 1;
                    }
                } else {
                    ans += 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int c = 5;
        System.out.println("Min Flips required to make two numbers equal to third is : " + helper(a, b, c));
    }
}

