import static org.junit.jupiter.api.Assertions.*;

class HYPERPARTest {

    @org.junit.jupiter.api.Test
    void Test1() {
        HYPERPAR hyperpar = new HYPERPAR();
        boolean result = hyperpar.Hyperpar(25895);
        boolean esp = false;
        assertEquals(esp, result);
    }

    @org.junit.jupiter.api.Test
    void Test2() {
        HYPERPAR hyperpar = new HYPERPAR();
        boolean result = hyperpar.Hyperpar(24680);
        boolean esp = true;
        assertEquals(esp, result);
    }

    @org.junit.jupiter.api.Test
    void Test3() {
        HYPERPAR hyperpar = new HYPERPAR();
        boolean result = hyperpar.Hyperpar(0);
        boolean esp = true;
        assertEquals(esp, result);
    }

}