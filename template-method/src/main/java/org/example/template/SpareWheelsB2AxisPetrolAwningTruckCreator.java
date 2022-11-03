package org.example.template;

import lombok.AllArgsConstructor;
import org.example.template.Truck.TruckOptions;

import java.util.Map;

@AllArgsConstructor
public class SpareWheelsB2AxisPetrolAwningTruckCreator extends B2AxisPetrolAwningTruckCreator {
    private int spareWheelsCount;

    @Override
    protected void addSpareWheels(Map<TruckOptions, Object> options) {
        options.put(TruckOptions.SPARE_COUNT, spareWheelsCount);
    }
}
