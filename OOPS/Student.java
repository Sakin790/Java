package OOPS;

class Students {

   String name, fatherName, motherName, location;
   int age, roll;

   void studentsDetails(String studentName, String studentFather, String studentMother, String StudentLocation,
         int studentRoll, int studentAge

   ) {
      name = studentName;
      fatherName = studentFather;
      motherName = studentMother;
      location = StudentLocation;
      age = studentAge;
      roll = studentRoll;

   }
}

public class Student {
   public static void main(String[] args) {

      Students mahid = new Students();
      mahid.studentsDetails("Sakin", "abdul", "selina", "BD", 1, 19);
      System.out.println(mahid.age);
      System.out.println(mahid.location);
   }
}
