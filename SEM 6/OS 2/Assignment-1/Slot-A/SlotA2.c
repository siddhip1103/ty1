#include<stdio.h>
int main(){
    int k=0,a=0,b=0,inst[5],av[5],al[10][5],n[10][5],m[10][5],pro,p[10],re,cnt=0,i,j,op[10];
    printf("\n Enter total no. of resources :");
    scanf("%d",&re);
    printf("\n Enter the max instances of each resources :");
    for ( i = 0; i < re; i++)
    {
        av[i]=0;
        printf("\n%c:",(i+97));
        scanf("%d",&inst[i]);
    }
    printf("\n Enter total number of process :");
    scanf("%d",&pro);
    
    printf("\n Enter allocation matrix :\n");
    for(i=0;i<re;i++)
        printf("\t%c",(i+97));
    printf("\n");
    for ( i = 0; i < pro; i++)
    {
        p[i]=i;
        printf("p[%d]:",p[i]);
        for ( j = 0; j < re; j++)
        {
            scanf("%d",&al[i][j]);
            av[j]+=al[i][j];
        }
    }
    printf("\nEnter Max Matrix :");
     for(i=0;i<re;i++){
        printf("\t%c",(i+97));
        av[i]=inst[i]-av[i];
     }  
     printf("\n");
    for ( i = 0; i < pro; i++)
    {
        printf("\np[%d]:",i);
        for ( j = 0; j < re; j++)
        {
            scanf("%d",&m[i][j]);
        }
    }
    printf("\n Allocation");
    for(i=0;i<pro;i++)
    {
        printf("\n p%d\t",i);
        for(j=0;j<re;j++)
            printf("%d\t",al[i][j]);
    }
    printf("\n Max Matrix");
    for ( i = 0; i < pro; i++)
    {
        printf("\n p%d\t",i);
        for(j=0;j<re;j++)
            printf("%d\t",m[i][j]);
    }
    
    printf("\n Available :");
    for ( i = 0; i < re; i++)
    {
        if(i==0)
        {
            for(j=0;j<re;j++)
            {
                printf("%d\t",av[j]);
            }
        }
    }
    return 0;
    
}
