import business.*;
import core.logging.*;
import dataAccess.*;
import entities.*;


public class Main {
    public static void main(String[] args) throws Exception{
        Category category = new Category(2,"java");
        Course course = new Course(01,"Java 2022 Kampı",10);
        Instructor instructor = new Instructor(1, "Engin", "Demiroğ");

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new EmailLogger()};

        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
        categoryManager.add(category);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.add(course);
    }
}
