import box.Box;
import person.Person;
import team.Team;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

//        int n = Integer.parseInt(reader.readLine());
        int length = Integer.parseInt(reader.readLine());
        int width = Integer.parseInt(reader.readLine());
        int height = Integer.parseInt(reader.readLine());

        Box box = new Box(length, width, height);

        System.out.println(box.calculateSurfaceArea());
        System.out.println(box.calculateLateralSurfaceArea());
        System.out.println(box.calculateVolume());


//        printValidationData(reader, n);

//        printSortedPeople(reader, n);


    }

    private static void printSortedPeople(BufferedReader reader, int n) throws IOException {
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            people.add(new Person(input[0], input[1], Integer.parseInt(input[2])));
        }

        people.sort((firstPerson, secondPerson) -> {
            int sComp = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());

            if (sComp != 0) {
                return sComp;
            } else {
                return Integer.compare(firstPerson.getAge(), secondPerson.getAge());
            }
        });

        for (Person person : people) {
            System.out.println(person.toString());
        }
    }

    private static void printValidationData(BufferedReader reader, int n) throws IOException {
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            try {
                people
                        .add(
                                new Person(
                                        input[0],
                                        input[1],
                                        Integer.parseInt(input[2]),
                                        Double.parseDouble(input[3])));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            }

        Team team= new Team("Black Eagles");

        people.forEach(team::addPlayer);

        System.out.println(String.format("First team have %d players",
                team.getFirstTeam().size()));

        System.out.println((String.format("Reserve team have %d players",
                team.getReserveTeam().size())));

//        for (Person person : people) {
//            team.addPlayer(person);
//        }

//        double bonus = Double.parseDouble(reader.readLine());
//        for (Person person : people) {
//            try {
//                person.increaseSalary(bonus);
//                System.out.println(person.toString());
//            } catch (IllegalArgumentException e) {
//                System.out.println(e.getMessage());
//            }
//        }
    }
}
