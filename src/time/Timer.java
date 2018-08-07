package time;

import java.util.function.Function;

public interface Timer<E,F> {
	
	// Input an algorithm together with its input, and return
	// the runtime.
	public long runtime(Function<E,F> f, E input);

}
