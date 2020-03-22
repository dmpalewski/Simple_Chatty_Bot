//put imports you need here

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {

    private static final List<String> continentsBySize= new ArrayList<>(
            Arrays.asList(
                    "Asia",
                    "Africa",
                    "North America",
                    "South America",
                    "Antarctica",
                    "Europe",
                    "Australia"
            )
    );

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputContinents = new ArrayList<>();
        while (scanner.hasNext()) {
            String continentName = scanner.next();
            if (continentName.startsWith("N") || continentName.startsWith("S")) {
                continentName = continentName + " " + scanner.next();
            }
            inputContinents.add(continentName);
        }
        continentsBySize.forEach(cont -> {
            if (inputContinents.contains(cont)) {
                System.out.println(cont);
            }
        });
    }
}