#include<stdio.h>
int main()
{
 int second,num,rem;
  scanf("%d",&num);
rem=num%100;
  second=rem/10;
  printf("%d",second);
  return 0;
}