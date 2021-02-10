package com.BaseDeDatos;

/**
 *
 * @author Juanchope
 * @version 1.0
 */
public class Campo {
    
    public static final String 
            TIPO_ENTEROLARGO         = " bigint ",
            TIPO_TEXTO               = " text ",
            TIPO_ARREGLODETEXTO      = " text[] ",
            TIPO_OBJECTO             = " bytea ",
            TIPO_REAL                = " float8 ",
            TIPO_BOOLEANO            = " bool ",
            TIPO_SERIAL              = " BIGSERIAL ",
            TIPO_CARACTER            = " char ";
    
    private final String 
            NOMBRE,
            TIPO,
            PROPIEDADES;
    
    private static final String
            PROPIEDAD_LLAVE_PRIMARIA = " PRIMARY KEY ";

    private Object 
            valor;   
    
    private int
            longitud;
    
    private boolean 
            llavePrimaria;

    public Campo(String nombre) {
        this.NOMBRE = nombre;
        this.TIPO = "";
        this.PROPIEDADES = "";
    }

    public Campo(String nombre, Object valor) {
        this.NOMBRE = nombre;
        this.valor = valor;
        this.TIPO = null;
        this.PROPIEDADES = "";
    }
    
    public  Campo(String nombre, String tipo, boolean llaveprimaria){
        this.NOMBRE = nombre;
        this.llavePrimaria = llaveprimaria;
        this.TIPO = tipo;
        this.PROPIEDADES = "";
    }
    
    public  Campo(String nombre, String tipo, int longitud){
        this.NOMBRE = nombre;
        this.TIPO = tipo;
        this.PROPIEDADES = "";
        this.longitud = longitud;
    }
    
    public  Campo(String nombre, String tipo, String propiedades){
        this.NOMBRE = nombre;
        this.TIPO = tipo;
        this.PROPIEDADES = propiedades;
    }

    public Object getValor() {
        return valor;
    }

    public String getNombre() {
        return NOMBRE;
    }

    public String getTipo() {
        return TIPO;
    }

    public String getPropiedades() {
        return PROPIEDADES;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public boolean isLlavePrimaria() {
        return llavePrimaria;
    }

    public void setLlavePrimaria(boolean llavePrimaria) {
        this.llavePrimaria = llavePrimaria;
    }

    @Override
    public String toString() {
        return "* Campo: " + NOMBRE + 
                "\n+TIPO: " + TIPO + 
                "\n+PROPIEDADES: " + PROPIEDADES + 
                "\n+valor: " + valor;
    }

    String getCampoToString() {
        return NOMBRE + " " + TIPO + " " + PROPIEDADES;
    }

    boolean isValor() {
        return valor != null;
    }
        
}
