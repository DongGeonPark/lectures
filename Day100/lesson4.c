#include <stdio.h>

int main() {
	/*���� 1*/
	printf("%d\n",0-4);
	printf("%0.1f\n", 3.14 * 2);
	printf("%f\n", (float)5 / 3);
	printf("%d\n", 30 % 7);
	printf("%f\n", (float)(7 + 32) / 5);

	/*���� 2*/
	int sq;
	printf("���簢���� ���� ���̸� �Է��ϼ���\n");
	scanf_s("%d", &sq);
	printf("���̴� %d�Դϴ�\n", sq*sq);

	/*���� 3*/
	float t1, t2;

	printf("�ﰢ���� ���̸� �Է��ϼ���.\n");
	scanf_s("%f", &t1);
	printf("�ﰢ���� �غ��� �Է��ϼ���\n");
	scanf_s("%f", &t2);
	printf("�ﰢ���� ���̴� %lf\n", (float)t1 * t2 / 2);

	/*���� 4*/
	int m;

	printf("������ �Է��ϼ���\n");
	scanf_s("%d", &m);
	printf("��ȣ�� �����ϸ� %d\n", m * (-1));

	/*���� 5*/
	int a, b, c, d, e;

	printf("����1�� ������ �Է��ϼ���\n");
	scanf_s("%d", &a);
	printf("����2�� ������ �Է��ϼ���\n");
	scanf_s("%d", &b);
	printf("����3�� ������ �Է��ϼ���\n");
	scanf_s("%d", &c);
	printf("����4�� ������ �Է��ϼ���\n");
	scanf_s("%d", &d);
	printf("����5�� ������ �Է��ϼ���\n");
	scanf_s("%d", &e);

	printf("5������ �հ�� %d�Դϴ�\n", a + b + c + d + e);
	printf("5������ ����� %f�Դϴ�.\n", (float)(a + b + c + d + e)/5);
	return 0;
}