class Solution {
    public String longestDiverseString(int a, int b, int c) {
      
        StringBuilder sb = new StringBuilder();
        
        // Define a helper class to manage characters and their counts
        class CharCount {
            char ch;
            int count;

            CharCount(char ch, int count) {
                this.ch = ch;
                this.count = count;
            }
        }

        while (a > 0 || b > 0 || c > 0) {
            CharCount[] counts = new CharCount[] {
                new CharCount('a', a),
                new CharCount('b', b),
                new CharCount('c', c)
            };

            // Sort characters by count, descending
            Arrays.sort(counts, (x, y) -> y.count - x.count);

            boolean appended = false;
            
            for (CharCount cc : counts) {
                if (cc.count <= 0) {
                    continue;
                }
                int length = sb.length();
                if (length >= 2 && sb.charAt(length - 1) == cc.ch && sb.charAt(length - 2) == cc.ch) {
                    continue; // Skip adding the same character if it already appeared twice in a row
                }
                sb.append(cc.ch);
                if (cc.ch == 'a') {
                    a--;
                } else if (cc.ch == 'b') {
                    b--;
                } else {
                    c--;
                }
                appended = true;
                break;
            }
            
            if (!appended) {
                break; // If no character could be appended, exit the loop
            }
        }

        return sb.toString();
    }
}