package by.clevertec;

import by.clevertec.model.Animal;
import by.clevertec.model.Car;
import by.clevertec.model.Examination;
import by.clevertec.model.Flower;
import by.clevertec.model.House;
import by.clevertec.model.Person;
import by.clevertec.model.Student;
import by.clevertec.util.Util;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
        task20();
        task21();
        task22();
    }

    public static List<Animal> task1() {
        List<Animal> animals = Util.getAnimals();
        int minAge = 10;
        final int maxAge = 20;
        int countAnimalsForZoo = 7;
        int numberZoo = 3;

        List<Animal> animalsForZoo = animals.stream()
                .filter(animal -> animal.getAge() >= minAge && animal.getAge() <= maxAge)
                .sorted(Comparator.comparing(Animal::getAge))
                .skip(countAnimalsForZoo * (numberZoo - 1))
                .limit(countAnimalsForZoo)
                .toList();

        animalsForZoo.forEach(System.out::println);

        return animalsForZoo;
    }

    public static List<String> task2() {
        List<Animal> animals = Util.getAnimals();
        String country = "Japanese";
        String genderForUpperCase = "Female";

        List<String> breeds = animals.stream()
                .filter(animal -> animal.getOrigin().equalsIgnoreCase(country))
                .map(animal ->
                        genderForUpperCase.equalsIgnoreCase(animal.getGender()) ?
                                animal.getBread().toUpperCase() :
                                animal.getBread())
                .toList();
        breeds.forEach(System.out::println);
        return breeds;
    }

    public static List<String> task3() {
        List<Animal> animals = Util.getAnimals();
        int age = 30;
        String countryStartSymbol = "A";

        List<String> countries = animals.stream()
                .filter(animal -> animal.getAge() > age)
                .map(Animal::getOrigin)
                .filter(country -> country.startsWith(countryStartSymbol))
                .distinct()
                .toList();
        countries.forEach(System.out::println);
        return countries;
    }

    public static long task4() {
        List<Animal> animals = Util.getAnimals();
        String genderForUpperCase = "Female";

        long countFemaleAnimals = animals.stream()
                .filter(animal -> genderForUpperCase.equalsIgnoreCase(animal.getGender()))
                .count();

        System.out.printf("Count female animals = %s%n", countFemaleAnimals);
        return countFemaleAnimals;
    }

    public static boolean task5() {
        List<Animal> animals = Util.getAnimals();
        int minAge = 20;
        int maxAge = 30;
        String countryForSearch = "Hungarian";

        boolean countryIsExists = animals.stream()
                .filter(animal -> animal.getAge() >= minAge)
                .filter(animal -> animal.getAge() <= maxAge)
                .map(Animal::getOrigin)
                .anyMatch(countryForSearch::equalsIgnoreCase);

        System.out.printf("Animal with country %s %s%n",
                countryForSearch,
                countryIsExists ? "is exists" : "is not exists");

        return countryIsExists;
    }

    public static boolean task6() {
        List<Animal> animals = Util.getAnimals();
        String genderFemale = "Female";
        String genderMale = "Male";

        boolean isAllFemaleOrMale = animals.stream()
                .map(Animal::getGender)
                .allMatch(gender ->
                        genderFemale.equalsIgnoreCase(gender) ||
                                genderMale.equalsIgnoreCase(gender));

        System.out.printf("All animals is female and male - %s%n", isAllFemaleOrMale);
        return isAllFemaleOrMale;
    }

    public static boolean task7() {
        List<Animal> animals = Util.getAnimals();
        String countryForSearch = "Oceania";

        boolean animalIsNotExists = animals.stream()
                .noneMatch(animal -> countryForSearch.equalsIgnoreCase(animal.getOrigin()));

        System.out.printf("Animal with country %s is not exists - %s%n",
                countryForSearch,
                animalIsNotExists);
        return animalIsNotExists;
    }

    public static Integer task8() {
        List<Animal> animals = Util.getAnimals();
        int countAnimals = 100;

        Integer maxAge = animals.stream()
                .sorted(Comparator.comparing(Animal::getBread))
                .limit(countAnimals)
                .map(Animal::getAge)
                .max(Integer::compareTo)
                .orElse(null);

        System.out.printf("The oldest animal age - %s%n", maxAge);
        return maxAge;
    }

    public static Integer task9() {
        List<Animal> animals = Util.getAnimals();

        Integer minBreed = animals.stream()
                .map(Animal::getBread)
                .map(String::toCharArray)
                .map(chars -> chars.length)
                .min(Integer::compareTo)
                .orElse(null);

        System.out.printf("Minimum length breed - %s%n", minBreed);

        return minBreed;


    }

    public static Integer task10() {
        List<Animal> animals = Util.getAnimals();

        Integer amountAge = animals.stream()
                .map(Animal::getAge)
                .reduce(0, Integer::sum);

        System.out.printf("Amount age all animals - %s%n", amountAge);

        return amountAge;
    }

    public static double task11() {
        List<Animal> animals = Util.getAnimals();
        String countryForSearch = "Indonesian";

        double avgAge = animals.stream()
                .filter(animal -> countryForSearch.equalsIgnoreCase(animal.getOrigin()))
                .mapToInt(Animal::getAge)
                .average()
                .orElse(Double.NaN);

        System.out.printf("Average age - %s%n", avgAge);

        return avgAge;
    }

    public static List<Person> task12() {
        List<Person> persons = Util.getPersons();
        int count = 200;
        String genderMale = "Male";

//        //1 variant
//        List<Person> people = persons.stream()
//                .filter(person -> genderMale.equals(person.getGender()))
//                .filter(Main::isAgeCorrect)
//                .sorted(Comparator.comparing((Person person) -> {
//                                    if (person.getRecruitmentGroup() == 1) return -1;
//                                    else if (person.getRecruitmentGroup() == 2) return 0;
//                                    else return 1;
//                                }
//                        )
//                )
//                .limit(count)
//                .toList();

        //2 variant
        List<Person> people = persons.stream()
                .filter(person -> genderMale.equals(person.getGender()))
                .filter(Main::isAgeCorrect)
                .sorted((person1, person2) -> {
                            List<Integer> order = Arrays.asList(1, 2, 3);
                            return Integer.compare(
                                    order.indexOf(person1.getRecruitmentGroup()),
                                    order.indexOf(person2.getRecruitmentGroup())
                            );
                        }
                )
                .limit(count)
                .toList();

        people.forEach(System.out::println);

        return people;
    }

    private static boolean isAgeCorrect(Person person) {
        int minAge = 18;
        int maxAge = 27;

        LocalDate dateOfBirth = person.getDateOfBirth();
        LocalDate afterAge = LocalDate.now().minusYears(maxAge);
        LocalDate beforeAge = LocalDate.now().minusYears(minAge);
        return dateOfBirth.isAfter(afterAge) && dateOfBirth.isBefore(beforeAge);
    }

    public static List<Person> task13() {
        List<House> houses = Util.getHouses();
        int countForEvacuation = 500;

        List<Person> people = houses.stream()
                .flatMap(house -> house.getPersonList().stream()
                        .map(person -> Map.entry(
                                getOrderForPerson(house.getBuildingType(), person),
                                person)
                        ))
                .sorted(Map.Entry.comparingByKey())
                .limit(countForEvacuation)
                .map(Map.Entry::getValue)
                .toList();

        people.forEach(System.out::println);

        return people;
    }

    private static int getOrderForPerson(String typeBuilding, Person person) {
        String hospital = "Hospital";
        int adultAge = 18;
        int femaleRetired = 58;
        int maleRetired = 63;
        String genderFemale = "Female";

        LocalDate adult = LocalDate.now().minusYears(adultAge);
        LocalDate retired = LocalDate.now().minusYears(
                genderFemale.equals(person.getGender()) ? femaleRetired : maleRetired);

        if (hospital.equals(typeBuilding)) return 1;
        else if (person.getDateOfBirth().isAfter(adult)
                || person.getDateOfBirth().isBefore(retired)) return 2;
        else return 3;
    }


    public static double task14() {
        List<Car> cars = Util.getCars();
        List<String> countries = List.of("Туркменистан", "Узбекистан", "Казахстан", "Кыргызстан", "Россия", "Монголия");
        double transportCoast = 7.14;

        double revenue = cars.stream()
                .map(car -> Map.entry(
                        getNumberGroup(car),
                        car
                ))
                .collect(Collectors.groupingBy(
                                Map.Entry::getKey,
                                Collectors.mapping(
                                        Map.Entry::getValue,
                                        Collectors.toList()
                                )
                        )
                )
                .entrySet().stream()
                .filter(entry -> entry.getKey() != 7)
                .sorted(Map.Entry.comparingByKey())
                .peek(entry -> {
                    System.out.println(countries.get(entry.getKey() - 1));
                    System.out.printf("Mass: %s%n",
                            entry.getValue().stream()
                                    .mapToInt(Car::getMass)
                                    .sum()
                    );
                    System.out.printf("Transport coast: %s%n",
                            entry.getValue().stream()
                                    .mapToDouble(car -> car.getMass() * transportCoast / 1000)
                                    .sum()
                    );
                    System.out.printf("Amount: %s%n",
                            entry.getValue().stream()
                                    .mapToInt(Car::getPrice)
                                    .sum()
                    );
                })
                .flatMapToDouble(entry -> entry.getValue()
                        .stream()
                        .mapToDouble(car -> (car.getPrice()) - car.getMass() * transportCoast / 1000))
                .sum();

        System.out.printf("Revenue %s%n", revenue);
        return revenue;
    }

    private static int getNumberGroup(Car car) {
        List<String> carMakeFirstGroup = List.of("Jaguar");
        List<String> carColorFirstGroup = List.of("White");

        List<String> carMakeSecondGroup = List.of("BMW", "Lexus", "Chrysler", "Toyota");
        int carMassSecondGroup = 1500;

        List<String> carColorThirdGroup = List.of("Black");
        int carMassThirdGroup = 4000;
        List<String> carMakeThirdGroup = List.of("GMC", "Dodge");

        List<String> carMakeFourthGroup = List.of("Civic", "Cherokee");
        int carYearFourthGroup = 1982;

        List<String> carColorFifthGroup = List.of("Yellow", "Red", "Green", "Blue");
        int carPriceFifthGroup = 40000;

        String carVinSixthGroup = "59";

        if (carMakeFirstGroup.contains(car.getCarMake()) ||
                carColorFirstGroup.contains(car.getColor())) return 1;

        if (carMakeSecondGroup.contains(car.getCarMake()) ||
                car.getMass() < carMassSecondGroup) return 2;

        if ((carColorThirdGroup.contains(car.getColor()) && car.getMass() > carMassThirdGroup) ||
                carMakeThirdGroup.contains(car.getCarMake())) return 3;

        if (car.getReleaseYear() < carYearFourthGroup
                || carMakeFourthGroup.contains(car.getCarMake())) return 4;

        if (!carColorFifthGroup.contains(car.getColor())
                || car.getPrice() > carPriceFifthGroup) return 5;

        if (car.getVin().contains(carVinSixthGroup)) return 6;

        return 7;
    }

    public static double task15() {
        List<Flower> flowers = Util.getFlowers();
        List<String> vaseMaterialFilter = List.of("Glass", "Aluminum", "Steel");
        double coastWater = 1.39;
        int years = 5 * 365;

        double totalCoast = flowers.stream()
                .sorted(Comparator.comparing(Flower::getOrigin).reversed()
                        .thenComparing(Flower::getPrice).reversed()
                        .thenComparing(Flower::getWaterConsumptionPerDay))
                .filter(flower -> flower.getCommonName().matches("^[C-S].*"))
                .filter(Flower::isShadePreferred)
                .filter(flower -> flower.getFlowerVaseMaterial().stream()
                        .anyMatch(vaseMaterialFilter::contains)
                )
                .mapToDouble(flower -> flower.getPrice() +
                        (flower.getWaterConsumptionPerDay() * years * coastWater))
                .sum();

        System.out.printf("Total coast - %s%n", totalCoast);

        return totalCoast;
    }

    public static List<Student> task16() {
        List<Student> students = Util.getStudents();
        int adultAge = 18;

        List<Student> adultStudents = students.stream()
                .filter(student -> student.getAge() < adultAge)
                .sorted(Comparator.comparing(Student::getSurname))
                .toList();

        adultStudents.forEach(System.out::println);
        return adultStudents;
    }

    public static List<String> task17() {
        List<Student> students = Util.getStudents();
        List<String> groups = students.stream()
                .map(Student::getGroup)
                .distinct()
                .toList();

        groups.forEach(System.out::println);
        return groups;
    }

    public static Map<String, Double> task18() {
        List<Student> students = Util.getStudents();

        Map<String, Double> faculties = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getFaculty,
                        Collectors.averagingDouble(
                                Student::getAge
                        )
                ))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new
                ));

        faculties.entrySet().forEach(System.out::println);
        return faculties;
    }

    public static List<Student> task19() {
        List<Student> students = Util.getStudents();
        List<Examination> examinations = Util.getExaminations();
        String group = "C-2";

        List<Student> goodStudents = students.stream()
                .filter(student -> group.equals(student.getGroup()))
                .filter(student -> isMatchGroupAndMark(examinations, student))
                .toList();

        goodStudents.forEach(System.out::println);
        return goodStudents;
    }

    private static boolean isMatchGroupAndMark(List<Examination> examinations, Student student) {
        int mark = 4;
        return examinations.stream()
                .anyMatch(examination ->
                        examination.getStudentId() == student.getId() &&
                                examination.getExam3() > mark
                );
    }

    public static String task20() {
        List<Student> students = Util.getStudents();
        List<Examination> examinations = Util.getExaminations();

        String bestFaculty = students.stream()
                .filter(student -> examinations.stream()
                        .anyMatch(examination -> examination.getStudentId() == student.getId()))
                .collect(Collectors.groupingBy(
                        Student::getFaculty,
                        Collectors.averagingDouble(
                                student -> examinations.stream()
                                        .filter(examination ->
                                                student.getId() == examination.getStudentId())
                                        .mapToDouble(Examination::getExam1)
                                        .findFirst()
                                        .orElse(0)
                        )
                ))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.printf("Best faculty: %s%n", bestFaculty);
        return bestFaculty;
    }

    public static Map<String, Long> task21() {
        List<Student> students = Util.getStudents();

        Map<String, Long> countStudents = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGroup,
                        Collectors.counting()
                ));

        countStudents.entrySet().forEach(System.out::println);
        return countStudents;
    }

    public static void task22() {
        List<Student> students = Util.getStudents();
        students.stream()
                .collect(Collectors.groupingBy(
                        Student::getFaculty,
                        Collectors.minBy(Comparator.comparing(Student::getAge)))
                )
                .forEach((key, value) -> System.out.printf("%s = %s%n",
                        key,
                        value.orElseGet(null).getAge()));
    }
}
