class Solution {
    public int solution(int a, int b) {

        return 2 * a * b > Integer.parseInt(a + "" + b) ? 2 * a * b : Integer.parseInt(a + "" + b);

    }
}