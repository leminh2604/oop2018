package week2.task3;
//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
class hinhhop {
  int chieudai;
	int chieurong;
	int chieucao;
	// khai bao thong tin  hinh hop
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
    //tinh dien tich toan phan
	  return chieudai*chieurong*2+chieurong*chieucao*2+chieudai*chieucao*2;
  }
  
  public int dientichxungquanh()
  {
    //tinh dien tich xung quanh
	  return 2*chieucao*(chieudai+chieurong);
  }
  
  public int thetich()
  {
    //tinh the tich
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
	//khai bao chi so nguoi
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
  // danh gia can nang
  public void danhgiachieucao()
  {
	  if(cao<140){System.out.println(" thap ");}
	  else if(cao>190){System.out.println(" qua cao ");}
	  else {System.out.println(" binh thuong ");}
  }
  //danh gia chieu cao
   public void chisothongminh()
   {
	  if(iq>=85&&iq<=115){System.out.println(" binh thuong ");}
	  else if(nhietdo<85){System.out.println(" IQ thap");}
	  else {System.out.println(" IQ cao ");} 
   }
   //danh gia chi so thong minh
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
  public void SetDoam(String doam)
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
  // danh gia nhiet do
  public void xetdoam()
  {
	  if(doam>50&&doam<80) {System.out.println(" tot ");}
	  else if(doam>80){System.out.println("am cao");}
    else {System.out.println("am thap");}
  }
  // danh gia do am
  public void xetluongmuamotngay ()
  {
	  if(luongmua>16&&luongmua<50) {System.out.println("mua vua");}
	  else if(luongmua>50&&luongmua<100){System.out.println("mua to");}
    else if(luongmua>100){System.out.println("mua rat to");}
  }
  // danh gia luong mua trong mot ngay
  public static void main(String [] abc)
  {
	  thoitiet t = new thoitiet();
	  t.SetLuongmua(90);
	  t.xetluongmuamotngay();
  }
}
