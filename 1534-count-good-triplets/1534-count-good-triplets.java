class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
      int count = 0;
        int n = arr.length;

   
        for (int i = 0; i < n - 2; i++) { // i can go up to n-3
            for (int j = i + 1; j < n - 1; j++) { // j can go up to n-2
                for (int k = j + 1; k < n; k++) { // k can go up to n-1
                    if (Math.abs(arr[i] - arr[j]) <= a &&
                        Math.abs(arr[j] - arr[k]) <= b &&
                        Math.abs(arr[i] - arr[k]) <= c) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}