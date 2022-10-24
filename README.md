
[//]: # (## Exercises)

[//]: # (### Part One: The Test Driven Development Cycle &#40;Red, Green, Refactor&#41; )

[//]: # (We will follow the best practices of TDD, and we will create our tests first and write production code once we see the test fail. We will create a `Student` and a `StudentTest` class for a grades application, before you start let's analyse the requirements for the `Student` class:)
[//]: # ( )
[//]: # (- `id` should be a `long` number used to represent a "unique user" in our application.)

[//]: # (- `name` is a `String` that holds the name of the student.)

[//]: # (- `grades` is an `ArrayList` that contains a list of `Integer` numbers.)

[//]: # (1. Create a new branch called `students-tests` and read carefully the next instructions.)

[//]: # (1. Create a `StudentTest.java` class file inside of `src/test/java` &#40;you might have to create these folders yourself&#41; and remember to write the test before the actual production code. We will simulate the `C&#40;reate&#41; R&#40;ead&#41;` from the `CRUD` functionality in our grades application, you should be able to test and create the following requirements:)

[//]: # (    - The `Student` class should have a constructor that sets both the name and id property, it initializes the grades property as an empty ArrayList.)

[//]: # (    - The `Student` class should have the following methods:)
[//]: # (```java)

[//]: # (    // returns the student's id)

[//]: # (    public long getId&#40;&#41;{...})

[//]: # ()
[//]: # (    // returns the student's name)

[//]: # (    public String getName&#40;&#41;{...})

[//]: # ()
[//]: # (    // adds the given grade to the grades list)

[//]: # (    public void addGrade&#40;int grade&#41;{...})

[//]: # (  )
[//]: # (    // returns the list of grades)

[//]: # (    public ArrayList<Integer> getGrades&#40;&#41;{...})

[//]: # ()
[//]: # (    // returns the average of the students grades)

[//]: # (    public double getGradeAverage&#40;&#41;{...})

[//]: # (```)

[//]: # (1. As always, commit and push all your changes once you're done.   )

[//]: # (_At the end of the exercise you will end up with a `Student.java` and a `StudentTest.java` class._)

[//]: # ()
[//]: # (#### Bonus)

[//]: # ()
[//]: # (- Go ahead and try to add the rest of the `CRUD` tests and functionality, write the methods for `updateGrade&#40;&#41;` and `deleteGrade&#40;&#41;` in the `Student` class.)

[//]: # ()
[//]: # (### Part Two: Testing Legacy Code)

[//]: # ()
[//]: # (Once you are done with the `Student.java` class.)
 
[//]: # (1. Checkout to the `cohorts-feature` branch, there you will find a `Cohort.java` class inside the `src/main/java` folder, this class has already a lot of methods to calculate the cohort average grade and add a student. Let's go ahead and make sure there's sufficient tests for this class to be deployed to production:)

[//]: # (1. Start by creating a new branch called: `cohorts-tests`.)

[//]: # (1. Then create a `CohortTest` class and build a test for each of the following requirements:)

[//]: # (    - A `Cohort` instance can add a `Student` to the `List` of students.)

[//]: # (    - A `Cohort` instance can get the current `List` of students.)

[//]: # (    - A `Cohort` instance can get the average, and it's being calculated correctly. )

[//]: # (1. Go back to the `StudentTest` class and refactor the code to avoid any repetition in the test cases, the use of the `@Before` annotation will be useful to achieve this, do the same with this new `CohortTest` class if you find any code repetition as well.)

[//]: # ()
[//]: # (#### Bonus)

[//]: # (- Follow the TDD cycle and create a new feature to find students by their ID like: `findStudentById&#40;long id&#41;` in the `Cohort` class, remember to create the tests first before any production code.)