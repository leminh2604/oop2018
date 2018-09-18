package week1;

public class StudentManagement {

    	// TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
   Student[] students = new Student[100];
   int a=0;
   public void add(Student hs)
   {
   students[a++] = hs;
   }
    public static boolean sameGroup(Student s1, Student s2) {
		return s1.getgroup()==s2.getgroup();

    void studentsByGroup(){
        // TODO:

    }

    void removeStudent(String id) {
        // TODO:
		
    }

    public static void main(String[] args) {
        // TODO:
    }
}
