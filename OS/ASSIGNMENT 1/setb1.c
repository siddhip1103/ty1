#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
#include<sys/wait.h>

void bubble_sort ( );
void Insertion_sort( );

int n,a[10];

int main ()
{
    int i;
    
    printf("\nEnter size of array : ");
    scanf("%d",&n);
    
    printf("Enter array elements : ");
    for (i=0;i<n;i++)
        scanf("%d",&a[i]);
        
    printf("Array elements :");
    for (i=0;i<n;i++)
        printf("%d\t",a[i]);
        
    printf("\n");
    
    pid_t pid;
    pid=fork();
    
    if (pid==0)
    {
        printf("\nI am child process... ");
        printf("\nMy id : %d ",getpid());
        Insertion_sort();
        printf("\nSorted array elements : ");
        for (i=0;i<n;i++)
        printf("%d\t",a[i]);
        
        printf("\n");
    
       
    }
        
    else 
        if (pid>0)
        {
           int wstatus;
           int w1=wait(&wstatus);
           printf("\nChild Process Terminated Successfully..............     :     %d    \n",WIFEXITED(wstatus));
           wait(NULL);
           printf("\nI am parent process... ");
           printf("\nMy id : %d ",getpid());
           bubble_sort();
           printf("\nSorted array elements : ");
           for (i=0;i<n;i++)
           printf("%d\t",a[i]);
           
           printf("\n");
        }
            
    else
        printf("\n Unsuccessful Process Creation..Error.....");
        
}

void bubble_sort()
{
     int i,j,temp;
     
     for (i=0;i<n;i++)
          for (j=0;j<n-1-i;j++){
              if (a[j] > a[j+1]){
                 temp=a[j];
                 a[j]=a[j+1];
                 a[j+1]=temp;
              }
           }
          
}

void Insertion_sort ( )
{
     int i,j,temp;
     
     for (i=1;i<n;++i){
          temp=a[i];
          j=i-1;
          for (j>=0;a[j]>temp;j--){
               a[j+1]=a[j];
               
          }
          a[j+1]=temp;
    }
    
}


