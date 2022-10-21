package co.edu.unab.cuotaadmon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "residentes")
public class ResidentesModel {
    // atributos
    @Id
    @Column(name = "Id_residente")
    private int idResidente;
    @Column(name = "Tipo_doc")
    private String tipoDoc;
    @Column(name = "Numero_doc")
    private int numeroDoc;
    @Column(name = "Nom1")
    private String primerNombre;
    @Column(name = "Nom2")
    private String segundoNombre;
    @Column(name = "Ape1")
    private String primerApellido;
    @Column(name = "Ape2")
    private String segundoApellido;
    @Column(name = "Id_apto")
    private int idApto;
    @Column(name = "Id_rol")
    private int idRol;
    @Column(name = "Telefono")
    private int telefono;
    @Column(name = "Celular")
    private int celular;
    @Column(name = "Correo_e")
    private String correoElectronico;

    // constructore sin argumentos
    public ResidentesModel() {
    }

    // Constructor con argumentos
    public ResidentesModel(int idResidente, String tipoDoc, int numeroDoc, String primerNombre, String segundoNombre,
            String primerApellido, String segundoApellido, int idApto, int idRol, int telefono, int celular,
            String correoElectronico) {
        this.idResidente = idResidente;
        this.tipoDoc = tipoDoc;
        this.numeroDoc = numeroDoc;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.idApto = idApto;
        this.idRol = idRol;
        this.telefono = telefono;
        this.celular = celular;
        this.correoElectronico = correoElectronico;
    }

    // getter and setter

    public int getIdResidente() {
        return idResidente;
    }

    public void setIdResidente(int idResidente) {
        this.idResidente = idResidente;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getNumeroDoc() {
        return numeroDoc;
    }

    public void setNumeroDoc(int numeroDoc) {
        this.numeroDoc = numeroDoc;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public int getIdApto() {
        return idApto;
    }

    public void setIdApto(int idApto) {
        this.idApto = idApto;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

}
