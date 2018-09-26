package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        if(b==0) return a;
        return gcd(b,a%b);
    }

    public static int fibonacci(int n) {
        int f0=0,f1=1;
        int f=n;
        if(f==0||f==1){
            return f;}
        else if(f>1){
            for(int i=2;i<=f;i++){
                
                n=f0+f1;
                f0=f1;
                f1=n;
            }
        }             
                
        // TODO: Tìm số fibonacci ở vị trí n
        return n;
        
    }
    public static void main(String args[])
	{
		System.out.println(gcd(30,12));
		System.out.println(fibonacci(3));
	}
}
