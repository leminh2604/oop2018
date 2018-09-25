package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
    int numerator;
    int denominator;
    
    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator=numerator;
        this.denominator=denominator; 
    }
    public int getNumerator() {
        return numerator;
    }
 
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
 
    public int getDenominator() {
        return denominator;
    }
 
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    public int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        if(b==0) return a;
        return gcd(b;a%b);
    }
        
    public void toiGianPhanSo() {
        int i = gcd(this.getNumerator(), this.getDenominator());
        this.setNumerator(this.getNumerator() / i);
        this.setDenominator(this.getDenominator() / i);
    }
        
    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction phanso= new Fraction(numerator,denominator);
        phanso.numerator=((other.numerator)*(this.denominator))+((other.denominator)*(this.numerator));
        phanso.denominator=((this.denominator)*(other.denominator));
        phanso.toiGianPhanSo();
        System.out.println("Tổng hai phân số = " + phanso.numerator + "/" + phanso.denominator);
        return phanso;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction phanso= new Fraction(numerator,denominator);
        phanso.numerator=((this.numerator)*(other.denominator))-((this.denominator)*(other.numerator));
        phanso.denominator=((this.denominator)*(other.denominator));
        phanso.toiGianPhanSo();
        System.out.println("Hiệu hai phân số = " + phanso.numerator + "/" + phanso.denominator);
        return phanso;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction phanso= new Fraction(numerator,denominator);
        phanso.numerator=((other.numerator)*(this.numerator));
        phanso.denominator=((this.denominator)*(other.denominator));
        phanso.toiGianPhanSo();
        System.out.println("Tích hai phân số = " + phanso.numerator + "/" + phanso.denominator);
        return phanso;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction phanso= new Fraction(numerator,denominator);
        phanso.numerator=((this.numerator)*(other.denominator));
        phanso.denominator=((this.denominator)*(other.numerator));
        phanso.toiGianPhanSo();
        System.out.println("Thương hai phân số = " + phanso.numerator + "/" + phanso.denominator);
        return phanso;
        
    }
    
    public boolean equals(Object obj){
        Fraction f = (Fraction) obj;
        return (numerator*(f.denominator)=denominator*(f.numerator));
    }
    
    public static void main(String args[]){
        Fraction f1 = new Fraction(12,19);
        Fraction f2 = new Fraction(1,3);
        Fraction f3 = new Fraction(2,9);
        f3=f1.add(f2);
        if(f2.equals(f3))
            system.out.println("true");
        else
            system.out.println("false");
    }
}
