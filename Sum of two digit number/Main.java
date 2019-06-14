#include<stdio.h>
int main()
{
int num,first,second,sum;
  scanf("%d",&num);
  first=num/10;
  second=num%10;
  sum=first+second;
  printf("%d",sum);
  return 0;
}