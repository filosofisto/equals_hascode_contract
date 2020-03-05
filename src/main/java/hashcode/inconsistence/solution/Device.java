package hashcode.inconsistence.solution;

import java.util.Objects;

public class Device {

    private String serieNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Objects.equals(serieNumber, device.serieNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serieNumber);
    }

    public Device(String serieNumber) {
        this.serieNumber = serieNumber;
    }

    public String getSerieNumber() {
        return serieNumber;
    }

    public void setSerieNumber(String serieNumber) {
        this.serieNumber = serieNumber;
    }
}
