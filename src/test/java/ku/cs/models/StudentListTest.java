package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class StudentListTest {

    StudentList studentList;

    @BeforeEach
    void init() {
        studentList = new StudentList();
    }

    @Test
    @DisplayName("Test addNewStudent")
    void testAddNewStudent() {
        studentList.addNewStudent("6610450790", "Non");
        studentList.addNewStudent("6610456789", "Mo");
        ArrayList<Student> students = studentList.getStudents();
        assertEquals(2,students.size());
        assertEquals("6610450790",students.get(0).getId());
        assertEquals("Non",students.get(0).getName());
        assertEquals("6610456789",students.get(1).getId());
        assertEquals("Mo",students.get(1).getName());
    }

    @Test
    @DisplayName("Test Find By ID")
    void testFindStudentById() {
        studentList.addNewStudent("6610450790", "Non");
        studentList.addNewStudent("6610456789", "Mo");
        Student foundStudent = studentList.findStudentById("6610450790");
        assertEquals("6610450790", foundStudent.getId());
        assertEquals("Non", foundStudent.getName());
    }

    @Test
    @DisplayName("Test Give Score to ID")
    void testGiveScoreToID() {
        studentList.addNewStudent("6610450790", "Non");
        studentList.addNewStudent("6610456789", "Mo");
        studentList.giveScoreToId("6610450790", 10);
        assertEquals(10, studentList.findStudentById("6610450790").getScore());
    }
}