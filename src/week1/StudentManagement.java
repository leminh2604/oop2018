package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    Student students[] = new Student[100];
    int a = 0;

    public void add(Student hs) {
        students[a++] = hs;
    }

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup() == s2.getGroup();
    }

    void studentsByGroup() {
        // TODO:
        int n = students.length;
        int[] A = new int[100];
        int i, j;
        for (i = 0; i < n; i++) A[i] = 1;
        for (i = 0; i < n; i++) {
            if (A[i] == 1) {
                String s = students[i].getGroup();
                System.out.println("Danh sach Sinh Vien Lop " + s + " :");
                for (j = i; j < n; j++) {
                    if (students[j].getGroup().equals(s)) {
                        System.out.println(students[j].getName());
                        A[j] = 0;
                    }


                }
            }
        }
    }

    void removeStudent(String id) {
        // TODO:
        for (int i = 0; i < a; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < a - 1; j++) {
                    students[j] = students[j + 1];
                }
            }
            a--;
        }
        // TODO:
    }


    public static void main(String[] args) {
        // TODO:
        Student m = new Student();
        m.getInfo();
        Student m1= new Student("Le Sy Minh","17020894","hoangtucoc2604@gmail.com");
        m1.getInfo();
        Student m2= new Student(m1);
        m2.getInfo();

        Student s1 = new Student();
        s1.setName("Nhu Thao");
        s1.setGroup("INT20041");
        Student s2 = new Student();
        s2.setName("Loc Vu");
        s2.setGroup("INT20041");
        Student s3 = new Student();
        s3.setName("Thu Trang");
        s3.setGroup("INT20042");

        StudentManagement sv = new StudentManagement();
        System.out.println(sv.sameGroup(s1,s2));
    }
}
