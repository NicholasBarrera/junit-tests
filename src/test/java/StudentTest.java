import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student nick;

    @Before
    public void setup(){
        nick = new Student(1L, "Nick");
    }

    @Test
    public void testIfStudentObjCanBeCreated(){
        Student david = null;
        assertNull(david);
        assertNotNull(nick);
    }

    @Test
    public void testIfFieldWork(){
        assertEquals(1, nick.getId());
        assertEquals("Nick", nick.getName());
        assertNotNull(nick.getGrades());

        Student david = new Student(2L, "David");
        assertNotEquals("Nick", david.getName());

    }

    @Test
    public void testIfAddGradeWorks(){
        assertEquals(0, nick.getGrades().size());
        nick.addGrade(90);
        assertEquals(1, nick.getGrades().size());
        nick.addGrade(100);
        assertEquals(2, nick.getGrades().size());

        assertEquals(90, (int) nick.getGrades().get(0));
        assertEquals(100, (int) nick.getGrades().get(1));
    }

    @Test
    public void testIfGetGradeAverageWorks(){
        nick.addGrade(80);
        nick.addGrade(100);
        assertEquals(90, nick.getGradeAverage(), 0);
        nick.addGrade(60);
        assertEquals(80, nick.getGradeAverage(), 0);
    }

}