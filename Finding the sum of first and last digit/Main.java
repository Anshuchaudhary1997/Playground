#include <stdio.h>
int main() {
    int num,first, last ,sum=0;
    scanf("%d", &num);
    last = num%10;
    while(num>=10)
    {
        num = num/10;
    }
  sum=last+num;
  printf("%d",sum);
	return 0;
}