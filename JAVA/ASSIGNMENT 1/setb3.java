
import java.io.*;
import java.util.*;

class Mat_ope
{
      public static void main(String[] args)
      {
             int m,n,p,q,i,j,k,op=1;
             Scanner sc = new Scanner(System.in);
             
             //int r,h,fact=1,op=1,num;
             //float PI = 3.14f;
             System.out.print("\n Enter number of rows for 1 matrix :");
             m=sc.nextInt();
             System.out.print("\n Enter number of cols for 1 matrix :");
             n=sc.nextInt();
             int[][] a = new int[m][n];
             
             //accept
             System.out.println(" \nEnter 1 matrix :");
             for ( i=0;i<m;i++)
                 for ( j=0;j<n;j++)
                      a[i][j] = sc.nextInt();
                      
             //display
             System.out.println("\n1 matrix is :");
             for ( i=0;i<m;i++){
                 for ( j=0;j<n;j++){
                      System.out.print("  "+a[i][j]+"  ");
                 }
                 System.out.println("  ");
             }
                      
             System.out.print("\n Enter number of rows for 2 matrix :");
             p=sc.nextInt();
             System.out.print("\n Enter number of cols for 2 matrix :");
             q=sc.nextInt();
             int[][] b = new int[p][q];
             int[][] c = new int[p][q];
             
             //accept
             System.out.println(" \nEnter 2 matrix :");
             for ( i=0;i<p;i++)
                 for ( j=0;j<q;j++)
                      b[i][j] = sc.nextInt();
                      
             //display
             System.out.println(" \n2 matrix is :");
              for ( i=0;i<p;i++){
                 for ( j=0;j<q;j++){
                      System.out.print("   "+b[i][j]+"  ");
                 }
                 System.out.println("  ");
             }
                      
              System.out.println("-------------------------------------------------------------------------  ");         
             
             while (op >= 1 && op <= 4)
             {
                   System.out.println("\n 1:addition...");
                   System.out.println(" 2:Multiplication...");
                   System.out.println(" 3:Transpose ...");
                   System.out.println(" 4:Exit...");
                   System.out.print("\n Enter Option : ");
                   op=sc.nextInt();
                   
                   switch (op)
                   {
                           case 1 : 
                                  System.out.println("-------------------------------------------------------------------------  "); 
                                  if ( m== p && n==q )
                                  {
                                     System.out.println("\n Addition is : ");
                                     for ( i=0;i<m;i++){
                                         for ( j=0;j<n;j++){
                                             c[i][j] = a[i][j] + b[i][j];
                                              System.out.print("   "+c[i][j]+"  ");
                                          }
                                          System.out.println("  ");
                                      }
                                  }
                                  else
                                      System.out.println("\n Addition is not possible : ");
                                  System.out.print("  ");
                                  System.out.println("-------------------------------------------------------------------------  ");  
                                  break;
                                    
                                  
                           case 2 :
                                   System.out.println("-------------------------------------------------------------------------  "); 
                                   if ( n==p )
                                   {
                                     System.out.println("\n Multiplication is : ");
                                     for ( i=0;i<m;i++){
                                         for ( j=0;j<q;j++){
                                               for ( k=0;k<n;k++){
                                                    c[i][j]=0;
                                                    c[i][j] += a[i][j] * b[i][j];
                                               }
                                               System.out.print("   "+c[i][j]+"  ");
                                          }
                                          
                                         System.out.println("  ");
                                      }
                                    }
                                    else
                                        System.out.println("\n Multiplication is not possible : ");
                                    System.out.print("  "); 
                                   System.out.println("-------------------------------------------------------------------------  ");  
                                    break;
                           case 3 : 
                                     System.out.println("-------------------------------------------------------------------------  "); 
                                     System.out.println("\n Treanspose  is : ");
                                     for ( i=0;i<m;i++){
                                         for ( j=0;j<n;j++){
                                             
                                              System.out.print("   "+a[j][i]+"  ");
                                          }
                                          System.out.println("  ");
                                      }
                                     System.out.println("-------------------------------------------------------------------------  "); 
                                     break;
                           case 4 :
                                   System.exit(0);
                                   break;
                           default :
                                     System.out.print("\n Enter Valid Option....... : ");
                                     break; 
                                  
                                  
                   }
             
             }
      }
}
