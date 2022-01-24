#include <stdio.h>
#include <string.h>

int MAX(int x, int y);

void main() {
	//변수
	char str2[3][20] = { "hi","bye","die" };
	char* str1[3] = { "hi","bye","die" };
	char str3[100];
	char str4[100];
	char str5[100];
	char* str6;
	int num,num1=5,num2=4;
	int (*pM)(int x, int y);

	pM = MAX;

	//문자열 포인터 vs 배열
	for (int i = 0; i < 3; i++) {
		printf("%s\n", str1[i]);
		printf("%s\n", str2[i]);
	}

	//문자열 길이
	printf("문자열을 입력하세요\n");
	scanf_s("%s", str3, sizeof(str3));
	printf("문자열의 길이는 %d\n\n", strlen(str3));

	//문자열 복사
	strcpy_s(str4,16, str3);
	printf("%s\n\n", str4);

	//문자열 연결
	strcpy_s(str5,16, str4);
	strcat_s(str5,100, str3);
	printf("%s\n\n", str5);

	//문자열 비교
	if (strcmp(str3, str4) == 0) {
		printf("같습니다\n\n");
	}
	else {
		printf("틀립니다\n\n");
	}

	//동적 메모리 확보
	printf("몇 문자의 a를 준비할까요?\n");
	scanf_s("%d", &num);

	str6 = (char*)malloc(sizeof(char) * (num+1));
	if (!str6) {
		printf("메모리를 확보할 수 없습니다.\n");
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