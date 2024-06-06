/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DichVuDAO;
import java.util.List;
import javax.swing.JFrame;
import model.DichVu;

/**
 *
 * @author ASUS
 */
public class DichVuController {
    private  DichVuDAO dichVuDao;
    
    public DichVuController()
    {
        dichVuDao = new DichVuDAO();
    }
    
    public List<DichVu> sellectAll()
    {
        return dichVuDao.sellectAll();
    }
    public void Insert(DichVu dichVu, JFrame parentFrame) {
        dichVuDao.Insert(dichVu, parentFrame);
    }
    public void deleteDichVu(String maDichVu)
    {
        dichVuDao.Delete(maDichVu);
    }
    
    public DichVu selectById(String maDichVu)
    {
        return dichVuDao.selectById(maDichVu);
    }
    public void Update(DichVu nhatro)
    {
        dichVuDao.Update(nhatro);
    }
    public List<DichVu> selectByCondition(String name)
    {
        return dichVuDao.selectByCondition(name);
    }
}
