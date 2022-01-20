#include <stdio.h>

int main() {

	/*문제 1
	int num;
	
	printf("정수를 입력하세요.");
	scanf_s("%d", &num);
	
	if (num % 2 == 0)
		printf("%d는 짝수입니다\n", num);
	else
		printf("%d는 홀수입니다.\n", num);

		*/

	/*문제 2
	int num1, num2;

	printf("두개의 정수를 입력하세요\n");
	scanf_s("%d", &num1);
	scanf_s("%d", &num2);
	if (num1 > num2)
		printf("%d가 %d보다 더 크다.\n", num1, num2);
	else if (num1 == num2)
		printf("같은 수이다\n");
	else
		printf("%d가 %d보다 더 크다.\n", num2, num1);
		*/

	/*문제 3
	int num3;

	printf("0부터 10까지의 정수를 입력하세요\n");
	scanf_s("%d", &num3);
	if (0< num3 && num3 <10)
		printf("정답입니다\n");
	else
		printf("오답입니다.\n");
	*/
	
	/*문제 4
	char ch;
	printf("알파벳을 입력하세요\n");
	ch = getchar();
	switch (ch) 
	{
		case 'A':
		case 'B':
		case 'C':
			printf("정답입니다.\n");
			break;
		default:
			printf("오답입니다\n");

	}
	*/
	/*문제 5*/
	int score;
	printf("성적을 입력하세요\n");
	scanf_s("%d", &score);

	switch (score) {
	case 1:
		printf("성적은 1입니다\n노력이 필요합니다.\n");
		break;
	case 2:
		printf("성적은 2입니다\n조금 더 노력하세요.\n");
		break;
	case 3:
		printf("성적은 3입니다\n잘했습니다.");
		break;
	default:
		printf("집에가쟈\n");

	}

	return 0;
}