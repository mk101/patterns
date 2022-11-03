package org.example.template;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class A1AxisDieselDumpTruckCreator extends TruckCreator {
    @Override
    protected int selectAxisType() {
        return 1;
    }

    @Override
    protected String selectEngineType() {
        return "Дизельный";
    }

    @Override
    protected String selectBodyType() {
        return "Самосвал";
    }

    @Override
    protected String selectCompanyName() {
        return "A";
    }
}
