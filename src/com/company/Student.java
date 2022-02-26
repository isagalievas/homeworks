package com.company;

public class Student {
   int id;
   String name;
   int gradesBySubject;

   public Student(int id, String name, int gradesBySubject) {
      this.id = id;
      this.name = name;
      this.gradesBySubject = gradesBySubject;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getGradesBySubject() {
      return gradesBySubject;
   }

   public void setGradesBySubject(int gradesBySubject) {
      this.gradesBySubject = gradesBySubject;
   }
}
