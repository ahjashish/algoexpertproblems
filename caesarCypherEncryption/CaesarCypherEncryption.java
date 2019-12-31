import java.util.*;
import java.util.stream.*;

class CaesarCypherEncryptor {
  public static String caesarCypherEncryptor(String str, int key) {
    return str.codePoints()
			.map(s -> {
				System.out.println(s + Character.toString(s));
				return s + key;
				})
			.map(s -> {
				System.out.println(s + Character.toString(s));
				if(s > 122) {
					return ((s - 122) % 26) + 96;
				}
				return s;
			})
			.mapToObj(s -> Character.toString(s))
			.collect(Collectors.joining());
  }
}
