package week2.task3;
//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
class hinhhop {
  	int chieudai;
	int chieurong;
	int chieucao;
	// khai báo kích thước hình hộp
  public void SetChieudai(int chieudai)
  {
	  this.chieudai=chieudai;
  }
  public int GetChieudai()
  {
	  return chieudai;
  }
  public void SetChieurong(int chieurong)
  {
	  this.chieurong=chieurong;
  }
  public int GetChieurong()
  {
	  return chieurong;
  }
  public void SetChieucao(int chieucao)
  {
	  this.chieucao=chieucao;
  }
  public int GetChieucao()
  {
	  return chieucao;
  }
  
  public int dientichtoanphan()
  {
    // tính diện tích toàn phần
	  return chieudai*chieurong*2+chieurong*chieucao*2+chieudai*chieucao*2;
  }
  
  public int dientichxungquanh()
  {
    // tính diện tích xung quanh
	  return 2*chieucao*(chieudai+chieurong);
  }
  
  public int thetich()
  {
    // tính thể tích
	  return chieudai*chieurong*chieucao;
  }

public static void main(String args[])
{
  hinhhop s = new hinhhop();
	s.SetChieudai(3);
	s.SetChieucao(4);
	s.SetChieurong(5);
	System.out.println(s.dientichxungquanh());
}
}
class connguoi{
	int chieucao;
	int cannang;
	int iq;
	// khai báo chỉ số cơ bản ở người
  public void SetChieucao(int chieucao)
  {
	  this.chieucao=chieucao;
  }
  public int GetChieucao() 
  {
	  return chieucao;
  }
  public void SetCannang(int cannang)
  {
	  this.cannang=cannang;
  }
  public int GetCannang() 
  {
	  return cannang;
  }
   public void SetIq(int iq)
  {
	  this.iq=iq;
  }
  public int GetIq() 
  {
	  return iq;
  }
  public void danhgiacannang()
  {
	  if(cannang<50) { System.out.println(" gay ");}
	  else if(cannang>70) {System.out.println(" beo ");}
	  else {System.out.println(" binh thuong ");}
  }
  // đánh giá cân nặng
  public void danhgiachieucao()
  {
	  if(cao<140){System.out.println(" thap ");}
	  else if(cao>190){System.out.println(" qua cao ");}
	  else {System.out.println(" binh thuong ");}
  }
  // đánh giá chiều cao
   public void chisothongminh()
   {
	  if(iq>=85&&iq<=115){System.out.println(" binh thuong ");}
	  else if(nhietdo<85){System.out.println(" IQ thap");}
	  else {System.out.println(" IQ cao ");} 
   }
   // đánh giá chỉ số thông minh
   public static void main (String agrs[])
   {
	   connguoi a = new connguoi();
	   a.SetIq(120);
	   a.chisothongminh();
   }  
}

class thoitiet
{
	int nhietdo;
	int doam;
	int luongmua;
	  public void SetNhietdo(int nhietdo)
  {
	  this.nhietdo=nhietdo;
  }
  public int GetNhietdo() 
  {
	  return nhietdo;
  }
  public void SetDoam(int doam)
  {
	  this.doam=doam;
  }
  public int GetDoam() 
  {
	  return doam;
  }
   public void SetLuongmua(int luongmua)
  {
	  this.luongmua=luongmua;
  }
  public int GetLuongmua() 
  {
	  return luongmua;
  }
  public void xetnhietdo()
  {
	  if(nhietdo>30) {System.out.println("troi nong");}
	  else if(nhietdo<17) {System.out.println("troi ret");}
	  else {System.out.println("on hoa");}
  }
  // đánh giá nhiệt độ
  public void xetdoam()
  {
	  if(doam>50&&doam<80) {System.out.println(" tot ");}
	  else if(doam>80){System.out.println("am cao");}
    else {System.out.println("am thap");}
  }
  // đánh giá độ ẩm
  public void xetluongmuamotngay ()
  {
	  if(luongmua>16&&luongmua<50) {System.out.println("mua vua");}
	  else if(luongmua>50&&luongmua<100){System.out.println("mua to");}
    else if(luongmua>100){System.out.println("mua rat to");}
  }
  // đánh giá lượng mưa trong một ngày
  public static void main(String agrs[])
  {
	  thoitiet t = new thoitiet();
	  t.SetLuongmua(90);
	  t.xetluongmuamotngay();
  }
}
