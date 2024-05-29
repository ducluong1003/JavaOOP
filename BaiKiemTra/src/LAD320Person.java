import java.util.ArrayList;
import java.util.Scanner;

public class LAD320Person {
    Scanner sc = new Scanner(System.in);

    public int Id;
    public String Ten;
    public float CanNang ;
    public void LAD320Person( int Id, String Name, float CanNang)
    {
        this.Id = Id;
        this.Ten = Ten;
        this.CanNang = CanNang;
    }
    public  int getId()
    {
        return Id;
    }
    public void setId(int Id)
    {
        this.Id = Id;
    }
    public  String getTen()
    {
        return Ten;
    }
    public void setTen( String Ten)
    {
        this.Ten = Ten;
    }
    public  float getCanNang()
    {
        return CanNang;
    }
    public void setId(float CanNang)
    {
        this.CanNang = CanNang;
    }
    public void HienThiTT()
    {
        System.out.println(" Id = " + Id + "Ten =  " + Ten + " CanNag = " + CanNang);
    }

   public static ArrayList<LAD320Person> persons = new ArrayList<>();
  public static Scanner Sc = new Scanner(System.in);
  public static void ThemMoi()
  {
    System.out.println(" Nhap Id");
    int Id = Sc.nextInt();
    System.out.println(" Nhap Ten");
    String Ten = Sc.nextLine();
    System.out.println(" Nhap can nang");
    float CanNag = Sc.nextFloat();
    LAD320Person person = new LAD320Person();
    persons.add(person);
    
  }
  public static void SuaTT()
  {
    System.out.println(" Nhap Id person muon sua ");
    int Id = Sc.nextInt();
    for( LAD320Person person : persons)
    {
        if( person.getId()== Id)
        {
            System.out.println(" Nhap ten moi");
            String Ten = Sc.nextLine();
            System.out.println(" Nhap can nang moi ");
            float CanNag = Sc.nextFloat();
            person.setTen(Ten);
            person.setCanNag(CanNag);
        }
    }
  }
  public static void xoaTT()
  {
    System.out.println(" Nhap Id person muon xoa ");
    int Id = Sc.nextInt();
    
    if( persons.isEmpty())
    {
        System.out.println(" Khong thay person");
    }
    else
    {
        for( LAD320Person person : persons)
        persons.remove(persons);
    }
    
  }
  public static void HienthiTT()
  {
    if( persons.isEmpty())
    {
        System.out.println(" Rong");
    }
    else
    {
        for( LAD320Person person : persons)
        person.HienThiTT();
    }
    
  }

    
}