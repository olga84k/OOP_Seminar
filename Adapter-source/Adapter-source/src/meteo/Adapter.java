package meteo;

import java.time.LocalDateTime;

public class Adapter implements MeteoSensor{
    public Adapter(SensorTemperature adapter) {
        this.adapter = adapter;
    }

    private SensorTemperature adapter;

    @Override
    public int getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }

    @Override
    public Float getTemperature() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTemperature'");
    }

    @Override
    public Float getHumidity() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHumidity'");
    }

    @Override
    public Float getPressure() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPressure'");
    }

    @Override
    public LocalDateTime getDateTime() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDateTime'");
    }
    
}
