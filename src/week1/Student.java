package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name ,id ,group ,email;

    // TODO: khai báo các phương thức getter, setter cho Student

    public void setName(String name){
        this.name = name;}
    public String getName(){
        return name;}
    public void setId(String id){
        this.id = id;}
    public String getId(){
        return id;}
    public void  setGroup(String group){
        this.group = group;}
    public String getGroup(){
        return group;}
    public void getEmail(String email){
        this.email=email;}
    public String getEmail(){
        return email;}
    /**
     * Constructor 1
     */
    public Student() {
        name="Student";
        id="000";
        group="INT22041";
        email="uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    public Student(String n, String sid, String em) {
        // TODO:
        name=n;
        id=sid;
        email=em;
        group="INT2204";
    }

    /**
     * Constructor 3
     * @param s
     */
    public Student(Student s) {
        name=s.getName();
        id=s.getId();
        email=s.getEmail();
        group=s.getGroup();
    }

    public String getInfo() {
        // TODO:
        System.out.println(name + this.name);

        System.out.println(id + this.id);

        System.out.println(group + this.group);

        System.out.println(email + this.email);
        return null;
    }
}
