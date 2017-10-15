package main;

import views.*;
import models.*;
import controllers.*;

public class Main {

    private static ViewMain viewMain;
    private static ModelMain modelMain;
    private static ControllerMain controllerMain;
    
    private static ViewOperaciones view_op;
    private static ModelOperaciones model_op;
    private static ControllerOperaciones controller_op;
    
    private static ViewMessage viewMessage;
    private static ModelMessage modelMessage;
    private static ControllerMessage controllerMessage;
    
     private static View_Mayor view_mayor;
    private static Model_Mayor model_mayor;
    private static Controller_Mayor controller_mayor;
    
    private static View_Ascendente view_ascendente;
    private static Model_Ascendente model_ascendente;
    private static Controller_Ascendente controller_ascendente;
    
    private static ViewEditorTexto vieweditortexto ;
    private static ModelEditorTexto modeleditortexto;
    private static ControllerEditorTexto controllereditortexto;

    public static void main(String[] jagb) {
       viewMessage = new ViewMessage();
       modelMessage = new ModelMessage();
       controllerMessage = new ControllerMessage(viewMessage, modelMessage);
       
       view_op = new ViewOperaciones();
       model_op = new ModelOperaciones();
       controller_op = new ControllerOperaciones(view_op, model_op);
       
       view_mayor= new View_Mayor();
       model_mayor = new Model_Mayor();
       controller_mayor = new Controller_Mayor(model_mayor, view_mayor);
       
       view_ascendente= new View_Ascendente();
       model_ascendente = new Model_Ascendente();
       controller_ascendente = new Controller_Ascendente(view_ascendente, model_ascendente);
       
       vieweditortexto= new ViewEditorTexto();
       modeleditortexto = new ModelEditorTexto();
       controllereditortexto = new ControllerEditorTexto(modeleditortexto, vieweditortexto);
       
       
       viewMain = new ViewMain();
       modelMain = new ModelMain();
       controllerMain = new ControllerMain(viewMain, viewMessage, view_op, view_mayor, view_ascendente,vieweditortexto,modelMain);
    }


}
