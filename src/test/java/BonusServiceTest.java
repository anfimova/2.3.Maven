import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод
        long actual = service.calculate(amount, registered);

        // производим проверку
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные
        long amount = 1000_000_60;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод
        long actual = service.calculate(amount, registered);

        // производим проверку
        assertEquals(expected, actual);
    }
}