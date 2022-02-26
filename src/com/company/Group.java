package com.company;

import java.util.List;

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
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Group group = (Group) obj;
        return numberOfGroup == group.numberOfGroup && groupName == group.groupName ||
    }
}
