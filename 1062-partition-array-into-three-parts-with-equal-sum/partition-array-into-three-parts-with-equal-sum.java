class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;

        for (int x : arr) {
            sum += x;
        }

        if (sum % 3 != 0) {
            return false;
        }

        int target = sum / 3;
        int current = 0;
        int parts = 0;

        for (int x : arr) {
            current += x;

            if (current == target) {
                parts++;
                current = 0;
            }
        }

        return parts >= 3;
    }
}