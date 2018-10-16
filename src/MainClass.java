import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass {
	public static void main(String[] args) {
		try {
			StateOwner owner = new StateOwner();
			owner.addStateChangeListener((oldState, newState) -> {
				System.out.println("Lambda example for update from " + oldState + " to " + newState);
			});
			System.out.println("Waiting for a event occurrence");
			Thread.sleep(3000);
			System.out.println("Occurred");
			owner.onStateChange();

			// Foreach example
			System.out.println("Foreach example ....");
			Map<String, Integer> items = new HashMap<String, Integer>();
			items.put("A", 10);
			items.put("B", 20);
			items.put("C", 30);
			items.put("D", 40);
			items.put("E", 50);
			items.put("F", 60);

			items.forEach((k, v) -> {
				System.out.println("Key: " + k + " " + "Value: " + v);
			});

			List<String> items1 = new ArrayList<>();
			items1.add("1");
			items1.add("2");
			items1.add("3");
			items1.add("4");
			items1.add("5");
			items1.add("6");

			items1.forEach((item) -> System.out.println(item));

			SortingExample sortEx = new SortingExample();
			System.out.println("**** Sorting example without lambda *****");
			sortEx.exampleWithoutLambda();
			System.out.println("***** Sorting example with lambda *****");
			sortEx.exampleWithLambda();
			System.out.println("**** Stream api demo ****");
			StreamAPIDemo sDemo = new StreamAPIDemo();
			sDemo.example();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
