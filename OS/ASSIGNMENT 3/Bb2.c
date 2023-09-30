//Non-preemptive priority scheduling
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#define MAX 10
typedef struct
{
       int id,at,bt,tat,pr,wt;
}process;
int n,temp=0,i,j;
void randomburst(process p[],int n)
{
     srand(time(NULL));
     for (int i=0;i<n;i++)
         p[i].bt=rand()%10+1;
}

void calculateWT(process p[],int n)
{
     p[0].wt=0;
     for (int i=1;i<n;i++)
     {   p[i].wt=p[i-1].wt+p[i-1].bt;
         
     }    
}
int main()
{
    
    process p[MAX];
    printf("Enter number of processes: ");
    scanf("%d",&n);
    for (i=0;i<n;i++)
    {
        p[i].id=i+1;
        printf("\nEnter AT, BT & Priority for Process %d: ",i+1);
        scanf("%d%d%d",&p[i].at,&p[i].bt,&p[i].pr);
    }
    randomburst(p,n);
    for (i=0;i<n-1;i++)
        for (j=0;j<n-i-1;j++)
            if (p[j].pr > p[j+1].pr)
            {
                temp=p[j].bt;
                p[j].bt=p[j+1].bt;
                p[j+1].bt=temp;
            }
    calculateWT(p,n);
    for (i=0;i<n;i++)
    p[i].tat=p[i].bt+p[i].wt;
    printf("\nGANTT Chart:\n");
    for (i=0;i<n;i++)
        printf("| P%d ",p[i].id);
    printf("\n------------------------------------------------\n");
    printf(" Process| ArrivalTime| BurstTime| Priority| TurnaroundTime| WaitingTime\n");    
    for (i=0;i<n;i++)
        printf("P%d\t| %4d\t\t| %4d\t|  %4d\t|  %4d\t\t|  %4d\n",p[i].id,p[i].at,p[i].bt,p[i].pr,p[i].tat,p[i].wt);
    int totalwt=0,totaltat=0;
    for (i=0;i<n;i++)
    {
         p[i].tat=p[i].wt+p[i].bt;
         totalwt+=p[i].wt;
         totaltat+=p[i].tat;
    }     
    printf("Average Waiting Time: %.2f\n",(float)totalwt/n);
    printf("Average Turnaround Time Time: %.2f\n",(float)totaltat/n);   
    return 0;          
}
