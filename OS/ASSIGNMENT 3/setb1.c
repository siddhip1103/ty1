#include<stdio.h>
struct Process
{
  int id;
  int arrival_time;
  int cpu_burst;
  int remaining_time;
  int turnaround_time;
  int wating_time;
};
void sjf(struct Process processes[],int n)
{
   int current_time=0;
   int completed=0;
   while(completed<n)
   {
      int shortest_index=-1;
      int shortest_burst=999;
      for( int i=0;i<n;i++)
      {
        if(processes[i].arrival_time<=current_time && !processes[i].remaining_time)
         {
          if(processes[i].cpu_burst<shortest_burst)
           {
             shortest_burst=processes[i].cpu_burst;
             shortest_index=i;
           }
         }
      }
       if (shortest_index==-1)
       {
         current_time++;
         continue;
       }
        processes[shortest_index].remaining_time--;
        if(processes[shortest_index].remaining_time==0)
        {
          completed++;
          processes[shortest_index].turnaround_time=current_time-processes[shortest_index].arrival_time+1;
          processes[shortest_index].arrival_time+1;
          processes [shortest_index].wating_time=processes[shortest_index].turnaround_time-processes[shortest_index].cpu_burst;
        }
          current_time++;
   }
  }
   int main()
   {
    int n;
    printf("enter the number of processes:");
    scanf("%d",&n);
    struct Process processes[n];
    for (int i=0; i<n; i++)
    {
     processes[i].id=i+1;
     printf("enter arrival time for Processes P%d:",i+1);
     scanf("%d",&processes[i].arrival_time);
     printf("enter the cpu burst time for processes P%d:",i+1);
     scanf("%d",&processes[i].cpu_burst);
     processes[i].remaining_time=processes[i].cpu_burst;
     }
      sjf(processes,n);
      printf("\nProcesses\tTurnaround Time\tWating time\n");
      for (int i=0;i<n;i++)
      {
        printf("P%d\t%d\t\t%d\n",processes[i].id,processes[i].id,processes[i].turnaround_time,processes[i].wating_time);
      }
        float total_wating_time=0;
        for(int i=0;i<n;i++)
        {
           total_wating_time+=processes[i].wating_time;
        }
         float average_wating_time=total_wating_time/n;
         printf("\nAverage wating time:%2f\n",average_wating_time);
         return 0;
    }   
