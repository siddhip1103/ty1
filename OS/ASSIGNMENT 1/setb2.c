#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
#include<sys/wait.h>

void childProcess(int );
void parentProcess(int );



int main ()
{
    pid_t pid;
    pid=fork();
    
    if (pid==0)
    {
       sleep(10);
       childProcess(pid);
       
    }
    else 
        if (pid>0)
        {
           sleep(3);
           parentProcess(pid);
        }
    else
        printf("\n Unsuccessful Process Creation..Error.....");
        
}

void childProcess(int pid)
{
     printf("\n I am child process... ");
     printf("\n My id : %d \n",getpid());
     printf(" My parent id : %d \n",getppid());
     
}

void parentProcess(int pid)
{
     printf("\n I am parent process... ");
     printf("\n My id : %d \n",getpid());
     printf(" My child id : %d \n",pid);
     
}
