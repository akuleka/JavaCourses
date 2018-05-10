package ru.reksoft;

import org.junit.Assert;
import org.junit.Test;

public class Lesson2Test {

    @Test
    public void formula() {
        Assert.assertEquals(5, Lesson2.formula(1));
        Assert.assertEquals(13, Lesson2.formula(15));
        Assert.assertEquals(44, Lesson2.formula(155));
    }

    @Test
    public void initials() {
        Assert.assertEquals("И.И.П.", Lesson2.initials("Иванов Иван Петрович"));
        Assert.assertEquals("П.А.Н.", Lesson2.initials("Петров алексей Никифорович"));
        Assert.assertEquals("К.Г.В.", Lesson2.initials("Козлова Галина Васильевна"));
        Assert.assertEquals("П.А.С.", Lesson2.initials("Пушкин А. С."));
    }
}