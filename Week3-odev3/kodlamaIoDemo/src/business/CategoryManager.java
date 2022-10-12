package business;

import core.logging.Logger;
import dataAccess.CategoryDao;
import entities.Category;

import java.util.ArrayList;


public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    ArrayList<Category> categories = new ArrayList<>();

    public void add(Category category) throws Exception{
        for (Category category1:categories){
            if (category1.getCategoryName()== category.getCategoryName()){
                throw  new Exception("Kategori isimleri ayni. lütfen degistirin.");
            }
        }
        categories.add(category);
        categoryDao.add(category);

        for (Logger logger:loggers){
            logger.log(category.getCategoryName());
        }
    }
}
