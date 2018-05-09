package ru.reksoft;

class Lesson2 {

    /**
     * Нужно реализовать формулу y = √(13x + 13/x)
     * Подсказка: квадратный корень вычисляется функцией Math.sqrt()
     *
     * @param x на текущем этапе входное значение будет больше нуля
     * @return возвращаем только целую часть от полученного результата,
     * хвост отбрасываем без откругления
     */
    public static void main(String[] args) {
        System.out.println(formula(155));
        System.out.println(initials("акулова еатерина алексеевна"));
    }

    static int formula(int x) {
        int y = (int) Math.sqrt(13 * x + 13 / x);
        return y;
    }

    /**
     * Нужно привести строку с полным именем к инициалам.
     * Например, "Иванов Петр Александрович" → "И.П.А."
     * Подсказка:
     * разделение строки на части: .split(" ");
     * получение символа на определенной позиции: .charAt();
     * приведение к верхнему регистру: .toUpperCase();
     *
     * @param fullName на текущем этапе имена будут состоять из имени, фамили и отчества, разделяться пробелами.
     *                 Регистр букв во входном параметре может быть любым.
     * @return возвращаем инициалы в верхнем регистре разделенные точкой, как в примере выше
     */
    static String initials(String fullName) {
        String[] Array1 = fullName.split(" ");
        String f = Array1[0].charAt(0) + ".";
        String i = Array1[1].charAt(0) + ".";
        String o = Array1[2].charAt(0) + ".";
        String initials = f + i + o;
        return initials.toUpperCase();
    }

}
