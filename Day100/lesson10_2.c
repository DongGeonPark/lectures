#include <stdio.h>
#include <string.h>

int MAX(int x, int y);

void main() {
	//����
	char str2[3][20] = { "hi","bye","die" };
	char* str1[3] = { "hi","bye","die" };
	char str3[100];
	char str4[100];
	char str5[100];
	char* str6;
	int num,num1=5,num2=4;
	int (*pM)(int x, int y);

	pM = MAX;

	//���ڿ� ������ vs �迭
	for (int i = 0; i < 3; i++) {
		printf("%s\n", str1[i]);
		printf("%s\n", str2[i]);
	}

	//���ڿ� ����
	printf("���ڿ��� �Է��ϼ���\n");
	scanf_s("%s", str3, sizeof(str3));
	printf("���ڿ��� ���̴� %d\n\n", strlen(str3));

	//���ڿ� ����
	strcpy_s(str4,16, str3);
	printf("%s\n\n", str4);

	//���ڿ� ����
	strcpy_s(str5,16, str4);
	strcat_s(str5,100, str3);
	printf("%s\n\n", str5);

	//���ڿ� ��
	if (strcmp(str3, str4) == 0) {
		printf("�����ϴ�\n\n");
	}
	else {
		printf("Ʋ���ϴ�\n\n");
	}

	//���� �޸� Ȯ��
	printf("�� ������ a�� �غ��ұ��?\n");
	scanf_s("%d", &num);

	str6 = (char*)malloc(sizeof(char) * (num+1));
	if (!str6) {
		printf("�޸𸮸� Ȯ���� �� �����ϴ�.\n");
		return 1;
	}
	for (int i = 0; i < num; i++) {
		*(str6 + i) = 'a';
	}
	*(str6 + num) = '\0';
	printf("%s\n", str6);
	free(str6);
	printf("%d", (*pM)(num1, num2));
}

int MAX(int x, int y) {
	if (x > y)
		return x;
	else
		return y;
}