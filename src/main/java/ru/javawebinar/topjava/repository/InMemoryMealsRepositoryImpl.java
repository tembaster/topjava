package ru.javawebinar.topjava.repository;

import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.util.MealsUtil;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InMemoryMealsRepositoryImpl implements MealsRepository {

    public static final List<Meal> mealsList = new CopyOnWriteArrayList<>();

    public void initList() {
        mealsList.add(new Meal(1, LocalDateTime.of(2020, Month.JANUARY, 30, 10, 0), "Завтрак", 500));
        mealsList.add(new Meal(2, LocalDateTime.of(2020, Month.JANUARY, 30, 13, 0), "Обед", 1000));
        mealsList.add(new Meal(3, LocalDateTime.of(2020, Month.JANUARY, 30, 20, 0), "Ужин", 500));
        mealsList.add(new Meal(4, LocalDateTime.of(2020, Month.JANUARY, 31, 0, 0), "Еда на граничное значение", 100));
        mealsList.add(new Meal(5, LocalDateTime.of(2020, Month.JANUARY, 31, 10, 0), "Завтрак", 1000));
        mealsList.add(new Meal(6, LocalDateTime.of(2020, Month.JANUARY, 31, 13, 0), "Обед", 500));
        mealsList.add(new Meal(7, LocalDateTime.of(2020, Month.JANUARY, 31, 20, 0), "Ужин", 410));
    }

    @Override
    public void add(Meal meal) {
        mealsList.add(meal);
    }

    @Override
    public void delete(int id) {
        mealsList.removeIf(meal -> id == meal.getId());
    }

    @Override
    public void update(Meal meal) {
        int id = meal.getId();
        for (Meal searchMeal : mealsList) {
            if (id == searchMeal.getId()) {
                searchMeal.setCalories(meal.getCalories());
                searchMeal.setDateTime(meal.getDateTime());
                searchMeal.setDescription(meal.getDescription());
            }
        }
    }

    @Override
    public Meal getMealById(int id) {
        for (Meal meal : mealsList) {
            if (id == meal.getId()) {
                return meal;
            }
        }
        return null;
    }

    @Override
    public List<Meal> getMealsList() {
        if (!mealsList.isEmpty()) {
            return mealsList;
        } else {
            initList();
            return mealsList;
        }
    }
}
