#include<stdio.h>
int sum(a);
void main()
{
int x=5,m;
m=sum(x);

printf("%d",m);
}
int sum(a)
{
    int *p,k;
    p=&a;
*p=*p+3;
k=*p;
return(k);
}
