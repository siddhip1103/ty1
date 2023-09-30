#include<stdio.h>
#include<stdlib.h>

struct process
{
     int wt,at,bt,tat,pt,id;
};
struct process a[10];

int main()
{
    int n,i,temp[10]={0},count=0,shortp;
    int totalwt,totaltat;
    printf("Enter number of processes: ");
    scanf("%d",&n);
    for (i=0;i<n;i++)
    {
        a[i].id=i+1;
        printf("\nEnter BT, AT, for Process %d: ",i+1);
        scanf("%d%d",&a[i].bt,a[i].at);
        a[i].pt=a[i].bt;
    }    
    for (int t=0;count!=n;t++)
    {
        shortp=9;
        for (i=0;i<n;i++)
            if (a[i].pt>a[i].pt && a[i].at<=t && a[i].bt>0)
               shortp=i;
        a[shortp].bt-=1;
        if (a[shortp].bt==0)
        {
           count++;
           a[shortp].tat=t+1-a[shortp].at;
           a[shortp].wt=t+1-a[shortp].tat-a[shortp].pt;
           totalwt+=a[shortp].wt;
           totaltat+=a[shortp].tat;
        }
    }
    printf("\nGANTT Chart:\n");
    for (i=0;i<n;i++)
        printf("| P%d ",a[i].id);
    printf("\n");
    printf("\n------------------------------------------------\n");
    printf(" Process%d| ArrivalTime| BurstTime| TurnaroundTime| WaitingTime\n");    
    for (i=0;i<n;i++)
        printf("P%d\t\t|%4d\t\t|%4d\t\t|%4d\t\t|%4d\n",i+1,a[i].at,a[i].bt,a[i].tat,a[i].wt);
    printf("Average Waiting Time: %.2f\n",(float)totalwt/n);
    printf("Average Turnaround Time Time: %.2f\n",(float)totaltat/n);  
    return 0;  
}
