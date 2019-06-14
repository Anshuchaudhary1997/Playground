#include<stdio.h>
int main()
{
 int year,num;
  scanf("%d",&year);
  num=year%4;
  if(num==0)
    printf("Leap year");
    else
      printf( "Not Leap year");
  return 0;
}