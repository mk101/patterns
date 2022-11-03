package org.example.template;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class Truck {

    public enum TruckOptions {
        COLOR, SPARE_COUNT
    }

    private int axisType;

    private String engineType;

    private String bodyType;

    private String companyName;

    private Map<TruckOptions, Object> options;
}
