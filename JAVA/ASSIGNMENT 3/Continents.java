import java.util.*;
import java.io.*;

class Continent
{
  String Cname;
  Continent(String Cname)
  {
     this.Cname=Cname;
  }
     void displayContinent()
     {
       System.out.println("\nContinent :"+Cname);
     }
}     
class Country extends Continent
{
  String CountryName;
  Country(String Cname,String CountryName) 
  {
    super(Cname);
    this.CountryName=CountryName;
  }

     void displayCountry()
     {
      displayContinent();
      System.out.println("\nCountry:" +CountryName);
     }
}
class State extends Country
{
 String sname,place;
 State(String Cname,String countryName,String sname,String place)
 {
   super(Cname,countryName);
   this.sname=sname;
   this.place=place;
 }
    void displayState()
    {
     displayCountry();
     System.out.println("\nState : "+sname);
     System.out.println("\nPlace :"+place);
    }
}
class Continents
{
  public static void main(String args[])
  {
     State loc =new State("Asia","Bharat","Maharastra","Nashik");
     loc.displayState();
  }      
  }
  
