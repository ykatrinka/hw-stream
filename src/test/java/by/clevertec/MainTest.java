package by.clevertec;

import by.clevertec.model.Person;
import by.clevertec.model.Student;
import by.clevertec.util.Util;
import by.clevertec.util.UtilTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.when;

class MainTest {

    private MockedStatic<Util> mockUtil;

    @BeforeEach
    public void setUp() {
        mockUtil = mockStatic(Util.class);
    }

    @AfterEach
    public void tearDown() {
        mockUtil.close();
    }

    @Nested
    class Task1 {
        @Test
        void shouldReturnEmptyList() {
            when(Util.getAnimals()).thenReturn(UtilTest.getEmptyListAnimals());
            assertTrue(Main.task1().isEmpty());
        }

        @Test
        void shouldReturnAnimalsForZoo() {
            when(Util.getAnimals()).thenReturn(UtilTest.getAnimalsForTestTask1());
            assertEquals(7, Main.task1().size());
        }
    }


    @Nested
    class Task2 {
        @Test
        void shouldReturnEmptyList() {
            when(Util.getAnimals()).thenReturn(UtilTest.getEmptyListAnimals());
            assertEquals(0, Main.task2().size());
        }

        @Test
        void shouldReturnBreadForJapaneseAnimals() {
            when(Util.getAnimals()).thenReturn(UtilTest.getAnimalsForTestTask2());

            List<String> actualBread = Main.task2();
            assertAll(
                    () -> assertEquals(4, actualBread.size()),
                    () -> assertEquals("Stork, white - necked", actualBread.get(0)),
                    () -> assertEquals("Huron", actualBread.get(1)),
                    () -> assertEquals("LORIKEET, SCALY-BREASTED", actualBread.get(2)),
                    () -> assertEquals("Brazilian Tapir", actualBread.get(3))
            );
        }
    }

    @Nested
    class Task3 {
        @Test
        void shouldReturnEmptyList() {
            when(Util.getAnimals()).thenReturn(UtilTest.getEmptyListAnimals());
            assertTrue(Main.task3().isEmpty());
        }

        @Test
        void shouldReturnAnimalsCountry() {
            when(Util.getAnimals()).thenReturn(UtilTest.getAnimalsForTestTask3());

            List<String> actualCountries = Main.task3();
            assertAll(
                    () -> assertEquals(2, actualCountries.size()),
                    () -> assertEquals("Armenian", actualCountries.get(0)),
                    () -> assertEquals("Albanian", actualCountries.get(1))
            );
        }
    }

    @Nested
    class Task4 {
        @Test
        void shouldReturnEmptyList() {
            when(Util.getAnimals()).thenReturn(UtilTest.getEmptyListAnimals());
            assertEquals(0, Main.task4());
        }

        @Test
        void shouldReturnCountFemaleAnimals() {
            when(Util.getAnimals()).thenReturn(UtilTest.getAnimalsForTestTask4());
            assertEquals(3, Main.task4());
        }
    }

    @Nested
    class Task5 {
        @Test
        void shouldReturnFalseForEmptyList() {
            when(Util.getAnimals()).thenReturn(UtilTest.getEmptyListAnimals());
            assertFalse(Main.task5());
        }

        @Test
        void shouldReturnTrueForAnimalsWithExistsCountry() {
            when(Util.getAnimals()).thenReturn(UtilTest.getAnimalsWithExistsCountryForTestTask5());
            assertTrue(Main.task5());
        }

        @Test
        void shouldReturnFalseForAnimalsWithNotExistsCountry() {
            when(Util.getAnimals()).thenReturn(UtilTest.getAnimalsWithNotExistsCountryForTestTask5());
            assertFalse(Main.task5());
        }
    }

    @Nested
    class Task6 {
        @Test
        void shouldReturnTrieForEmptyList() {
            when(Util.getAnimals()).thenReturn(UtilTest.getEmptyListAnimals());
            assertTrue(Main.task6());
        }

        @Test
        void shouldReturnTrueForAnimalsOnlyMaleAndFemale() {
            when(Util.getAnimals()).thenReturn(UtilTest.getAnimalsOnlyMaleAndFemaleForTestTask6());
            assertTrue(Main.task6());
        }

        @Test
        void shouldReturnFalseForAnimalsNotOnlyMaleAndFemale() {
            when(Util.getAnimals()).thenReturn(UtilTest.getAnimalsNotOnlyMaleAndFemaleForTestTask6());
            assertFalse(Main.task6());
        }
    }

    @Nested
    class Task7 {
        @Test
        void shouldReturnTrueForEmptyList() {
            when(Util.getAnimals()).thenReturn(UtilTest.getEmptyListAnimals());
            assertTrue(Main.task7());
        }

        @Test
        void shouldReturnTrueForAnimalsWithNotExistsCountry() {
            when(Util.getAnimals()).thenReturn(UtilTest.getAnimalsWithNotExistsCountryForTestTask7());
            assertTrue(Main.task7());
        }

        @Test
        void shouldReturnFalseForAnimalsWithExistsCountry() {
            when(Util.getAnimals()).thenReturn(UtilTest.getAnimalsWithExistsCountryForTestTask7());
            assertFalse(Main.task7());
        }
    }

    @Nested
    class Task8 {
        @Test
        void shouldReturnNullForEmptyList() {
            when(Util.getAnimals()).thenReturn(UtilTest.getEmptyListAnimals());
            assertNull(Main.task8());
        }

        @Test
        void shouldReturnMaxAgeAnimals() {
            when(Util.getAnimals()).thenReturn(UtilTest.getAnimalsForTestTask8());
            assertEquals(45, Main.task8());
        }
    }

    @Nested
    class Task9 {
        @Test
        void shouldReturnNullForEmptyList() {
            when(Util.getAnimals()).thenReturn(UtilTest.getEmptyListAnimals());
            assertNull(Main.task9());
        }

        @Test
        void shouldReturnMinLengthBreedAnimals() {
            when(Util.getAnimals()).thenReturn(UtilTest.getAnimalsForTestTask9());
            assertEquals(5, Main.task9());
        }
    }

    @Nested
    class Task10 {
        @Test
        void shouldReturnZeroForEmptyList() {
            when(Util.getAnimals()).thenReturn(UtilTest.getEmptyListAnimals());
            assertEquals(0, Main.task10());
        }

        @Test
        void shouldReturnSumAgeAnimals() {
            when(Util.getAnimals()).thenReturn(UtilTest.getAnimalsForTestTask10());
            assertEquals(101, Main.task10());
        }
    }

    @Nested
    class Task11 {
        @Test
        void shouldReturnNanForEmptyList() {
            when(Util.getAnimals()).thenReturn(UtilTest.getEmptyListAnimals());
            assertEquals(Double.NaN, Main.task11());
        }

        @Test
        void shouldReturnAvgAgeAnimals() {
            when(Util.getAnimals()).thenReturn(UtilTest.getAnimalsForTestTask11());
            assertEquals(34, Main.task11());
        }
    }

    @Nested
    class Task12 {
        @Test
        void shouldReturnEmptyList() {
            when(Util.getPersons()).thenReturn(UtilTest.getEmptyListPeople());
            assertTrue(Main.task12().isEmpty());
        }

        @Test
        void shouldReturnListOfMaleWithCorrectAge() {
            final LocalDate CURRENT_DAY = LocalDate.of(2024, 8, 12);
            final LocalDate maxDate = LocalDate.of(2006, 8, 12);
            final LocalDate minDate = LocalDate.of(1997, 8, 12);
            when(Util.getPersons()).thenReturn(UtilTest.getPeopleForTestTask12());

            try (MockedStatic<LocalDate> mocked = Mockito.mockStatic(LocalDate.class)) {
                mocked.when(LocalDate::now).thenReturn(CURRENT_DAY);
                mocked.when(() -> LocalDate.now().minusYears(18)).thenReturn(maxDate);
                mocked.when(() -> LocalDate.now().minusYears(27)).thenReturn(minDate);

                assertEquals(8, Main.task12().size());
            }
        }
    }

    @Nested
    class Task13 {
        @Test
        void shouldReturnEmptyList() {
            when(Util.getHouses()).thenReturn(UtilTest.getEmptyListHouses());
            assertTrue(Main.task13().isEmpty());
        }

        @Test
        void shouldReturnListOfEvacuationPeople() {
            final LocalDate CURRENT_DAY = LocalDate.of(2024, 8, 12);
            final LocalDate maxDate = LocalDate.of(2006, 8, 12);
            final LocalDate minDateMale = LocalDate.of(1961, 8, 12);
            final LocalDate minDateFemale = LocalDate.of(1966, 8, 12);

            when(Util.getHouses()).thenReturn(UtilTest.getHousesForTestTask13());

            try (MockedStatic<LocalDate> mocked = Mockito.mockStatic(LocalDate.class)) {
                mocked.when(LocalDate::now).thenReturn(CURRENT_DAY);
                mocked.when(() -> LocalDate.now().minusYears(18)).thenReturn(maxDate);
                mocked.when(() -> LocalDate.now().minusYears(58)).thenReturn(minDateFemale);
                mocked.when(() -> LocalDate.now().minusYears(63)).thenReturn(minDateMale);

                List<Person> actualList = Main.task13();
                assertAll(
                        () -> assertEquals(6, actualList.size()),
                        () -> assertEquals(1, actualList.get(0).getId()),
                        () -> assertEquals(2, actualList.get(1).getId()),
                        () -> assertEquals(3, actualList.get(2).getId()),
                        () -> assertEquals(6, actualList.get(3).getId()),
                        () -> assertEquals(4, actualList.get(4).getId()),
                        () -> assertEquals(5, actualList.get(5).getId())
                );
            }
        }
    }

    @Nested
    class Task14 {
        @Test
        void shouldReturnZeroForEmptyList() {
            when(Util.getCars()).thenReturn(new ArrayList<>());
            assertEquals(0, Main.task14());
        }

        @Test
        void shouldReturnListCars() {
            when(Util.getCars()).thenReturn(UtilTest.getCarsForTask14());
            assertEquals(316761.20984, Main.task14(), 0.0);
        }
    }

    @Nested
    class Task15 {
        @Test
        void shouldReturnZeroForEmptyList() {
            when(Util.getFlowers()).thenReturn(new ArrayList<>());
            assertEquals(0, Main.task15());
        }

        @Test
        void shouldReturnTotalCoastFlowers() {
            when(Util.getFlowers()).thenReturn(UtilTest.getFlowersForTask15());
            assertEquals(7403.295, Main.task15(), 0.0);
        }
    }

    @Nested
    class Task16 {
        @Test
        void shouldReturnEmptyList() {
            when(Util.getStudents()).thenReturn(new ArrayList<>());
            assertTrue(Main.task16().isEmpty());
        }

        @Test
        void shouldReturnAdultStudents() {
            when(Util.getStudents()).thenReturn(UtilTest.getStudentsForTask16());
            assertEquals(4, Main.task16().size());
        }
    }

    @Nested
    class Task17 {
        @Test
        void shouldReturnEmptyList() {
            when(Util.getStudents()).thenReturn(new ArrayList<>());
            assertTrue(Main.task17().isEmpty());
        }

        @Test
        void shouldReturnStudentsGroup() {
            when(Util.getStudents()).thenReturn(UtilTest.getStudentsForTask17());
            assertEquals(3, Main.task17().size());
        }
    }

    @Nested
    class Task18 {
        @Test
        void shouldReturnEmptyList() {
            when(Util.getStudents()).thenReturn(new ArrayList<>());
            assertTrue(Main.task18().isEmpty());
        }

        @Test
        void shouldReturnStudentsGroup() {
            when(Util.getStudents()).thenReturn(UtilTest.getStudentsForTask18());

            Map<String, Double> actualMap = Main.task18();
            assertAll(
                    () -> assertEquals(3, actualMap.size()),
                    () -> assertEquals(20, actualMap.get("ComputerScience")),
                    () -> assertEquals(18, actualMap.get("Mathematics")),
                    () -> assertEquals(17, actualMap.get("Physics"))
            );
        }
    }

    @Nested
    class Task19 {
        @Test
        void shouldReturnEmptyList() {
            when(Util.getStudents()).thenReturn(new ArrayList<>());
            assertTrue(Main.task19().isEmpty());
        }

        @Test
        void shouldReturnGoodStudents() {
            when(Util.getStudents()).thenReturn(UtilTest.getStudentsForTask19());
            when(Util.getExaminations()).thenReturn(UtilTest.getExaminationsForTask19());

            List<Student> actualList = Main.task19();
            assertAll(
                    () -> assertEquals(2, actualList.size()),
                    () -> assertEquals(1, actualList.get(0).getId()),
                    () -> assertEquals(4, actualList.get(1).getId())
            );

        }
    }

    @Nested
    class Task20 {
        @Test
        void shouldReturnNullForEmptyList() {
            when(Util.getStudents()).thenReturn(new ArrayList<>());
            assertNull(Main.task20());
        }

        @Test
        void shouldReturnBestFaculty() {
            when(Util.getStudents()).thenReturn(UtilTest.getStudentsForTask20());
            when(Util.getExaminations()).thenReturn(UtilTest.getExaminationsForTask20());

            String actualFaculty = Main.task20();
            assertEquals("ComputerScience", actualFaculty);
        }
    }

    @Nested
    class Task21 {
        @Test
        void shouldReturnNullForEmptyList() {
            when(Util.getStudents()).thenReturn(new ArrayList<>());
            assertTrue(Main.task21().isEmpty());
        }

        @Test
        void shouldReturnBestFaculty() {
            when(Util.getStudents()).thenReturn(UtilTest.getStudentsForTask20());
            when(Util.getExaminations()).thenReturn(UtilTest.getExaminationsForTask20());

            Map<String, Long> actualMap = Main.task21();
            assertAll(
                    () -> assertEquals(3, actualMap.size()),
                    () -> assertEquals(3, actualMap.get("P-2")),
                    () -> assertEquals(1, actualMap.get("C-3")),
                    () -> assertEquals(4, actualMap.get("C-2"))
            );
        }
    }

}
