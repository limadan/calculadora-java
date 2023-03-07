/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorajava;

import java.awt.event.ActionEvent;

/**
 *
 * @author danilo
 */
public class CalculadoraController {
    CalculadoraView calculadoraView = new CalculadoraView();
    
    private double ans = 0;
    private String displayValue = "";
    private char operation;

    public CalculadoraController() {
        
        this.calculadoraView.getBtn0().addActionListener((ActionEvent e)->{
            this.insertDigito("0");
        });
        
        this.calculadoraView.getBtn1().addActionListener((ActionEvent e)->{
            this.insertDigito("1");
        });
        
        this.calculadoraView.getBtn2().addActionListener((ActionEvent e)->{
            this.insertDigito("2");
        });
        
        this.calculadoraView.getBtn3().addActionListener((ActionEvent e)->{
            this.insertDigito("3");
        });
        
        this.calculadoraView.getBtn4().addActionListener((ActionEvent e)->{
            this.insertDigito("4");
        });
        
        this.calculadoraView.getBtn5().addActionListener((ActionEvent e)->{
            this.insertDigito("5");
        });
        
        this.calculadoraView.getBtn6().addActionListener((ActionEvent e)->{
            this.insertDigito("6");
        });
        
        this.calculadoraView.getBtn7().addActionListener((ActionEvent e)->{
            this.insertDigito("7");
        });
        
        this.calculadoraView.getBtn8().addActionListener((ActionEvent e)->{
            this.insertDigito("8");
        });
        
        this.calculadoraView.getBnt9().addActionListener((ActionEvent e)->{
            this.insertDigito("9");
        });
        
        this.calculadoraView.getBtnPonto().addActionListener((ActionEvent e)->{
            this.insertDigito(".");
        });
        
        this.calculadoraView.getBtnBackspace().addActionListener((ActionEvent e)->{
            this.backSpace();
        });
        
        this.calculadoraView.getBtnClear().addActionListener((ActionEvent e)->{
            this.clear();
        });
        
    }
    
    
    
    private void insertDigito(String digito){
        if(this.displayValue.equals(Double.toString(this.ans))){
            this.clear();
        }
        
        if(digito.equals(".")&&displayValue.contains(".")){
            return;
        }
        
        this.displayValue = displayValue.concat(digito);
        
        this.calculadoraView.getDisplay().setText(this.displayValue);
        this.updateScreen();
    }
    
    private void backSpace(){
        if(this.displayValue.length()>0){
            this.displayValue = this.displayValue.substring(0, this.displayValue.length()-1);
            this.calculadoraView.getDisplay().setText(this.displayValue);
            
            this.updateScreen();
        }
    }
    
    private void clear(){
        this.displayValue = "";
        this.calculadoraView.getDisplay().setText(this.displayValue);
    }
    
    private void updateScreen(){
        this.calculadoraView.repaint();
        this.calculadoraView.revalidate();
    }
    
    public void run(){
        this.calculadoraView.setVisible(true);
    }
}
