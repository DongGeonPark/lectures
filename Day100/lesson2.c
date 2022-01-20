#include <stdio.h>

int main() {
    /*단순 출력*/
    printf("Hello World\n");
    printf("My naem is DongGeon\n\n");

    /*문자 출력*/
    printf("%c 이것은 문자입니다.\n", 'a');
    printf("%d 이것은 정수입니다.\n", 10);
    printf("%f 이것은 실수입니다.\n", 10.0);

    /*이스케이프*/
    printf("역슬레쉬 표시: %c\n", '\\');
    printf("따옴표 표시 : %c\n", '\'' );

    /* 진수 표시*/
    printf("10진수 10 : %d\n", 10);
    printf("8진수 8: %d\n", 010);
    printf("16진수 10: %d\n", 0x10);
    printf("16진수 10: %d\n", 0xF);
    
    /*문제 1*/
    printf("안녕하세요\n");
    printf("안녕히 계세요\n");

    /*문제 3*/
    printf("%d\n", 123);
    printf("%c%d 받았다.\n", '\\', 100);
    printf("그럼 내일 또 만나요\n");

    /*문제 4*/
    printf("1\t2\t3\n");

    /*문제 5*/
    printf("%d\n", 06);
    printf("%d\n", 0x14);
    printf("%d\n", 015);


    return 0;
}