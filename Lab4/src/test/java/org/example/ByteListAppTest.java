import org.junit.jupiter.api.Test; // Імпортуємо необхідні класи з JUnit
import java.util.List;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*; // Імпортуємо методи для перевірки умов

public class ByteListAppTest {

    @Test
    public void testByteList() {
        List<Byte> byteList = new ArrayList<>();
        byteList.add((byte) 10);
        byteList.add((byte) 20);
        byteList.add((byte) 30);
        byteList.add((byte) 40);
        byteList.add((byte) 50);

        assertEquals(5, byteList.size());

        assertEquals((byte) 10, byteList.get(0));
        assertEquals((byte) 20, byteList.get(1));
        assertEquals((byte) 30, byteList.get(2));
        assertEquals((byte) 40, byteList.get(3));
        assertEquals((byte) 50, byteList.get(4));

        byteList.set(2, (byte) 100);
        assertEquals((byte) 100, byteList.get(2));

        byteList.set(4, (byte) 200);
        assertEquals((byte) 200, byteList.get(4));

        assertEquals((byte) 20, byteList.get(1));

        assertEquals(5, byteList.size());
    }
}