class Solution {
    public String simplifyPath(String path) {
          Stack<String> stack = new Stack();
            for (String token : path.split("/")) {
                if (!stack.isEmpty() && "..".equals(token))
                    stack.pop();
                else if (!Arrays.asList(".", "", "..").contains(token))
                    stack.push(token);
            }

            return "/" + String.join("/", stack);
    }
}