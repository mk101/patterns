package org.example.template;

import org.example.template.Truck.TruckOptions;

import java.util.HashMap;
import java.util.Map;

public abstract class TruckCreator {

    public final Truck create() {
        var builder = Truck.builder();

        builder.axisType(selectAxisType());
        builder.engineType(selectEngineType());
        builder.bodyType(selectBodyType());
        builder.companyName(selectCompanyName());

        Map<TruckOptions, Object> options = new HashMap<>();
        addTruckColor(options);
        addSpareWheels(options);

        builder.options(options);

        return builder.build();
    }

    protected abstract int selectAxisType();
    protected abstract String selectEngineType();
    protected abstract String selectBodyType();
    protected abstract String selectCompanyName();

    protected void addTruckColor(Map<TruckOptions, Object> options) {}
    protected void addSpareWheels(Map<TruckOptions, Object> options) {}
}
