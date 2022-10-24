import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student nick;

    @Before
    public void setup(){
        nick = new Student(1, "nick");
    }
//    public void testGetId() {
//
//    }
//
//    public void testGetName() {
//    }
//
//    public void testGetGrades() {
//    }
//
//    public void testAddGrade() {
//    }

    @Test
    public void testGetGradeAverage() {
        nick.addGrade(80);
        nick.addGrade(100);
        assertEquals(90, nick.getGradeAverage(),0);
    }
}
