/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jkei.scoringsystem.dao;

import java.util.List;
import jkei.scoringsystem.model.CategoryNew;

/**
 *
 * @author Kate Dianne
 */
public interface CategoryNewDao {
    void CreateCategoryNew(List<CategoryNew> _request);
    void UpdateCategoryNew(List<CategoryNew> request);
    void DeleteCategoryNew(List<CategoryNew> request);
    List<CategoryNew> getCategoryNew();
}
