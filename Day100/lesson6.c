#include <stdio.h>

int main() {
	/*문제 1번
	printf("1~10가운데 짝수를 출력합니다.\n");
	for (int i = 1; i <= 10; i++) {
		if (i % 2 == 0) {
			printf("%d\n", i);
		}
	}
	*/


	/*문제 2번
	int score=0,sum=0;
	printf("시험 점수를 입력하세요.(0이면 종료)\n");
	while (1) {
		scanf_s("%d", &score);
		sum += score;
		if (score == 0) {
			break;
		}
	}
	printf("시험 점수의 합계는 %d입니다", sum);
	*/

	/*문제 3번
	for (int i = 1; i <= 9; i++) {
		for (int j = 1; j <= 9; j++) {
			printf("%d\t", i*j);
		}
		printf("\n");
	}
	*/

	/*문제 4번
	for (int i = 0; i < 5; i++) {
		printf("*");
		for (int j = 0; j < i; j++) {
			printf("*");
		}
		printf("\n");
	}
	*/

	/*문제 5번
	int num,boo = 0;

	printf("2 이상의 정수를 입력하세요.\n");
	scanf_s("%d", &num);
	for (int i = 1; i <= num; i++) {
		if (num % i == 0) {
			boo++;
		}
	}
	if (boo == 2) {
		printf("%d는 소수입니다.\n",num);
	}
	else {
		printf("%d는 소수가 아닙니다.\n", num);
	}
	*/


	return 0;
}