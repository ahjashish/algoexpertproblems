import java.util.*;

class BalancedBrackets {
  public static boolean balancedBrackets(String str) {
    Stack<Character> s = new Stack<>();
		Map<Character, Character> sMap = new HashMap();
		sMap.put(')','(');
		sMap.put('}','{');
		sMap.put(']','[');
		for (char c : str.toCharArray()) {
			if(!Character.isLetterOrDigit(c)) {
				if(sMap.values().contains(c)) {
					s.push(c);
				} else if(sMap.keySet().contains(c) && !s.isEmpty() && s.peek() == sMap.get(c)) {
					s.pop();
				} else {
					return false;
				}
			}
		}
		if(s.isEmpty()) {
			return true;
		} else {
			return false;
		}
  }
}