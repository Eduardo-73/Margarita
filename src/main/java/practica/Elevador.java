/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author edu
 */
public class Elevador {

    private static Random random = new Random();

    int serie;
    String fabricante;
    int capPersonas;
    int pesoMax;
    LocalDate fecFabricacion;
    LocalDate fecUltRevision;
    Estado estado;

    public Elevador() {
    }

    public Elevador(String fabricante, int capPersonas, int pesoMax, Estado estado) {
        this.serie = numSerie();
        this.fabricante = fabricante;
        this.capPersonas = capPersonas;
        if (capPersonas >= 0 || capPersonas <= 10) {
            System.out.println("Esta dentro de la capacidad máxima de Personas");
        } else {
            System.out.println("No esta dentro de la capacidad máxima de Personas");
            capPersonas = 0;
        }
        this.pesoMax = pesoMax;
        if (pesoMax >= 0 || pesoMax <= 800) {
            System.out.println("Esta dentro del peso máxima");
        } else {
            System.out.println("No esta dentro del peso máximo");
            pesoMax = 0;
        }
        this.fecFabricacion = fecFabricacion.now();
        this.fecUltRevision = fecUltRevision.now();
        this.estado = estado;
    }

    public static int numSerie() {
        int num;
        return num = random.nextInt(10_000_000, 100_000_000);
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getCapPersonas() {
        return capPersonas;
    }

    public void setCapPersonas(int capPersonas) {
        this.capPersonas = capPersonas;
    }

    public int getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(int pesoMax) {
        this.pesoMax = pesoMax;
    }

    public LocalDate getFecFabricacion() {
        return fecFabricacion;
    }

    public void setFecFabricacion(LocalDate fecFabricacion) {
        this.fecFabricacion = fecFabricacion;
    }

    public LocalDate getFecUltRevision() {
        return fecUltRevision;
    }

    public void setFecUltRevision(LocalDate fecUltRevision) {
        this.fecUltRevision = fecUltRevision;
    }

    @Override
    public String toString() {
        return "Elevador{" + "serie=" + serie + ", fabricante=" + fabricante + ", capPersonas=" + capPersonas + ", pesoMax=" + pesoMax + ", fecFabricacion=" + fecFabricacion + ", fecUltRevision=" + fecUltRevision + ", estado=" + estado + '}';
    }
}
