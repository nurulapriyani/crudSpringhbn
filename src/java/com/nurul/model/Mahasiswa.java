/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nurul.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author nurul apriyani
 */

@Entity
@Table(name = "tbl_mhs")
public class Mahasiswa implements Serializable{
    private int id;
    private String nama;
    private String npm;
    private String tgl_lahir;
    private String jk;
    private String alamat;
    
    @Id 
    @GeneratedValue
    @Column(name = "id")
     public int getId()
    {
        return this.id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
  
     
    @Column(name="nama", length = 100) 
    public String getNama()
    {
        return this.nama;
    }
    public void setNama(String nama)
    {
        this.nama=nama;
    }
    
    @Column(name="npm", length = 12)
    public String getNpm()
    {
        return this.npm;
    }
    public void setNpm(String npm)
    {
        this.npm=npm;
    }
     
     @Column(name="tgl_lahir", columnDefinition = "Date")
      public String getTgl_lahir()
    {
        return this.tgl_lahir;
    }
    public void setTgl_lahir(String tgl_lahir)
    {
        this.tgl_lahir=tgl_lahir;
    }
    
    @Column(name="jk", columnDefinition = "enum('L','P')")
    public String getJk()
    {
        return this.jk;
    }
    public void setJk(String jk)
    {
        this.jk=jk;
    }
    
    
     @Column(name="alamat", columnDefinition = "Text")
    public String getAlamat()
    {
        return this.alamat;
    }
    public void setAlamat(String alamat)
    {
        this.alamat=alamat;
    }
    
}
