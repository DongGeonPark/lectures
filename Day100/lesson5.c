#include <stdio.h>

int main() {

	/*���� 1
	int num;
	
	printf("������ �Է��ϼ���.");
	scanf_s("%d", &num);
	
	if (num % 2 == 0)
		printf("%d�� ¦���Դϴ�\n", num);
	else
		printf("%d�� Ȧ���Դϴ�.\n", num);

		*/

	/*���� 2
	int num1, num2;

	printf("�ΰ��� ������ �Է��ϼ���\n");
	scanf_s("%d", &num1);
	scanf_s("%d", &num2);
	if (num1 > num2)
		printf("%d�� %d���� �� ũ��.\n", num1, num2);
	else if (num1 == num2)
		printf("���� ���̴�\n");
	else
		printf("%d�� %d���� �� ũ��.\n", num2, num1);
		*/

	/*���� 3
	int num3;

	printf("0���� 10������ ������ �Է��ϼ���\n");
	scanf_s("%d", &num3);
	if (0< num3 && num3 <10)
		printf("�����Դϴ�\n");
	else
		printf("�����Դϴ�.\n");
	*/
	
	/*���� 4
	char ch;
	printf("���ĺ��� �Է��ϼ���\n");
	ch = getchar();
	switch (ch) 
	{
		case 'A':
		case 'B':
		case 'C':
			printf("�����Դϴ�.\n");
			break;
		default:
			printf("�����Դϴ�\n");

	}
	*/
	/*���� 5*/
	int score;
	printf("������ �Է��ϼ���\n");
	scanf_s("%d", &score);

	switch (score) {
	case 1:
		printf("������ 1�Դϴ�\n����� �ʿ��մϴ�.\n");
		break;
	case 2:
		printf("������ 2�Դϴ�\n���� �� ����ϼ���.\n");
		break;
	case 3:
		printf("������ 3�Դϴ�\n���߽��ϴ�.");
		break;
	default:
		printf("��������\n");

	}

	return 0;
}