class Solution {
    public int[] asteroidCollision(int[] asteroids) {
           Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            boolean destroyed = false;

          
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
            
                int top = stack.peek();
                if (Math.abs(asteroid) > top) {
                   
                    stack.pop();
                } else if (Math.abs(asteroid) == top) {
                    
                    stack.pop();
                    destroyed = true;
                    break;
                } else {
                
                    destroyed = true;
                    break;
                }
            }

            
            if (!destroyed) {
                stack.push(asteroid);
            }
        }

      
        int[] result = new int[stack.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = stack.get(i);
        }

        return result;
    }
}