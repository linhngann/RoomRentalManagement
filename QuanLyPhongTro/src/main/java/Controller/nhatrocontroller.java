/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.NhaTroDAO;
import java.util.List;
import model.NhaTro;

/**
 *
 * @author nm204
 */
public class nhatrocontroller {
    private NhaTroDAO nhaTroDao;
    
    public nhatrocontroller()
    {
        nhaTroDao = new NhaTroDAO();
    }
    
    public List<NhaTro> sellectAll()
    {
        return nhaTroDao.sellectAll();
    }
    public void Insert(NhaTro nhaTro)
    {
        nhaTroDao.Insert(nhaTro);
    }
    public void deleteNhaTro(int id)
    {
        nhaTroDao.Delete(id);
    }
    public void DeleteMa(String maNhaTro)
    {
        nhaTroDao.DeleteMa(maNhaTro);
    }
    public NhaTro selectById(int id)
    {
        return nhaTroDao.selectById(id);
    }
    public NhaTro selectByMa(String maNhaTro)
    {
        return nhaTroDao.selectByMa(maNhaTro);
    }
    public void Update(NhaTro nhatro)
    {
        nhaTroDao.Update(nhatro);
    }
    public List<NhaTro> selectByCondition(String name)
    {
        return nhaTroDao.selectByCondition(name);
    }
}
