package com.shildt.chapter_09;

interface MyIF2 { // ТУТ НАДО УКАЗАТЬ public НО НЕЛЬЗЯ Т.К НУЖНО БУДЕТ ПЕРЕИМЕНОВАТЬ ФАЙЛ
    int getNumber();

    default String getString() {
        return "Объект типа String по умолчанию.";
    }
}
