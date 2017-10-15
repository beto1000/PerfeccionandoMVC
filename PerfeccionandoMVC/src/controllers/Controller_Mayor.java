package controllers;
import models.Model_Mayor;
import views.View_Mayor;

public final class Controller_Mayor {
    private final Model_Mayor model_mayor;
    private final View_Mayor view_mayor;
   
public Controller_Mayor(Model_Mayor model_mayor,View_Mayor view_mayor){ //view_mayor****
this.model_mayor = model_mayor;
this.view_mayor = view_mayor;
this.view_mayor.jbtn_calcular.addActionListener(e->jbtn_calcular_click());
this.view_mayor.jbtn_limpiar.addActionListener(e->jbtn_limpiar_click());
InitView();
}



public void jbtn_limpiar_click(){
view_mayor.jtf_numero1.setText("");
view_mayor.jtf_numero2.setText("");
view_mayor.jtf_numero3.setText("");
view_mayor.jtf_mayor.setText("");
}
        
        
public void InitView(){
    view_mayor.jtf_numero1.setText(String.valueOf(model_mayor.getN1()));
    view_mayor.jtf_numero2.setText(String.valueOf(model_mayor.getN2()));
    view_mayor.jtf_numero3.setText(String.valueOf(model_mayor.getN3()));
    view_mayor.jtf_mayor.setText(String.valueOf(model_mayor.getM()));
    view_mayor.setVisible(true);
 
    
}
public void jbtn_calcular_click(){
    model_mayor.setN1(Integer.parseInt(view_mayor.jtf_numero1.getText()));
    model_mayor.setN2(Integer.parseInt(view_mayor.jtf_numero2.getText()));
    model_mayor.setN3(Integer.parseInt(view_mayor.jtf_numero3.getText()));
    model_mayor.mayor();
    view_mayor.jtf_mayor.setText(String.valueOf(model_mayor.getM()));
}

}