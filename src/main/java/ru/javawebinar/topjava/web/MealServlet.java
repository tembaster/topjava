package ru.javawebinar.topjava.web;

import org.slf4j.Logger;

import ru.javawebinar.topjava.util.MealsUtil;
import ru.javawebinar.topjava.model.MealTo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class MealServlet extends HttpServlet {

    private static final Logger log = getLogger(MealServlet.class);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.debug("redirect to users");
        //response.sendRedirect("meals.jsp");
        List<MealTo> meals = MealsUtil.initMeals();
        request.setAttribute("meals", meals);
        RequestDispatcher requestDispatcher;
        requestDispatcher = request.getRequestDispatcher("/meals.jsp");
        requestDispatcher.forward(request, response);
    }
}
