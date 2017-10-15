package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelEditorTexto;
import views.ViewMain;
import models.ModelMain;
import models.Model_Ascendente;
import models.Model_Mayor;
import views.ViewEditorTexto;
import views.ViewMessage;
import views.ViewOperaciones;
import views.View_Ascendente;
import views.View_Mayor;

public class ControllerMain implements ActionListener{
    ViewMain viewMain;
    ViewMessage viewMessage;
    ViewOperaciones view_op;
    View_Mayor view_mayor;
    View_Ascendente view_ascendente;
    ViewEditorTexto vieweditortexto;
    ModelMain modelMain;
    Model_Mayor model_mayor;
    Model_Ascendente model_ascendente;
    ModelEditorTexto modeleditortexto;
    
    
    public ControllerMain(ViewMain viewMain,ViewMessage viewMessage,ViewOperaciones view_op,View_Mayor view_Mayor,View_Ascendente view_ascendente,ViewEditorTexto vieweditortexto,ModelMain modelMain){
        this.viewMain = viewMain;
        this.viewMessage = viewMessage;
        this.view_op = view_op;
        this.view_mayor =view_Mayor;
        this.view_ascendente =view_ascendente;
        this.vieweditortexto = vieweditortexto;
        this.modelMain = modelMain;
        this.viewMain.jmiMessage.addActionListener(this);
        this.viewMain.jmiOperaciones.addActionListener(this);
        this.viewMain.jmi_mayor.addActionListener(this);
        this.viewMain.jmi_ascendente.addActionListener(this);
        this.viewMain.jmi_editor_texto.addActionListener(this);
        
        initView();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==viewMain.jmiMessage)
            jmiMessageActionPerformed();
        else if (e.getSource() == viewMain.jmiOperaciones)
            jmiOperacionesActionesPerformed();
        else if (e.getSource() == viewMain.jmi_mayor)
            jmi_MayorActionesPerformed();
        else if (e.getSource() == viewMain.jmi_ascendente)
            jmi_ascendenteActionesPerformed();
        else if (e.getSource() == viewMain.jmi_editor_texto)
            jmi_editor_textoActionesPerformed();
    }
    
    public void jmiMessageActionPerformed(){
        this.viewMain.setContentPane(viewMessage);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
    
    public void jmiOperacionesActionesPerformed(){
        this.viewMain.setContentPane(view_op);
        this.viewMain.revalidate();
        this.viewMain.repaint();
        
    }
    
    public void jmi_MayorActionesPerformed(){
        this.viewMain.setContentPane(view_mayor);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
    
        public void jmi_ascendenteActionesPerformed(){
        this.viewMain.setContentPane(view_ascendente);
        this.viewMain.revalidate();
        this.viewMain.repaint();
        }
        public void jmi_editor_textoActionesPerformed(){
        this.viewMain.setContentPane(vieweditortexto);
        this.viewMain.revalidate();
        this.viewMain.repaint();
        
        
    }
    private void initView(){
        this.viewMain.setTitle("Hello MVC Panel");
        this.viewMain.setLocationRelativeTo(null);
        this.viewMain.setVisible(true);
    }
}
