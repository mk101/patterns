package org.example;

import org.example.template.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        int axis;
        String engine = "", body = "", company = "";
        String color = null;
        int spareCount = -1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество осей: ");
        axis = scanner.nextInt();

        System.out.print("Введите тип двигателя: ");
        engine = scanner.next();

        System.out.print("Введите тип кузова: ");
        body = scanner.next();

        System.out.print("Введите название компании: ");
        company = scanner.next();

        String answer = "";
        System.out.print("Добавить цвет кузова?(y/n): ");
        answer = scanner.next();
        if (answer.equals("y")) {
            System.out.print("Введите цвет");
            color = scanner.next();
        }

        System.out.print("Добавить запасные колеса?(y/n): ");
        answer = scanner.next();
        if (answer.equals("y")) {
            System.out.print("Введите количество");
            spareCount = scanner.nextInt();
        }

        var creator = getTruckCreator(axis, engine, body, company, color, spareCount);
        System.out.println(creator.create().toString());
    }

    private static TruckCreator getTruckCreator(int axis, String engine, String body, String company, String color, int spareCount) {
        if (company.equals("A") &&
            axis == 3 &&
            engine.equals("Бензиновый") &&
            body.equals("Открытый") &&
            spareCount == -1) {

            if (color != null) {
                return new ColorA3AxisPetrolOpenTruckCreator(color);
            }

            return new A3AxisPetrolOpenTruckCreator();
        }

        if (company.equals("A") &&
            axis == 1 &&
            engine.equals("Дизельный") &&
            body.equals("Самосвал") &&
            color == null &&
            spareCount == -1) {
            return new A1AxisDieselDumpTruckCreator();
        }

        if (company.equals("B") &&
                axis == 2 &&
                engine.equals("Бензиновый") &&
                body.equals("Тентованный") &&
                color == null) {
            if (spareCount != -1) {
                return new SpareWheelsB2AxisPetrolAwningTruckCreator(spareCount);
            }

            return new B2AxisPetrolAwningTruckCreator();
        }

        Map<Truck.TruckOptions, Object> options = new HashMap<>();
        if (color != null) {
            options.put(Truck.TruckOptions.COLOR, color);
        }

        if (spareCount != -1) {
            options.put(Truck.TruckOptions.SPARE_COUNT, spareCount);
        }

        return new DefaultTruckCreator(
                axis,
                engine,
                body,
                company,
                options
        );
    }
}
