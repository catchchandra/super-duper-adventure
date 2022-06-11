//Brian Kernighan's   Algorithm

//The main idea behind this algorithm is that when we subtract one from any number, it inverts all the bits after the rightmost set bit

class CountSetBits {
    private static int helper(int n) {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 125;
        System.out.println("SetBit Count is : " + helper(number));
    }

    
}
