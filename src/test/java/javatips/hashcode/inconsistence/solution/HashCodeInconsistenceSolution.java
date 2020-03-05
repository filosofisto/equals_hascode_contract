package javatips.hashcode.inconsistence.solution;

import hashcode.inconsistence.solution.Device;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertNotNull;

public class HashCodeInconsistenceSolution {

    @Test
    public void test() {
        Map<Device, String> map = new HashMap<>();
        map.put(new Device("12345"), "Device 1");
        map.put(new Device("23456"), "Device 2");
        map.put(new Device("34567"), "Device 3");
        map.put(new Device("45678"), "Device 4");

        assertNotNull(map.get(new Device("12345")));
    }

//    @Test
//    public void checkContract() {
//        EqualsVerifier.forClass(Device.class).usingGetClass().verify();
//    }
}
