#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int length(char* str);
int search(char* str);
int compare(char* str1, char* str2);

int main() {
	char str[100],str1[100],str2[100];
	char (*pS)(char str[]);

	//���� 1��
	pS = length;
	printf("���ڿ��� �Է��ϼ���\n");
	scanf_s("%s", str, sizeof(str));
	printf("���ڿ��� ���̴� %d�Դϴ�\n\n", (*pS)(str));

	//���� 2��
	pS = search;
	printf("���ڿ��� �Է��ϼ���\n");
	scanf_s("%s", str, sizeof(str));
	printf("%s �ȿ� a�� %d���� �ֽ��ϴ�.\n\n", str, (*pS)(str));

	//���� 3��
	pS = compare;
	printf("1��° ���ڿ��� �Է��ϼ���\n");
	scanf_s("%s", str1,sizeof(str1));
	printf("2��° ���ڿ��� �Է��ϼ���\n");
	scanf_s("%s",str2,sizeof(str2));
	if ((*pS)(str1, str2) == 1)
		printf("2���� ���ڿ��� �����ϴ�.\n");
	else
		printf("2���� ���ڿ��� �ٸ��ϴ�.");

	//���� 4��

}
int length(char* str) {
	return strlen(str);
}

int search(char* str) {
	int count = 0;

	for (int i = 0; i < strlen(str); i++) {
		if (*(str + i) == 'a')
			count++;
	}
	return count;
}

int compare(char* str1, char* str2)
{
	if (strcmp(str1, str2) == 0) {
		return 1;
	}
	else
		return -1;
}
