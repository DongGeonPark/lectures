#include <stdio.h>

int main() {
	/*문제 1*/
	printf("%d\n",0-4);
	printf("%0.1f\n", 3.14 * 2);
	printf("%f\n", (float)5 / 3);
	printf("%d\n", 30 % 7);
	printf("%f\n", (float)(7 + 32) / 5);

	/*문제 2*/
	int sq;
	printf("정사각형의 변의 길이를 입력하세요\n");
	scanf_s("%d", &sq);
	printf("넓이는 %d입니다\n", sq*sq);

	/*문제 3*/
	float t1, t2;

	printf("삼각형의 높이를 입력하세요.\n");
	scanf_s("%f", &t1);
	printf("삼각형의 밑변을 입력하세요\n");
	scanf_s("%f", &t2);
	printf("삼각형의 넓이는 %lf\n", (float)t1 * t2 / 2);

	/*문제 4*/
	int m;

	printf("정수를 입력하세요\n");
	scanf_s("%d", &m);
	printf("부호를 반전하면 %d\n", m * (-1));

	/*문제 5*/
	int a, b, c, d, e;

	printf("과목1의 점수를 입력하세요\n");
	scanf_s("%d", &a);
	printf("과목2의 점수를 입력하세요\n");
	scanf_s("%d", &b);
	printf("과목3의 점수를 입력하세요\n");
	scanf_s("%d", &c);
	printf("과목4의 점수를 입력하세요\n");
	scanf_s("%d", &d);
	printf("과목5의 점수를 입력하세요\n");
	scanf_s("%d", &e);

	printf("5과목의 합계는 %d입니다\n", a + b + c + d + e);
	printf("5과목의 평균은 %f입니다.\n", (float)(a + b + c + d + e)/5);
	return 0;
}