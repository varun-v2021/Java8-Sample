import java.util.ArrayList;
import java.util.List;

public class StateOwner {

	List<StateChangeListener> listeners = new ArrayList<>();

	public void addStateChangeListener(StateChangeListener listener) {
		System.out.println("Adding state change listener");
		listeners.add(listener);
	}

	public void onStateChange() {
		System.out.println("Owner state changed");
		for (StateChangeListener listener : listeners) {
			listener.update("old state", "new State");
		}
	}
}
