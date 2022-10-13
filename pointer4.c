#include<stdio.h>
void main()
{
int a,b,c,*p1,*p2,*p3;
a=3,b=5,c=7;
p1=&a;
p2=&b;
p3=&c;
if((*p1>*p2)&&(*p1>*p3))
printf("%u is greatest",*p1);
else if ((*p2>*p1)&&(*p2>*p3))
printf("%u is greatest",*p2);
else
printf("%u is greatest",*p3);
}
