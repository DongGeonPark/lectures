#include <stdio.h>
#include "example5.h"

#define MAX(x,y) (x>y ? x:y)

int main() {
	
	/*���� 1��
	int num[2];

	for (int i = 0; i < 2; i++) {
		printf("%d��° ������ �Է��ϼ���.\n",i+1);
		scanf_s("%d", &num[i]);
	}
	printf("�ּڰ��� %d�Դϴ�.", min(num[0], num[1]));
	*/

	/*���� 2��
	int num;
	printf("������ �Է��ϼ���\n");
	scanf_s("%d", &num);
	printf("%d�� ������ %d\n", num, square(num));
	*/
	/*���� 3��
	int num[2];

	for (int i = 0; i < 2; i++) {
		printf("%d��° ������ �Է��ϼ���(1~5)\n", i + 1);
		scanf_s("%d", &num[i]);
	}
	printf("%d�� %d������ %d�Դϴ�\n", num[0], num[1], power(num[0], num[1]));
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
