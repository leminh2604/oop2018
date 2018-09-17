package week1;

public class StudentManagement {

    public Student [] array=new Student[100];

    public boolean sameGroup(Student s1, Student s2) {
        if(s1.group==s2.group)return true;
		
        else return false; // xóa dòng này sau khi cài đặt
    }

    void studentsByGroup(){
        // TODO:
		String namegroup;
		for(int i=0; i<array.length;i++){
            if(array[i].group == namegroup){
               array[i].getInfo();
            }
        }
    }

    void removeStudent(String id) {
        // TODO:
		
    }

    public static void main(String[] args) {
        // TODO:
    }
}