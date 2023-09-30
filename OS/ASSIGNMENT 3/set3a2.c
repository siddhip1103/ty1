#include<stdio.h>
#include<stdlib.h>
#include<string.h>
void main()
{ 
  int i,n;
  float avwt=0,avtat=0;
  printf("\n Enter no. of process : ");
  scanf("%d",&n);
  int at[n],bt[n],wt[n],tat[n];
  printf("\n Enter arrival time : ");
  for (i=0;i<n;i++)
       scanf("%d",&at[i]);
  for (i=0;i<n;i++) 
    {
      bt[i]=rand()%10;
    }
       
        int start[n];
        start[0]=0;
        for (i=1;i<n;i++)
         { 
          start[i]=start[i-1]+bt[i-1];
         }
        for(i=0;i<n;i++)
        {
          wt[i]=start[i]=at[i];
          avwt+=wt[i];
        }   
          avwt/=n;
          for(i=0;i<n;i++) 
          {
            tat[i]=wt[i]+bt[i];
            avtat+=tat[i];
          }
          avtat/=n;
          printf("pro\tat\tbt\twt\ttat\t:");
          for(i=0;i<n;i++)
   
             printf("\n%d\t%d\t%d\t%d\t%d\t",i+1,at[i],bt[i],wt[i],tat[i]);
          }
          avwt/=n;
          avtat\=n;
      printf("\n average wating time is:%f",avwt);
      printf("\n average turnaround time is:%f",avtat);
}

