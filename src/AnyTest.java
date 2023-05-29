import static org.junit.jupiter.api.Assertions.*;

class AnyTest {

    @org.junit.jupiter.api.Test
    public void TestDigitsDiferents() {
        Any any = new Any(123);
        int result = any.digitsDiferents(any.getAny());
        int esp = 3;
        assertEquals(esp, result);
    }

    @org.junit.jupiter.api.Test
    public void TestDigitsDiferents2() {
        Any any = new Any(123456789);
        int result = any.digitsDiferents(any.getAny());
        int esp = 9;
        assertEquals(esp, result);
    }

    @org.junit.jupiter.api.Test
    public void TestDigitsDiferents3() {
        Any any = new Any(0);
        int result = any.digitsDiferents(any.getAny());
        int esp = 1;
        assertEquals(esp, result);
    }

    @org.junit.jupiter.api.Test
    public void TestDigitsDiferents4() {
        Any any = new Any(2023);
        int result = any.digitsDiferents(any.getAny());
        int esp = 3;
        assertEquals(esp, result);
    }

}