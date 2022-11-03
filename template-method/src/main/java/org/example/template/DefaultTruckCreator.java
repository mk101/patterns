package org.example.template;

import lombok.AllArgsConstructor;
import org.example.template.Truck.TruckOptions;

import java.util.Map;

@AllArgsConstructor
public class DefaultTruckCreator extends TruckCreator {
    private int axisType;
    private String engineType;
    private String bodyType;
    private String companyName;
    private Map<TruckOptions, Object> customOptions;

    @Override
    protected int selectAxisType() {
        return axisType;
    }

    @Override
    protected String selectEngineType() {
        return engineType;
    }

    @Override
    protected String selectBodyType() {
        return bodyType;
    }

    @Override
    protected String selectCompanyName() {
        return companyName;
    }

    @Override
    protected void addTruckColor(Map<TruckOptions, Object> options) {
        if (customOptions.containsKey(TruckOptions.COLOR)) {
            options.put(TruckOptions.COLOR, customOptions.get(TruckOptions.COLOR));
        }
    }

    @Override
    protected void addSpareWheels(Map<TruckOptions, Object> options) {
        if (customOptions.containsKey(TruckOptions.SPARE_COUNT)) {
            options.put(TruckOptions.SPARE_COUNT, customOptions.get(TruckOptions.SPARE_COUNT));
        }
    }
}
