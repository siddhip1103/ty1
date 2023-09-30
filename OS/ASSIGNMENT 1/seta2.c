#include<stdio.h>
main()
{
  int pid,retnice;
  printf("press DEL to stop process\n");
  pid=fork();
  for(;;)
    {
      if(pid==0)
       {
         retnice=nice(-5);
         printf("child gets higher CPU priporty %d \n",retnice);
         exit(1);
         }
           else
           {
             retnice=nice(4);
             printf("Parent gets lower CPU priority %d\n",retnice);
             exit(1);
             }
             }
             }
