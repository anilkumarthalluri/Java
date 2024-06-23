import java.util.*;
class person{
   private int age;
   private String name;
   private String country;
   void setName(String name){
       this.name=name;
    }
   void setAge(int age){
      this.age=age;
   }
   void setCountry(String country){
     this.country=country;
   }
  public String getName(){
     return name;
   }
  public int getAge(){
      return age;
   } 
  public String getCountry(){
     return country;
   }
}
public class encaps_person{
      public static void main(String[] args){
        person p=new person();
        Scanner sc=new Scanner(System.in);
        int age;
        String name, country;
        System.out.print("Enter your name:");
	name=sc.nextLine();
	 p.setName(name);
	System.out.print("Enter your Age:");
	age=sc.nextInt();
	  p.setAge(age);
     sc.nextLine();
	System.out.print("Enter your Country:");
	country=sc.nextLine();
          p.setCountry(country);
	System.out.println();
        System.out.println("Name:"+p.getName());
        System.out.println("Age:"+p.getAge());
        System.out.println("Country:"+p.getCountry());
        sc.close();
     }     
  }