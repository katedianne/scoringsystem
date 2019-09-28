/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jkei.scoringsystem.service;

import java.util.List;
import jkei.scoringsystem.dao.CategoryNewDao;
import jkei.scoringsystem.model.CategoryNew;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Kate Dianne
 */
public class CategoryNewServiceImpl implements CategoryNewService {
    @Autowired
    public CategoryNewDao categoryDao;
    
    public void CreateCategoryNew(List<CategoryNew> _request){
        categoryDao.CreateCategoryNew(_request);
    }
    
    public void UpdateCategoryNew(List<CategoryNew> request){
        categoryDao.UpdateCategoryNew( request);
    }
    
    public void DeleteCategoryNew(List<CategoryNew> request){
        categoryDao.DeleteCategoryNew(request);
    }
    
    public List<CategoryNew> getCategoryNew(){
        return categoryDao.getCategoryNew();
    }
}
