/*
 * Given integers x, y finds the positions where the corresponding bits are different
 * Input: x = 1, y = 8
Output: 2
Explanation:
1   (0 0 0 1)
8   (1 0 0 0)
     ↑     ↑
 */
class HammingDistance {
    public static int hammingDistance(int a, int b) {
      int xor = a ^ b;
      int distance = 0;
  
      while (xor != 0) {
        distance += 1;
        xor &= ( xor - 1); // equals to `xor = xor & ( xor - 1);`
      }
  
      return distance;
    }
  
    public static void main(String[] args) {
      int a = 1;
      int b = 8;
      System.out.println("Hamming Distance between two integers is " + hammingDistance(a, b));
    }
  }