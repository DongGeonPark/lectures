#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int length(char* str);
int search(char* str);
int compare(char* str1, char* str2);

int main() {
	char str[100],str1[100],str2[100];
	char (*pS)(char str[]);

	//문제 1번
	pS = length;
	printf("문자열을 입력하세요\n");
	scanf_s("%s", str, sizeof(str));
	printf("문자열의 길이는 %d입니다\n\n", (*pS)(str));

	//문제 2번
	pS = search;
	printf("문자열을 입력하세요\n");
	scanf_s("%s", str, sizeof(str));
	printf("%s 안에 a는 %d개가 있습니다.\n\n", str, (*pS)(str));

	//문제 3번
	pS = compare;
	printf("1번째 문자열을 입력하세요\n");
	scanf_s("%s", str1,sizeof(str1));
	printf("2번째 문자열을 입력하세요\n");
	scanf_s("%s",str2,sizeof(str2));
	if ((*pS)(str1, str2) == 1)
		printf("2개의 문자열은 같습니다.\n");
	else
		printf("2개의 문자열은 다릅니다.");

	//문제 4번

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
