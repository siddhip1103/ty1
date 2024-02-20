#include<stdio.h>
#include<stdlib.h>
int main()
{
 int RQ[100],i,n,TotalHeadMoment=0,inital;
 printf("Enter the number of Requests\n");
 scanf("%d",&n);
 printf("Enter the Requests Sequence\n");
 for(i=0;i<n;i++)
 scanf("%d",&RQ[i]);
 printf("Enter initial head position\n");
 scanf("%d",&inital);
 
 for(i=0;i<n;i++)
 {
     TotalHeadMoment=TotalHeadMoment+abs(RQ[i]-inital);
     inital=RQ[i];
 }

printf("TotalHeadMoment is %d",TotalHeadMoment);
return 0;
}
