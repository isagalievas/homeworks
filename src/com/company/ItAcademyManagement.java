package com.company;

import java.util.ArrayList;
import java.util.List;

public class ItAcademyManagement {
    private Group[] groups;
    public Student[] students;

    public ItAcademyManagement(Group[] groups, Student[] students) {
        this.groups = groups;
        this.students = students;
    }

    public void addGruop(String groupName, String course, int numberOfGroup, List<Student> students) {
        for (int i = 0; i < groups.length; i++) {
            if (groups[i] == null) {
                groups[i] = new Group(groupName, course, numberOfGroup, students);
                return;
            }
        }
    }

    public void addStudent(int id, String name, int gradesBySubject, int numberOfGroup) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = new Student(id, name, gradesBySubject);
                return;
            }
        }
    }

    public void removeStudent(int numberOfGroup, int id, String name, int gradesBySubject) {
        boolean check = true;
        try {

            for (int i = 0; i < students.length; i++) {
                if (students[i].getId() == numberOfGroup) {
                    students[i] = null;
                    check = false;
                }
            }

        }
    }
