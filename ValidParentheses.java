import java.util.*;
public class ValidParentheses {
 static boolean isValid(String s) {
 Deque<Character> stack = new ArrayDeque<>();
 Map<Character,Character> map = new HashMap<>();
 map.put(')','('); map.put(']','['); map.put('}','{');
 for(char c : s.toCharArray()) {
 if(c=='(' || c=='[' || c=='{') stack.push(c);
 else {
 if(stack.isEmpty() || stack.peek() != map.get(c)) return false;
 stack.pop();
 }
 }
 return stack.isEmpty();
 }
 public static void main(String[] args) {
 String[] tests = {"()", "()[]{}", "(]", "([)]", "{[]}", ""};
 for(String s : tests) System.out.println('"' + s + '"' + " => " + (isValid(s) ? "Valid" : "Not Valid"));
 // TreeSet demonstration
 TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(5,3,1,4,2));
 System.out.println("TreeSet (sorted): " + ts);
 // PriorityQueue demonstration
 PriorityQueue<Integer> pq = new PriorityQueue<>(Arrays.asList(5,3,1,4,2));
 System.out.print("PriorityQueue (min-heap): ");
 while(!pq.isEmpty()) System.out.print(pq.poll() + " ");
 System.out.println();
 }
}
