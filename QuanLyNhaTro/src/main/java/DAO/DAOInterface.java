/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import java.util.ArrayList;


/**
 *
 * @author nm204
 * @param <T>
 */
public interface DAOInterface<T> {
    public void Insert(T t);
    
    public void Update(T t);
    
    public void Delete(int id);
    
    public ArrayList<T> sellectAll();
    
    public T selectById(int id);
    
    public ArrayList<T> selectByCondition(String condition);
}
