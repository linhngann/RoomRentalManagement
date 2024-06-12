/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.NguoiThueDAO;
import java.util.List;
import model.NguoiThue;

/**
 *
 * @author nm204
 */
public class NguoiThueController {
    private NguoiThueDAO nguoiThueDAO ;
    
    public NguoiThueController()
    {
        nguoiThueDAO = new NguoiThueDAO();
    }
    
    public List<NguoiThue> sellectAll()
    {
        return nguoiThueDAO.sellectAll();
    }
    public void Insert(NguoiThue nguoiThue)
    {
        nguoiThueDAO.Insert(nguoiThue);
    }
    public void DeleteMa(String maNguoiThue)
    {
        nguoiThueDAO.DeleteMa(maNguoiThue);
    }
    public NguoiThue selectById(int id)
    {
        return nguoiThueDAO.selectById(id);
    }
    public NguoiThue selectByMa(String maNguoiThue)
    {
        return nguoiThueDAO.selectByMa(maNguoiThue);
    }
    public void Update(NguoiThue nhatro)
    {
        nguoiThueDAO.Update(nhatro);
    }
    public List<NguoiThue> selectByCondition(String name)
    {
        return nguoiThueDAO.selectByCondition(name);
    }
}
