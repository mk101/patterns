package org.example.template;

import lombok.AllArgsConstructor;
import org.example.template.Truck.TruckOptions;

import java.util.Map;

@AllArgsConstructor
public class ColorA3AxisPetrolOpenTruckCreator extends A3AxisPetrolOpenTruckCreator {
    private String color;

    @Override
    protected void addTruckColor(Map<TruckOptions, Object> options) {
        options.put(TruckOptions.COLOR, color);
    }
}
