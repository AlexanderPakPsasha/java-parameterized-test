package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class) // добавь аннотацию с раннером
public class MainTest {
    // добавь два поля класса: для проверяемой строки и ожидаемого результата
    private final String checkedText;
    private final boolean expected;

    // напиши конструктор с двумя параметрами
    public MainTest(String checkedText, boolean expected)
    {
        this.checkedText = checkedText;
        this.expected = expected;
    }

    // напиши метод для получения тестовых данных
    @Parameterized.Parameters
    public static Object[] getSumData()
    {
        return new Object[][]
                {
                        {"anna", true},
                        {"anka", false}, // передали тестовые данные
                };
    }

    // напиши тест
    @Test
    public void shouldCheckPalindrome()
    {
        Main palindromeService = new Main();
        boolean actual = palindromeService.isPalindrome(checkedText);
        // обратились к полям тестового класса
        assertEquals(expected, actual);
    }
}

