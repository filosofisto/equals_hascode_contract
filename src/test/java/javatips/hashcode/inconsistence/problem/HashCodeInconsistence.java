package javatips.hashcode.inconsistence.problem;

import hashcode.inconsistence.problem.Device;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

public class HashCodeInconsistence {

    @Test
    public void test() {
        Map<Device, String> map = new HashMap<>();
        map.put(new Device("12345"), "Device 1");
        map.put(new Device("23456"), "Device 2");
        map.put(new Device("34567"), "Device 3");
        map.put(new Device("45678"), "Device 4");

        assertNotNull(map.get(new Device("12345")));
    }
}
