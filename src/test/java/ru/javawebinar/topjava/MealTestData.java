package ru.javawebinar.topjava;

import ru.javawebinar.topjava.model.Meal;
import sun.util.cldr.CLDRTimeZoneNameProviderImpl;

import java.time.LocalDateTime;

import static ru.javawebinar.topjava.model.AbstractBaseEntity.START_SEQ;

public class MealTestData {
    public static final int USER_ID = START_SEQ;
    public static final int ADMIN_ID = START_SEQ + 1;
    public static final int NOT_FOUND = 10;

    public static final Meal MEAL_USER_1 = new Meal(10002,
                                        LocalDateTime.of(2020,11,
                                                9,12,0, 0),
                                        "Еда для user 1",
                                        550);
    public static final Meal MEAL_USER_2 = new Meal(10003,
                                        LocalDateTime.of(2020,11,
                                                9,16,0, 0),
                                        "Еда для user 2",
                                        650);
    public static final Meal MEAL_USER_3 = new Meal(10004,
                                        LocalDateTime.of(2020,11,
                                                9,20,0, 0),
                                        "Еда для user 3",
                                        100);
    public static final Meal MEAL_ADMIN_1 = new Meal(10005,
                                        LocalDateTime.of(2020,11,
                                                9,20,0, 0),
                                        "Еда для admin 1",
                                        1000);
    public static final Meal MEAL_ADMIN_2 = new Meal(10006,
                                        LocalDateTime.of(2020,11,
                                                9,20,0, 0),
                                        "Еда для admin 2",
                                        900);
    public static final Meal MEAL_ADMIN_3 = new Meal(10007,
                                        LocalDateTime.of(2020,11,
                                                9,20,0, 0),
                                        "Еда для admin 3",
                                        100);
}


