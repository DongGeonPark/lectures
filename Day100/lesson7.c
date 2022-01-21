#include <stdio.h>

int main() {
	/*문제 1번
	int test[5],max=0;
	printf("시험 점수를 입력하세요\n");
	for (int i = 0; i < 5; i++) {
		scanf_s("%d", &test[i]);
	}
	for (int i = 0; i < 5; i++) {
		printf("%d번째 사람의 시험 점수는 %d 입니다.\n", i + 1, test[i]);
		if (max < test[i])
			max = test[i];
	}
	printf("최고 점수는 %d점입니다\n", max);
	*/

	/*문제 2번
	int test[5], count = 0;
	printf("시험 점수를 입력하세요\n");
	for (int i = 0; i < 5; i++) {
		scanf_s("%d", &test[i]);
	}
	for (int i = 0; i < 5; i++) {
		printf("%d번째 사람의 시험 점수는 %d 입니다.\n", i + 1, test[i]);
		if (test[i] > 70)
			count++;
	}
	printf("70점 이상인 학생은 %d명입니다,\n", count);
	*/

	/*문제 3번
	char s1[10];    // 크기가 10인 char형 배열을 선언
	int count=0;

	printf("문자열을 입력하세요: ");
	scanf_s("%s", s1,sizeof(s1));     // 표준 입력을 받아서 배열 형태의 문자열에 저장

	for (int i = 0; s1[i] != '\0'; i++) {
		count++;
	}
	printf("문자열 크기는 %d입니다.\n", count);  // 문자열의 내용을 출력
	*/

	/*문제 4번
	char str[10];
	int count = 0;

	printf("문자열을 입력하세요\n");
	scanf_s("%s", str, sizeof(str));
	for (int i = 0; str[i] != '\0'; i++) {
		if (str[i] == 'a') {
			count++;
		}
	}
	printf("%s안에 a는 %d개 있습니다.\n", str, count);
	*/

	/*문제 5번
	char str[10];
	
	printf("문자열을 입력하세요.\n");
	scanf_s("%s", str, sizeof(str));

	for (int i = 0; str[i] != '\0'; i++) {
		if (str[i] == 'a') {
			str[i] = 'b';
		}
	}
	printf("%s로 치환했습니다.\n", str);
	*/
	return 0;
}