package week1;

public class StudentManagement {

    	// TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
   Student students[] = new Student[100];
   int a=0;
   public void add(Student hs)
   {
   students[a++] = hs;
   }
    public static boolean sameGroup(Student s1, Student s2) {
		return s1.getgroup()==s2.getgroup();

    void studentsByGroup(){
        // TODO:
 	// int  n = Students.length;
        int[] A = new int[100];
        int i,j;
        for( i = 0;i<n;i++) A[i] = 1;
        for( i = 0;i<n;i++ )
        {
            if(A[i] == 1)
            {
                String s = Students[i].getGroup();
                System.out.println("Danh sach Sinh Vien Lop " + s + " :");
                for(j=i;j<n;j++)
                {
                    if(Students[j].getGroup().equals(s))
                    {
                        System.out.println(Students[j].getName());
                        A[j] = 0;
                    }


                }
            }
        }

    void removeStudent(String id) {
        // TODO:
	for (int i=0;i<a;i++)
		{
			if(students[i].getid()==id)
			{
				for(int j=i;j<a-1;j++)
				{
					students[j]=students[j+1];
				}
			}a--;
		}
        // TODO:
		

    public static void main(String[] args) {
        // TODO:
    }
}
