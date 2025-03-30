package com.laboratorio;

/*
 * Clase cliente para crear un objeto con datos especificos
 */
public class Cliente {

    /*
     * Atributos de la clase
     */
    public String name, id, address;
    public int edad;

    /**
     * Constructor de la clase con sus atributos
     *
     * @param address
     * @param edad
     * @param id
     * @param name
     */
    public Cliente(String address, int edad, String id, String name) {
        this.address = address;
        this.edad = edad;
        this.id = id;
        this.name = name;
    }

    /*
     * Get para modificar un dato
     */
    public String getName() {
        return name;
    }

    /*
     * Set para obtener un dato
     */
    public void setName(String name) {
        this.name = name;
    }

    /*
     * Get para modificar un dato
     */
    public String getId() {
        return id;
    }

    /*
     * Set para obtener un dato
     */
    public void setId(String id) {
        this.id = id;
    }

    /*
     * Get para modificar un dato
     */
    public String getAddress() {
        return address;
    }

    /*
     * Set para obtener un dato
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /*
     * Get para modificar un dato
     */
    public int getEdad() {
        return edad;
    }

    /*
     * Set para obtener un dato
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /*
     * Constructor con el toString
     */
    @Override
    public String toString() {
        return "Cliente [name=" + name + ", id=" + id + ", address=" + address + ", edad=" + edad + "]";
    }

}
