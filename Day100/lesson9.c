#include <stdio.h>

void add(int* pA, int* pB);

int main() {
	int a, b, c;

	printf("�� ������ ������ �Է��ϼ���.\n");
	scanf_s("%d", &a);
	scanf_s("%d", &b);
	printf("���� ������ �Է��ϼ���.\n");
	scanf_s("%d", &c);
	add(&a, &b);
	printf("%d,%d", a, b);
	return 0;
}

void add(int* pA, int* pB) {
	*pA += 12;
	*pB += 12;
}