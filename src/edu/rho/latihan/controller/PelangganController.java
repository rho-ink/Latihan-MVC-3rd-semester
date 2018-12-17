/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rho.latihan.controller;

import edu.rho.latihan.model.PelangganModel;
import edu.rho.latihan.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author CHEEKIBREEKIIVDAMKE
 * NAMA                 : M RIFQI S M
 * KELAS                : PBO-3 
 * NIM                  : 10117121
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void resetForm(PelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTelp().getText();
        
        if (nama.equals("") && email.equals("") && noTlp.equals("")) {
            
        }else {
            
            model.resetForm();
        
        }
        
    
    }
    
    public void simpanForm(PelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTelp().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Name can't be blank");
            
        } else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Email can't be blank");
        
        } else if (noTlp.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Phone number can't blank");
        
        } else{
        
            model.simpanForm();
            
        }
        
    
    }
    
}
