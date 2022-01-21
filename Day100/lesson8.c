#include <stdio.h>
#include "example5.h"

#define MAX(x,y) (x>y ? x:y)

int main() {
	
	/*문제 1번
	int num[2];

	for (int i = 0; i < 2; i++) {
		printf("%d번째 정수를 입력하세요.\n",i+1);
		scanf_s("%d", &num[i]);
	}
	printf("최솟값은 %d입니다.", min(num[0], num[1]));
	*/

	/*문제 2번
	int num;
	printf("정수를 입력하세요\n");
	scanf_s("%d", &num);
	printf("%d의 제곱은 %d\n", num, square(num));
	*/
	/*문제 3번
	int num[2];

	for (int i = 0; i < 2; i++) {
		printf("%d번째 정수를 입력하세요(1~5)\n", i + 1);
		scanf_s("%d", &num[i]);
	}
	printf("%d의 %d제곱은 %d입니다\n", num[0], num[1], power(num[0], num[1]));
	*/

	return 0;
}
int min(int x, int y) {
	if (x > y)
		return y;
	else
		return x;
}
int square(int x) {
	return x * x;
}


int power(int x, int y) {
	int result=x;

	for (int i = 0; i < y-1; i++) {
		result *= x;
	}
	return result;
}
