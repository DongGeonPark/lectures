#include <stdio.h>

int main() {
    /*�ܼ� ���*/
    printf("Hello World\n");
    printf("My naem is DongGeon\n\n");

    /*���� ���*/
    printf("%c �̰��� �����Դϴ�.\n", 'a');
    printf("%d �̰��� �����Դϴ�.\n", 10);
    printf("%f �̰��� �Ǽ��Դϴ�.\n", 10.0);

    /*�̽�������*/
    printf("�������� ǥ��: %c\n", '\\');
    printf("����ǥ ǥ�� : %c\n", '\'' );

    /* ���� ǥ��*/
    printf("10���� 10 : %d\n", 10);
    printf("8���� 8: %d\n", 010);
    printf("16���� 10: %d\n", 0x10);
    printf("16���� 10: %d\n", 0xF);
    
    /*���� 1*/
    printf("�ȳ��ϼ���\n");
    printf("�ȳ��� �輼��\n");

    /*���� 3*/
    printf("%d\n", 123);
    printf("%c%d �޾Ҵ�.\n", '\\', 100);
    printf("�׷� ���� �� ������\n");

    /*���� 4*/
    printf("1\t2\t3\n");

    /*���� 5*/
    printf("%d\n", 06);
    printf("%d\n", 0x14);
    printf("%d\n", 015);


    return 0;
}