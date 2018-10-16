import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingExample {
	public void exampleWithoutLambda() {
		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer.getStr());
		}

		// sort by age
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getNo() - o2.getNo();
			}
		});

		System.out.println("After Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer.getStr());
		}
	}

	public void exampleWithLambda() {
		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer.getStr());
		}

		System.out.println("After Sort");

		// lambda here!
		listDevs.sort((Developer o1, Developer o2) -> o1.getNo() - o2.getNo());

		// java 8 only, lambda also, to print the List
		listDevs.forEach((developer) -> System.out.println(developer.getStr()));
	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", new BigDecimal("400040"), 4));
		result.add(new Developer("alvin", new BigDecimal("510000"), 1));
		result.add(new Developer("jason", new BigDecimal("350000"), 3));
		result.add(new Developer("iris", new BigDecimal("260000"), 2));

		return result;

	}
}
