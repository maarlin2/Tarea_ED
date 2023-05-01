/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tarea_ED;

/**
 *
 * @author ED05
 */
public class CCuenta {

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    // Propiedades de la Clase Cuenta
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /* Constructor sin argumentos */

    /**
     *
     */

    public CCuenta ()
    {
    }
    // Constructor con parámetro para iniciar todas las propiedades de la clase

    /**
     *
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre=nom;
        cuenta=cue;
        saldo=sal;
    }
   // Método para asignar el nombre del titular de la cuenta

    /**
     *
     * @param nom
     */
    public void setNombre(String nom)
    {
        nombre=nom;
    }
    // Método que me devuelve el nombre del titular

    /**
     *
     * @return
     */
    public String getNombre()
    {
        return nombre;
    }

    // Método que me devuelve el saldo disponible en cada momento

    /**
     *
     * @return
     */
     public double getEstado ()
    {
        return getSaldo();
    }

    /* Método para ingresar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */

    /**
     *
     * @param cantidad
     * @throws Exception
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }



    /* Método para retirar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */

    /**
     *
     * @param cantidad
     * @throws Exception
     */

    public void retirar (double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getEstado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    // Método que me devuelve el número de cuenta

    /**
     *
     * @return
     */
    public String getCuenta ()
    {
        return cuenta;
    }
}
