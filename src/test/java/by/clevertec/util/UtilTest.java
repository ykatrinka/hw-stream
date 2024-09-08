package by.clevertec.util;

import by.clevertec.model.Animal;
import by.clevertec.model.Car;
import by.clevertec.model.Examination;
import by.clevertec.model.Flower;
import by.clevertec.model.House;
import by.clevertec.model.Person;
import by.clevertec.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UtilTest {
    public static List<Animal> getEmptyListAnimals() {
        return new ArrayList<>();
    }

    public static List<Animal> getAnimalsForTestTask1() {
        return List.of(
                new Animal(1, "Stork, white - necked", 12, "German", "Male"),
                new Animal(1, "Stork, white - necked", 11, "German", "Male"),
                new Animal(1, "Stork, white - necked", 13, "German", "Male"),
                new Animal(1, "Stork, white - necked", 14, "German", "Male"),
                new Animal(1, "Stork, white - necked", 15, "German", "Male"),
                new Animal(1, "Stork, white - necked", 16, "German", "Male"),
                new Animal(1, "Stork, white - necked", 17, "German", "Male"),
                new Animal(1, "Stork, white - necked", 12, "German", "Female"),
                new Animal(1, "Stork, white - necked", 11, "German", "Female"),
                new Animal(1, "Stork, white - necked", 13, "German", "Female"),
                new Animal(1, "Stork, white - necked", 14, "German", "Female"),
                new Animal(1, "Stork, white - necked", 15, "German", "Female"),
                new Animal(1, "Stork, white - necked", 16, "German", "Female"),
                new Animal(1, "Stork, white - necked", 17, "German", "Female"),
                new Animal(1, "Stork, white - necked", 12, "German", "Genderfluid"),
                new Animal(1, "Stork, white - necked", 11, "German", "Genderfluid"),
                new Animal(1, "Stork, white - necked", 13, "German", "Genderfluid"),
                new Animal(1, "Stork, white - necked", 14, "German", "Genderfluid"),
                new Animal(1, "Stork, white - necked", 15, "German", "Genderfluid"),
                new Animal(1, "Stork, white - necked", 16, "German", "Genderfluid"),
                new Animal(1, "Stork, white - necked", 17, "German", "Genderfluid")
        );
    }

    public static List<Animal> getAnimalsForTestTask2() {
        return List.of(
                new Animal(1, "Stork, white - necked", 12, "German", "Male"),
                new Animal(1, "Stork, white - necked", 14, "Japanese", "Male"),
                new Animal(1, "Huron", 15, "Japanese", "Male"),
                new Animal(1, "Lorikeet, scaly-breasted", 17, "Japanese", "Female"),
                new Animal(1, "Brazilian Tapir", 15, "Japanese", "Genderfluid")
        );
    }

    public static List<Animal> getAnimalsForTestTask3() {
        return List.of(
                new Animal(1, "Stork, white - necked", 32, "German", "Male"),
                new Animal(1, "Stork, white - necked", 34, "Armenian", "Male"),
                new Animal(1, "Huron", 35, "Armenian", "Male"),
                new Animal(1, "Lorikeet, scaly-breasted", 17, "Japanese", "Female"),
                new Animal(1, "Brazilian Tapir", 35, "Albanian", "Genderfluid")
        );
    }

    public static List<Animal> getAnimalsForTestTask4() {
        return List.of(
                new Animal(1, "Stork, white - necked", 32, "German", "Male"),
                new Animal(1, "Stork, white - necked", 34, "Armenian", "Female"),
                new Animal(1, "Huron", 35, "Armenian", "Female"),
                new Animal(1, "Lorikeet, scaly-breasted", 17, "Japanese", "Female"),
                new Animal(1, "Brazilian Tapir", 35, "Albanian", "Genderfluid")
        );
    }

    public static List<Animal> getAnimalsWithExistsCountryForTestTask5() {
        return List.of(
                new Animal(1, "Stork, white - necked", 32, "German", "Male"),
                new Animal(1, "Stork, white - necked", 24, "Hungarian", "Female"),
                new Animal(1, "Huron", 35, "Armenian", "Female"),
                new Animal(1, "Lorikeet, scaly-breasted", 17, "Japanese", "Female"),
                new Animal(1, "Brazilian Tapir", 35, "Albanian", "Genderfluid")
        );
    }


    public static List<Animal> getAnimalsWithNotExistsCountryForTestTask5() {
        return List.of(
                new Animal(1, "Stork, white - necked", 32, "German", "Male"),
                new Animal(1, "Stork, white - necked", 34, "Spain", "Female"),
                new Animal(1, "Huron", 35, "Armenian", "Female"),
                new Animal(1, "Lorikeet, scaly-breasted", 17, "Japanese", "Female"),
                new Animal(1, "Brazilian Tapir", 35, "Albanian", "Genderfluid")
        );
    }

    public static List<Animal> getAnimalsOnlyMaleAndFemaleForTestTask6() {
        return List.of(
                new Animal(1, "Stork, white - necked", 32, "German", "Male"),
                new Animal(1, "Stork, white - necked", 24, "Hungarian", "Female"),
                new Animal(1, "Huron", 35, "Armenian", "Female"),
                new Animal(1, "Lorikeet, scaly-breasted", 17, "Japanese", "Female")
        );
    }


    public static List<Animal> getAnimalsNotOnlyMaleAndFemaleForTestTask6() {
        return List.of(
                new Animal(1, "Stork, white - necked", 32, "German", "Male"),
                new Animal(1, "Stork, white - necked", 34, "Spain", "Female"),
                new Animal(1, "Huron", 35, "Armenian", "Female"),
                new Animal(1, "Lorikeet, scaly-breasted", 17, "Japanese", "Female"),
                new Animal(1, "Brazilian Tapir", 35, "Albanian", "Genderfluid")
        );
    }

    public static List<Animal> getAnimalsWithExistsCountryForTestTask7() {
        return List.of(
                new Animal(1, "Stork, white - necked", 32, "German", "Male"),
                new Animal(1, "Stork, white - necked", 34, "Spain", "Female"),
                new Animal(1, "Huron", 35, "Oceania", "Female"),
                new Animal(1, "Lorikeet, scaly-breasted", 17, "Japanese", "Female"),
                new Animal(1, "Brazilian Tapir", 35, "Albanian", "Genderfluid")
        );
    }

    public static List<Animal> getAnimalsWithNotExistsCountryForTestTask7() {
        return List.of(
                new Animal(1, "Stork, white - necked", 32, "German", "Male"),
                new Animal(1, "Stork, white - necked", 34, "Spain", "Female"),
                new Animal(1, "Huron", 35, "Armenian", "Female"),
                new Animal(1, "Lorikeet, scaly-breasted", 17, "Japanese", "Female"),
                new Animal(1, "Brazilian Tapir", 35, "Albanian", "Genderfluid")
        );
    }

    public static List<Animal> getAnimalsForTestTask8() {
        return List.of(
                new Animal(1, "Stork, white - necked", 32, "German", "Male"),
                new Animal(1, "Stork, white - necked", 34, "Spain", "Female"),
                new Animal(1, "Huron", 35, "Armenian", "Female"),
                new Animal(1, "Lorikeet, scaly-breasted", 17, "Japanese", "Female"),
                new Animal(1, "Brazilian Tapir", 45, "Albanian", "Genderfluid")
        );
    }

    public static List<Animal> getAnimalsForTestTask9() {
        return List.of(
                new Animal(1, "Stork, white - necked", 32, "German", "Male"),
                new Animal(1, "Stork, white - necked", 34, "Spain", "Female"),
                new Animal(1, "Huron", 35, "Armenian", "Female"),
                new Animal(1, "Lorikeet, scaly-breasted", 17, "Japanese", "Female"),
                new Animal(1, "Brazilian Tapir", 45, "Albanian", "Genderfluid")
        );
    }

    public static List<Animal> getAnimalsForTestTask10() {
        return List.of(
                new Animal(1, "Stork, white - necked", 32, "German", "Male"),
                new Animal(1, "Stork, white - necked", 34, "Spain", "Female"),
                new Animal(1, "Huron", 35, "Armenian", "Female")
        );
    }

    public static List<Animal> getAnimalsForTestTask11() {
        return List.of(
                new Animal(1, "Stork, white - necked", 32, "Indonesian", "Male"),
                new Animal(1, "Stork, white - necked", 34, "Indonesian", "Female"),
                new Animal(1, "Huron", 36, "Indonesian", "Female")
        );
    }

    public static List<Person> getEmptyListPeople() {
        return new ArrayList<>();
    }

    public static List<Person> getPeopleForTestTask12() {
        return List.of(
                new Person(2, "Goddart", "Bentall", LocalDate.of(2006, 6, 8), "gbentall1@etsy.com", "Male", 3, "Tandag", "Social Worker"),
                new Person(44, "Cointon", "Lethbridge", LocalDate.of(1998, 4, 6), "clethbridge17@craigslist.org", "Male", 2, "Ban Ko Lan", "Teacher"),
                new Person(137, "Beauregard", "Robet", LocalDate.of(1999, 7, 27), " brobet3s@devhub.com", "Male", 3, "Guohuan", "Actuary"),
                new Person(167, "Estevan", "Fernanando", LocalDate.of(2006, 6, 5), "efernanando4m@state.gov", "Male", 1, "Retkovci", "Registered Nurse"),
                new Person(177, "Elnar", "Chisholm", LocalDate.of(2001, 8, 30), "echisholm4w@fotki.com", "Female", 3, "Maceió", "Physical Therapy Assistant"),
                new Person(179, "Wendall", "Duligal", LocalDate.of(2016, 8, 8), "wduligal4y@whitehouse.gov", "Male", 2, "Nangkaruka", "Nurse"),
                new Person(182, "Gian", "Worthington", LocalDate.of(2001, 1, 13), "gworthington51@behance.net", "Male", 1, "Cisompet", "Budget / Accounting Analyst III"),
                new Person(311, "Franciskus", "Beckford", LocalDate.of(2000, 9, 4), "fbeckford8m@cnbc.com", "Male", 3, "Louisville", "Internal Auditor"),
                new Person(31, "Enrico", "Seydlitz", LocalDate.of(2001, 12, 26), "eseydlitzu@seesaa.net", "Female", 2, "Magangué", "Design Engineer"),
                new Person(130, "Jamill", "Petticrow", LocalDate.of(1997, 9, 11), "jpetticrow3l@answers.com", "Male", 1, "Nassau", "Programmer Analyst II"),
                new Person(141, "Bourke", "Mote", LocalDate.of(1992, 6, 24), "bmote3w @nature.com", "Male", 1, "Zaña", "Staff Scientist"),
                new Person(247, "Quinn", "Alway", LocalDate.of(2003, 12, 4), "qalway6u@examiner.com", "Male", 2, "Täby", "Pharmacist")
        );
    }

    public static List<House> getEmptyListHouses() {
        return new ArrayList<>();
    }

    public static List<House> getHousesForTestTask13() {
        List<Person> peopleInHospital = List.of(
                new Person(1, "Goddart", "Bentall", LocalDate.of(2006, 6, 8), "gbentall1@etsy.com", "Male", 3, "Tandag", "Social Worker"),
                new Person(2, "Cointon", "Lethbridge", LocalDate.of(1998, 4, 6), "clethbridge17@craigslist.org", "Male", 2, "Ban Ko Lan", "Teacher")
        );

        List<Person> otherBuilding = List.of(
                new Person(3, "Beauregard", "Robet", LocalDate.of(2010, 7, 27), " brobet3s@devhub.com", "Male", 3, "Guohuan", "Actuary"),
                new Person(4, "Estevan", "Fernanando", LocalDate.of(1986, 6, 5), "efernanando4m@state.gov", "Male", 1, "Retkovci", "Registered Nurse"),
                new Person(5, "Elnar", "Chisholm", LocalDate.of(1982, 8, 30), "echisholm4w@fotki.com", "Female", 3, "Maceió", "Physical Therapy Assistant"),
                new Person(6, "Wendall", "Duligal", LocalDate.of(2016, 8, 8), "wduligal4y@whitehouse.gov", "Male", 2, "Nangkaruka", "Nurse")
        );

        return List.of(
                new House(1, "Other", otherBuilding),
                new House(1, "Hospital", peopleInHospital)
        );
    }

    public static List<Car> getCarsForTask14() {
        return List.of(
                new Car(1, "KMHDB8AE9BU199951", "Ford", "Mustang", 2009, "Goldenrod", 3716, 50000),
                new Car(2, "KMHDB8AE9BU199951", "Dodge", "Mustang", 2009, "Black", 3716, 42000),
                new Car(3, "KMHDB8AE9BU199951", "BMW", "Mustang", 2009, "Goldenrod", 3716, 30000),
                new Car(4, "KMHDB8AE9BU199951", "Civic", "Mustang", 2009, "Goldenrod", 3716, 10000),
                new Car(5, "KMHDB8AE9BU199951", "Ford", "Mustang", 2009, "Goldenrod", 3716, 25000),
                new Car(6, "KMHDB8AE9BU199951", "VW", "Mustang", 1979, "Goldenrod", 3716, 45000),
                new Car(6, "KMHDB8AE9BU199951", "VW", "Mustang", 1979, "Goldenrod", 3716, 45000),
                new Car(6, "KMHDB8AE9BU199951", "VW", "Mustang", 1979, "Pink", 3716, 35000),
                new Car(6, "KMHDB8AE9BU195951", "Bingo", "Mustang", 1979, "Pink", 3716, 35000)
        );
    }

    public static List<Flower> getFlowersForTask15() {
        return List.of(
                new Flower(1, "Chondrodendron", "Menispermaceae", 0.14, true, "Central African Republic", 1976,
                        List.of("Aluminum", "Plexiglass", "Plastic", "Steel", "Aluminum", "Wood", "Glass")),
                new Flower(2, "Salvia Cistus", "Cistaceae", 1.8, true, "African Republic", 506,
                        List.of("Glass", "Rubber", "Steel", "Glass", "Steel", "Rubber", "Stone")),
                new Flower(3, "Brushholly", "Menispermaceae", 0.14, false, "Central African Republic", 1976,
                        List.of("Aluminum", "Plexiglass", "Plastic", "Steel", "Aluminum", "Wood", "Glass"))
        );
    }

    public static List<Student> getStudentsForTask16() {
        return List.of(
                new Student(1, "White", 20, "Mathematics", "M-1"),
                new Student(2, "White", 19, "Mathematics", "M-1"),
                new Student(3, "White", 17, "Mathematics", "M-1"),
                new Student(4, "White", 18, "Mathematics", "M-1"),
                new Student(5, "Young", 16, "Physics", "P-2"),
                new Student(5, "Young", 17, "Physics", "P-2"),
                new Student(5, "Young", 16, "Physics", "P-2"),
                new Student(42, "Turner", 20, "ComputerScience", "C-3")
        );
    }

    public static List<Student> getStudentsForTask17() {
        return List.of(
                new Student(1, "White", 20, "Mathematics", "M-1"),
                new Student(2, "White", 19, "Mathematics", "M-1"),
                new Student(3, "White", 17, "Mathematics", "M-1"),
                new Student(4, "White", 18, "Mathematics", "M-1"),
                new Student(5, "Young", 16, "Physics", "P-2"),
                new Student(5, "Young", 17, "Physics", "P-2"),
                new Student(5, "Young", 16, "Physics", "P-2"),
                new Student(42, "Turner", 20, "ComputerScience", "C-3")
        );
    }

    public static List<Student> getStudentsForTask18() {
        return List.of(
                new Student(1, "White", 19, "Mathematics", "M-1"),
                new Student(2, "White", 19, "Mathematics", "M-1"),
                new Student(3, "White", 16, "Mathematics", "M-1"),
                new Student(4, "White", 18, "Mathematics", "M-1"),
                new Student(5, "Young", 18, "Physics", "P-2"),
                new Student(6, "Young", 17, "Physics", "P-2"),
                new Student(7, "Young", 16, "Physics", "P-2"),
                new Student(8, "Turner", 20, "ComputerScience", "C-3")
        );
    }

    public static List<Student> getStudentsForTask19() {
        return List.of(
                new Student(1, "White", 19, "Mathematics", "C-2"),
                new Student(2, "White", 19, "Mathematics", "C-2"),
                new Student(3, "White", 16, "Mathematics", "C-2"),
                new Student(4, "White", 18, "Mathematics", "C-2"),
                new Student(5, "Young", 18, "Physics", "P-2"),
                new Student(6, "Young", 17, "Physics", "P-2"),
                new Student(7, "Young", 16, "Physics", "P-2"),
                new Student(8, "Turner", 20, "ComputerScience", "C-3")
        );
    }

    public static List<Examination> getExaminationsForTask19() {
        return List.of(
                new Examination(1,1,8,7,8),
                new Examination(1,2,8,7,2),
                new Examination(1,4,8,7,8),
                new Examination(1,5,8,7,8),
                new Examination(1,6,8,7,8),
                new Examination(1,7,8,7,8),
                new Examination(1,8,8,7,8)
        );
    }

    public static List<Student> getStudentsForTask20() {
        return List.of(
                new Student(1, "White", 19, "Mathematics", "C-2"),
                new Student(2, "White", 19, "Mathematics", "C-2"),
                new Student(3, "White", 16, "Mathematics", "C-2"),
                new Student(4, "White", 18, "Mathematics", "C-2"),
                new Student(5, "Young", 18, "Physics", "P-2"),
                new Student(6, "Young", 17, "Physics", "P-2"),
                new Student(7, "Young", 16, "Physics", "P-2"),
                new Student(8, "Turner", 20, "ComputerScience", "C-3")
        );
    }

    public static List<Examination> getExaminationsForTask20() {
        return List.of(
                new Examination(1,1,8,7,8),
                new Examination(1,2,8,7,2),
                new Examination(1,4,8,7,8),
                new Examination(1,5,8,7,8),
                new Examination(1,6,8,7,8),
                new Examination(1,7,8,7,8),
                new Examination(1,8,8,7,8)
        );
    }
}
