package controllers;
import views.View_Ascendente;
import models.Model_Ascendente;

public final class Controller_Ascendente {
    private final View_Ascendente view_ascendente;
    private final Model_Ascendente model_ascendente;

    
    
    public Controller_Ascendente(View_Ascendente view_ascendente, Model_Ascendente model_ascendente){
        this.view_ascendente = view_ascendente;
        this.model_ascendente = model_ascendente;
        initView();
    }
    
    public void initView(){
        view_ascendente.jtf_insertar_numero.setText("" + model_ascendente.getValor_Insertado());
        view_ascendente.jbtn_insertar_numero.addActionListener(e -> jbtn_insertar_numeroMouseClicked());
        view_ascendente.jbtn_ascendente.addActionListener(e -> jbtn_ascendenteMouseClicked());
        view_ascendente.jbtn_promedio.addActionListener(e -> jbtn_promedioMouseClicked());
        model_ascendente.Crear_Modelo_Lista();
        view_ascendente.jli_lista_numeros.setModel(model_ascendente.getModelo_Lista_Numeros());
    }
    
    public void jbtn_insertar_numeroMouseClicked(){
        model_ascendente.setValor_Insertado(Double.parseDouble(view_ascendente.jtf_insertar_numero.getText()));
        model_ascendente.Insertar_Valor(model_ascendente.getValor_Insertado());
    }
    
    public void jbtn_ascendenteMouseClicked(){
        model_ascendente.Ordenar_Ascendente();
        view_ascendente.jli_lista_numeros.setModel(model_ascendente.getModelo_Lista_Numeros());
    }
    
    public void jbtn_promedioMouseClicked(){
        model_ascendente.Promediar_Lista();
        view_ascendente.jl_promedio.setText("" + model_ascendente.getPromedio());
    }
    
}