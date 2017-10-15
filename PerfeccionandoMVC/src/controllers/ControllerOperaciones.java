package controllers;

import views.ViewOperaciones;
import models.ModelOperaciones;

public class ControllerOperaciones{
private final ViewOperaciones view_op;
private final ModelOperaciones model_op;

public ControllerOperaciones(ViewOperaciones view_op, ModelOperaciones model_op){
     this.view_op = view_op;
     this.model_op = model_op;
     
        view_op.jbtn_suma.addActionListener(e->jbtn_suma_click());
        view_op.jbtn_resta.addActionListener(e->jbtn_resta_click());
        view_op.jbtn_mul.addActionListener(e->jbtn_mul_click());
        view_op.jbtn_div.addActionListener(e->jbtn_div_click());
        initView();
        
    }
public void initView(){
    view_op.jtf_num1.setText(String.valueOf(model_op.getN1()));
    view_op.jtf_num2.setText(String.valueOf(model_op.getN2()));
    view_op.jtf_R.setText(String.valueOf(model_op.getR()));
    view_op.setVisible(true);
}
public void jbtn_suma_click(){
    model_op.setN1(Integer.parseInt(view_op.jtf_num1.getText()));
    model_op.setN2(Integer.parseInt(view_op.jtf_num2.getText()));
    model_op.suma();
    view_op.jtf_R.setText(String.valueOf(model_op.getR()));
}
public void jbtn_resta_click(){
    model_op.setN1(Integer.parseInt(view_op.jtf_num1.getText()));
    model_op.setN2(Integer.parseInt(view_op.jtf_num2.getText()));
    model_op.resta();
    view_op.jtf_R.setText(String.valueOf(model_op.getR()));
}
public void jbtn_mul_click(){
    model_op.setN1(Integer.parseInt(view_op.jtf_num1.getText()));
    model_op.setN2(Integer.parseInt(view_op.jtf_num2.getText()));
    model_op.multiplicacion();
    view_op.jtf_R.setText(String.valueOf(model_op.getR()));
}
public void jbtn_div_click(){
    model_op.setN1(Integer.parseInt(view_op.jtf_num1.getText()));
    model_op.setN2(Integer.parseInt(view_op.jtf_num2.getText()));
    model_op.division();
    view_op.jtf_R.setText(String.valueOf(model_op.getR()));
}  
}