/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.votacionespresidenciales.modelos;

/**
 *
 * @author pablo.perez
 */
public class ClsPersona {
    String TipoDocumento;
    String NumeroDocumento;
    String Nombre;
    String Telefono;
    String CiudadOrigen;

    public ClsPersona(String TipoDocumento, String NumeroDocumento, String Nombre, String Telefono, String CiudadOrigen) {
        this.TipoDocumento = TipoDocumento;
        this.NumeroDocumento = NumeroDocumento;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.CiudadOrigen = CiudadOrigen;
    }
}
