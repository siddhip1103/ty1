#include<stdio.h>
#include<stdlib.h>
int main()
{
 int RQ[100],i,n,TotalHeadMoment=0,inital,count=0;
 printf("Enter the number of Requests\n");
 scanf("%d",&n);
 printf("Enter the Requests Sequence\n");
 for(i=0;i<n;i++)
 scanf("%d",&RQ[i]);
 printf("Enter initial head position\n");
 scanf("%d",&inital);
 /*loop will execute until all process is completed*/
 while(count!=n)
 {
    int min=1000,d,index;
    for(i=0;i<n;i++)
    {
      d=abs(RQ[i]-inital);
      if(min>d)
       {
         min=d;
         index=i;
      }
   }
        TotalHeadMoment=TotalHeadMoment+min;
        inital=RQ[index];
        RQ[index]=1000;
        count++;
 }
  
  printf("TotalHeadMoment is %d",TotalHeadMoment);
return 0;
}
