package lesson16.homework9;

import lesson16.homework9.cars.Car;

import java.util.Objects;

public class SQLQuery {

    private static boolean firstConditionAdded = false;

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setId(1);
        car1.setCity("Helsinki");
        Car car2 = new Car();
        car2.setModel("V-60");
        car2.setCountry("Germany");
        car2.setCity("Berlin");
        car2.setActive(true);

        Car[] cars = {car1, car2};
        for (Car car : cars) {
            System.out.println(createQuery(car));
        }
    }

    public static String createQuery(Car car) {
        StringBuilder query = new StringBuilder("SELECT * FROM cars");

        if (car.getId() != 0) {
            appendFilter(query, "id = '" + car.getId() + "'");
        }
        if (car.getYear() != 0) {
            appendFilter(query, "year = '" + car.getYear() + "'");
        }
        if (!Objects.equals(car.getModel(), null)) {
            appendFilter(query, "model = '" + car.getModel() + "'");
        }
        if (!Objects.equals(car.getCountry(), null)) {
            appendFilter(query, "country = '" + car.getCountry() + "'");
        }
        if (!Objects.equals(car.getCity(), null)) {
            appendFilter(query, "city = '" + car.getCity() + "'");
        }
        if (car.isActive()) {
            appendFilter(query, "isActive = '" + car.isActive() + "'");
        }

        query.append(";");
        firstConditionAdded = false;
        return query.toString();
    }

    private static void appendFilter(StringBuilder query, String conditionPart) {
        if (firstConditionAdded) {
            query.append(" AND ");
        } else {
            query.append(" WHERE ");
            firstConditionAdded = true;
        }

        query.append(conditionPart);
    }
}
