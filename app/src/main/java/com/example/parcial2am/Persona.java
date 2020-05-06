package com.example.parcial2am;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Persona implements Parcelable, Serializable {

    private String cedula;
    private String nombre;
    private int estrato;
    private float salario;
    private String nivel_edu;

    public Persona(String cedula, String nombre, int estrato, float salario, String nivel_edu) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.estrato = estrato;
        this.salario = salario;
        this.nivel_edu = nivel_edu;
    }

    protected Persona(Parcel in) {
        cedula = in.readString();
        nombre = in.readString();
        estrato = in.readInt();
        salario = in.readFloat();
        nivel_edu = in.readString();
    }

    public static final Creator<Persona> CREATOR = new Creator<Persona>() {
        @Override
        public Persona createFromParcel(Parcel in) {
            return new Persona(in);
        }

        @Override
        public Persona[] newArray(int size) {
            return new Persona[size];
        }
    };

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNivel_edu() {
        return nivel_edu;
    }

    public void setNivel_edu(String nivel_edu) {
        this.nivel_edu = nivel_edu;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", estrato=" + estrato +
                ", salario=" + salario +
                ", nivel_edu='" + nivel_edu + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(cedula);
        dest.writeString(nombre);
        dest.writeInt(estrato);
        dest.writeFloat(salario);
        dest.writeString(nivel_edu);
    }
}
