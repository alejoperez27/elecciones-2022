/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.votacionespresidenciales.modelos;

/**
 *
 * @author pablo.perez
 */
public class ClsCandidato extends ClsPersona {

    String PartidoPolitico;
    String MensajeCampaña;
    String Descripcion;
    String Propuestas;

    public ClsCandidato(ClsPersona persona, String PartidoPolitico, String MensajeCampaña, String Descripcion, String Propuestas) {
        super(persona.TipoDocumento, persona.NumeroDocumento, persona.Nombre, persona.Telefono, persona.CiudadOrigen);
        this.PartidoPolitico = PartidoPolitico;
        this.MensajeCampaña = MensajeCampaña;
        this.Descripcion = Descripcion;
        this.Propuestas = Propuestas;
    }
    
    
}
