package org.example.template;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class A3AxisPetrolOpenTruckCreator extends TruckCreator {
    @Override
    protected int selectAxisType() {
        return 3;
    }

    @Override
    protected String selectEngineType() {
        return "Бензиновый";
    }

    @Override
    protected String selectBodyType() {
        return "Открытый";
    }

    @Override
    protected String selectCompanyName() {
        return "A";
    }
}
