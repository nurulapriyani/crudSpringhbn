/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nurul.controller;

import com.nurul.dao.mahasiswaDao;
import com.nurul.model.Mahasiswa;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author nurul apriyani
 */

@Controller
public class mahasiswaController {
    @Autowired
    private mahasiswaDao mhsDao;
    private String action;
    
    public void setMhsDao(mahasiswaDao md){
        this.mhsDao = md;
    }
    
    @RequestMapping(value="/index",  method = RequestMethod.GET)
    public ModelAndView listMhs(){
        
        List<Mahasiswa> lsmhs= new ArrayList<Mahasiswa>();
        lsmhs=mhsDao.getListmhs();
        return new ModelAndView("listmhs","mahasiswa",lsmhs);
    }
    
    @RequestMapping(value="/addmhs",  method = { RequestMethod.GET,RequestMethod.POST } )
    public ModelAndView addmhs(@ModelAttribute("SpringWeb")Mahasiswa mhs, ModelMap model) {
        if(mhs.getNpm()!=null){
            mhsDao.insert(mhs);
            model.addAttribute("msg","record has been added");
        }
        return new ModelAndView("addmhs","mahasiswa",new Mahasiswa());
    }
    
    @RequestMapping(value="/editmhs",   method = { RequestMethod.GET,RequestMethod.POST } )
    public String editmhs(@RequestParam("id")String id, @ModelAttribute("SpringWeb")Mahasiswa mhs, Model model) {
        if(mhs.getNpm()!=null){
            mhsDao.update(mhs);
            model.addAttribute("msg","record has been updated");
        }
        Mahasiswa getmhs=mhsDao.mhsById(Integer.parseInt(id));
        model.addAttribute("mahasiswa",getmhs);
        return "editmhs";
    }
    
    @RequestMapping(value="/deletemhs",  method = RequestMethod.GET)
    public String deletemhs(@RequestParam("id")int id) {
        mhsDao.delete(id);
       return "redirect";
    }
}
