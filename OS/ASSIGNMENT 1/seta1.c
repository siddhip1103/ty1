#include<stdio.h>
#include<sys/types.h>
void ChildProcess(int);
void ParentProcess(int);
int main()
{
pid_t pid;
pid=fork();
if(pid==0)
ChildProcess(pid);
else
  if(pid>0)
  ParentProcess(pid);
    else
      printf("\n unsuccessful");
}
  void ChildProcess(int pid)
  {
    printf("I am a child process\n");
    printf("\n my id:%d\n",getpid());
    printf("my parent id%d\n",getpid());
    }
     void ParentProcess(int pid)
     { 
      printf("I am parent process\n");
      printf("my id;%d\n",getpid());
      printf("my child id:%d\n,pid");
      }      
