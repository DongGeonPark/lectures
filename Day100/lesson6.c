#include <stdio.h>

int main() {
	/*���� 1��
	printf("1~10��� ¦���� ����մϴ�.\n");
	for (int i = 1; i <= 10; i++) {
		if (i % 2 == 0) {
			printf("%d\n", i);
		}
	}
	*/


	/*���� 2��
	int score=0,sum=0;
	printf("���� ������ �Է��ϼ���.(0�̸� ����)\n");
	while (1) {
		scanf_s("%d", &score);
		sum += score;
		if (score == 0) {
			break;
		}
	}
	printf("���� ������ �հ�� %d�Դϴ�", sum);
	*/

	/*���� 3��
	for (int i = 1; i <= 9; i++) {
		for (int j = 1; j <= 9; j++) {
			printf("%d\t", i*j);
		}
		printf("\n");
	}
	*/

	/*���� 4��
	for (int i = 0; i < 5; i++) {
		printf("*");
		for (int j = 0; j < i; j++) {
			printf("*");
		}
		printf("\n");
	}
	*/

	/*���� 5��
	int num,boo = 0;

	printf("2 �̻��� ������ �Է��ϼ���.\n");
	scanf_s("%d", &num);
	for (int i = 1; i <= num; i++) {
		if (num % i == 0) {
			boo++;
		}
	}
	if (boo == 2) {
		printf("%d�� �Ҽ��Դϴ�.\n",num);
	}
	else {
		printf("%d�� �Ҽ��� �ƴմϴ�.\n", num);
	}
	*/


	return 0;
}