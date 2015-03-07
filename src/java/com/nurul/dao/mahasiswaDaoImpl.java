/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nurul.dao;

import com.nurul.model.Mahasiswa;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author nurul apriyani
 */
@Transactional
@Repository
public class mahasiswaDaoImpl implements mahasiswaDao {
    @Autowired
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory= sessionFactory;
    }
    public SessionFactory getSessionFactory(){
        return this.sessionFactory;
    }
    
    public void insert(Mahasiswa mhs) {
        sessionFactory.getCurrentSession().save(mhs);
    }

    public void update(Mahasiswa mhs) {
         sessionFactory.getCurrentSession().update(mhs);
    }

    public void delete(int id) {
        Mahasiswa mhs= (Mahasiswa)sessionFactory.getCurrentSession().load(Mahasiswa.class, id);
        sessionFactory.getCurrentSession().delete(mhs);
    }

    public Mahasiswa mhsById(int id) {
        Mahasiswa mhs=(Mahasiswa)sessionFactory.getCurrentSession().get(Mahasiswa.class, id);
        return mhs;
    }

    public List<Mahasiswa> getListmhs() {
       return sessionFactory.getCurrentSession().createQuery("from Mahasiswa").list();
    }
    
}
