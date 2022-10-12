package dataAccess;

import entities.Category;

public class HibernateCategoryDao implements CategoryDao{


    @Override
    public void add(Category category) {
        System.out.println("Kategori veritabanina eklendi: Hibernate");
    }
}
