package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student s1;

    @BeforeEach
    void init() {
        s1 = new Student("6610450790", "Kittituch");
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน")
    void testAddScore() {
//        Student s1 = new Student("6610450790", "Kittituch");
        assertEquals(0, s1.getScore());
        s1.addScore(40.5);
        assertEquals(40.5, s1.getScore());
        s1.addScore(10);
        assertEquals(50.5, s1.getScore());
    }

    @Test
    @DisplayName("ทดสอบการคิดเกรด")
    void testCalculateGrade() {
//        Student s1 = new Student("6610450790", "Kittituch");
        s1.addScore(60.8);
        assertEquals("C", s1.grade());
    }

    @Test
    @DisplayName("ทดสอบการเปลี่ยนชื่อ")
    void testChangeName() {
        s1.changeName("Mo");
        assertEquals("Mo", s1.getName());
    }

    @Test
    @DisplayName("ทดสอบ ID")
    void testIsID() {
        String id = "6610450790";
        assertEquals(true, s1.isId(id));
    }

    @Test
    @DisplayName("ทดสอบ Constructor")
    void testConstructor() {
        Student s2 = new Student("6610456789", "Sawasdee", 50);
        assertEquals("Sawasdee", s2.getName());
        assertEquals("6610456789", s2.getId());
        assertEquals(50, s2.getScore());
    }

    @Test
    @DisplayName("ทดสอบ toString")
    void testToString(){
        assertEquals("{id: '6610450790', name: 'Kittituch', score: 0.0}", s1.toString());
    }

}