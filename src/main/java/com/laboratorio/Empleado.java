package com.laboratorio;

/*
 * Clase empleado para construir un obtejo con datos especificos
 */
public class Empleado {

    /*
     * Atributos de la clase
     */
    public String name, id;
    public double salary;

    /**
     * Constructor con los atributos de la clase
     *
     * @param id
     * @param name
     * @param salary
     */
    public Empleado(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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
    public double getSalary() {
        return salary;
    }

    /*
     * Set para obtener un dato
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /*
     * Constructor con el toString
     */
    @Override
    public String toString() {
        return "Empleado [name=" + name + ", id=" + id + ", salary=" + salary + "]";
    }

}
