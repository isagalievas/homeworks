package com.company;

import java.util.List;
import java.util.Objects;

public class Group {
    String groupName;
    String course;
    int numberOfGroup;
    List<Student> students;

    public Group(String groupName, String course, int numberOfGroup, List<Student> students) {
        this.groupName = groupName;
        this.course = course;
        this.numberOfGroup = numberOfGroup;
        this.students = students;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return numberOfGroup == group.numberOfGroup && groupName.equals(group.groupName) && course.equals(group.course) && students.equals(group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, course, numberOfGroup, students);
    }

    @Override
    public String toString() {
        return "Group {" +
                "groupName ='" + groupName + '\'' +
                ", course ='" + course + '\'' +
                ", numberOfGroup = " + numberOfGroup +
                ", students = " + students +
                '}';
    }
}
