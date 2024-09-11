package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> aparts, int count) {
        return aparts.stream()
                .sorted((h1, h2) -> Double.compare(h1.getArea(), h2.getArea()))
                .limit(count)
                .map(Home::toString)
                .collect(Collectors.toList());
    }
}
// END
