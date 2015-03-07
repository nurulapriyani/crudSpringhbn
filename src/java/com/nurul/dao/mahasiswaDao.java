/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nurul.dao;

import com.nurul.model.Mahasiswa;
import java.util.List;


/**
 *
 * @author nurul apriyani
 */
 public interface mahasiswaDao{
     public void insert(Mahasiswa mhs);
     public void update(Mahasiswa mhs);
     public void delete(int id);
     public Mahasiswa mhsById(int id);
     public List<Mahasiswa> getListmhs();
 }