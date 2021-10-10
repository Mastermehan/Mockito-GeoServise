package ru.netology.i18n;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.*;

class LocalizationServiceTest {

    @Test
    @DisplayName("проверка возвращаемого текста (страна Россия)")
    void locale() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        String expected = "Добро пожаловать";
        String actual = localizationService.locale(Country.RUSSIA);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("проверка возвращаемого текста (страна США)")
    void localeEngland() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        String expected = "Welcome";
        String actual = localizationService.locale(Country.USA);
        assertEquals(expected,actual);

    }
}