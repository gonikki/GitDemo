package seleniumfirst;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class JavaStream {
	@Test
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Anand");
		names.add("Swarajyalaxmi");
		names.add("Vittal");
		names.add("Vikhil");
		long c = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);
		// long d = Stream.of("Abhijeet", "Anand", "Swarajyalaxmi", "Vittal",
		// "Vikhil").filter(s -> {
		// s.startsWith("V");
		// }).count();
		// System.out.println(d);

	}

}
