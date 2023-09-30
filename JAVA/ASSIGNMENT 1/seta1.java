public class seta
{
int num;
public seta()
{
num=0;
}
public seta(int num)
{
this.num=num;
}
public static void main(String[] args)
{
seta m1=new seta();
if(args.length>0)
{
int n=Integer.parseInt(args[0]);
seta m2=new seta(n);
System.out.println(m1.num);
System.out.println(m2.num);
}
else
System.out.println("Insufficient arguments");
}
}

