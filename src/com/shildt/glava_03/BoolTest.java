package com.shildt.glava_03;

// продемонстрировать прменение значений типа bolean
class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b равно " + b);
        b = true;
        System.out.println("b равно " + b);

        //зачение типа boolean может управлять оператором if
        if (b) System.out.println("Этот код выполняется.");

        b = false;
        if (b) System.out.println("Этот код не выполняется.");

        // результат сравнеия - значение типа boolean
        System.out.println("10 > 9 равно " + (10 > 9));
    }
}

/*
\ddd    Восьмеричный символ (ввв)
\цхххх  Шестанадцатеричный символ в Юникоде (хххх)
\'      Одинарная кавыка
\"      Двонаякавычка
\\      Обратная косая черта
\r      Возврат каретки
\n      Новая строка (или переод строки)
\f      Подача страницы
\t      Табуляция
\b      Возврат на одну позицию("Забой")


 */