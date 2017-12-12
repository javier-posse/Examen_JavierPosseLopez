package com.example.javier.examen_javierposselopez;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Javier on 12/12/2017.
 */

public class Producto implements Serializable {
    private int id;
    private String nombreProducto;
    private int imagen;
    private double precio;
    private String descripcion;
    private ArrayList<Integer> galeriaImagenes;

    public Producto(int id, String nombreProducto, int imagen, double precio, String descripcion, ArrayList<Integer> galeriaImagenes) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.imagen = imagen;
        this.precio = precio;
        this.descripcion = descripcion;
        this.galeriaImagenes = galeriaImagenes;
    }

    public int getId() {
        return id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getImagen() {
        return imagen;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArrayList<Integer> getGaleriaImagenes() {
        return galeriaImagenes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setGaleriaImagenes(ArrayList<Integer> galeriaImagenes) {
        this.galeriaImagenes = galeriaImagenes;
    }
}
