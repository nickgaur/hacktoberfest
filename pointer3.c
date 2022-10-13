#include<stdio.h>
#include <stdlib.h>
void main()
{
int a,b,c,*p1,*p2;
a=1;
b=5;
p1=&a;
p2=&b;
c=*p1-*p2;
printf("%d",abs(c));
}
