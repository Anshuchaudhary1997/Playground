#include<stdio.h>
int main()
{
  int num1,num2,num3,sum,avg;
  scanf("%d %d %d",&num1,&num2,&num3);
  sum=num1+num2+num3;
  avg=sum/3;
  printf("%d",avg);
  return 0;
}