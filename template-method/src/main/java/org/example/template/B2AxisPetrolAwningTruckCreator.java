package org.example.template;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class B2AxisPetrolAwningTruckCreator extends TruckCreator {
    @Override
    protected int selectAxisType() {
        return 2;
    }

    @Override
    protected String selectEngineType() {
        return "Бензиновый";
    }

    @Override
    protected String selectBodyType() {
        return "Тентованный";
    }

    @Override
    protected String selectCompanyName() {
        return "B";
    }
}
