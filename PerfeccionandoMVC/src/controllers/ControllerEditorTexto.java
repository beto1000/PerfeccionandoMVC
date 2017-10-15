package controllers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import models.ModelEditorTexto;
import views.ViewEditorTexto;



public final class ControllerEditorTexto {
    private FileWriter file_writer = null;
    private FileReader file_reader = null;
    private final JFileChooser file_chooser = new JFileChooser();
    private final ModelEditorTexto modeleditortexto;
    private final ViewEditorTexto vieweditortexto;
    
    public ControllerEditorTexto(ModelEditorTexto model_editor_texto, ViewEditorTexto view_editor_texto){
        this.modeleditortexto = model_editor_texto;
        this.vieweditortexto = view_editor_texto;
        initView();
    }

    
    public void initView(){
        vieweditortexto.jbtn_abrir.addActionListener(e -> jbtn_abrirMouseClicked());
        vieweditortexto.jbtn_guardar.addActionListener(e -> jbtn_guardarMouseClicked());
    }
    
    public void jbtn_abrirMouseClicked(){
                try{
            file_chooser.showOpenDialog(vieweditortexto);
            modeleditortexto.setArchivo(file_chooser.getSelectedFile());
            file_reader = new FileReader(modeleditortexto.getArchivo());
            int character = 0;
            String content = "";
            while((character = file_reader.read()) != -1){
                content += (char) character;
            }
            file_reader.close();
            System.out.println(content);
            vieweditortexto.jta_area_trabajo.setText(content);
        }
        catch(FileNotFoundException err){
            System.err.println("Archivo no encontrado");
        }
        catch(IOException err){
            System.err.println("Error en el archivo");
        }
        finally{
            try{
                file_reader.close();
            }
            catch(IOException err){
                System.err.println("Error al cerrar");
            }
        }
    }
    
    public void jbtn_guardarMouseClicked(){
        try{
        file_writer = new FileWriter(modeleditortexto.getArchivo(),false);
        file_writer.write(vieweditortexto.jta_area_trabajo.getText());
        file_writer.close();
        
        }
        catch(FileNotFoundException err){
            System.err.println("Archivo no Encontrado");
        }
        catch(IOException err){
            System.err.println("Error en el archivo");
        }
        
    }  
}