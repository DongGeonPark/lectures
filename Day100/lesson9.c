#include <stdio.h>

void add(int* pA, int* pB);

int main() {
	int a, b, c;

	printf("두 과목의 점수를 입력하세요.\n");
	scanf_s("%d", &a);
	scanf_s("%d", &b);
	printf("더할 점수를 입력하세요.\n");
	scanf_s("%d", &c);
	add(&a, &b);
	printf("%d,%d", a, b);
	return 0;
}

void add(int* pA, int* pB) {
	*pA += 12;
	*pB += 12;
}