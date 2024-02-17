import java.util.*;



public class seta1

    {
      public static void main(String args[])
        {
          Scanner sc=new Scanner(System.in);
          ArrayList<String> a=new ArrayList<>();
          System.out.println("\n enter no of cities:");
          int n=sc.nextInt();
          System.out.println("Enter "+n" element:");
          for(int i=0;i<n;i++)
               a.add(sc.next());
               
               
               
               System.out.println("\nList element:"+a);
               
               Iterator<String> itr=a.iterator();
               while(itr.hasNext())
                  {
                     itr.next();
                     itr.remove();
                     
                  }
                  System.out.println("\n after removing elements the array list is empty:"+a);
                  sc.close();  
                  }
                  }
