import java.util.Comparator;

public class Distance implements Comparator<Polo>{

	@Override
	public int compare(Polo o1, Polo o2) {
		return (int) (o1.getDist() - o2.getDist());
	}

}
