package com.laboratorio;

import java.util.ArrayList;

/*
 * Clase principal
 */
public class Tienda {

    /*
     * Atributos de la clase de la clase e inicializadores para obtener datos de otra clase
     */
    public ArrayList<Empleado> empleados;
    public ArrayList<Cliente> clientes;
    public String name;

    /**
     * Constructor con el atributo de la clase principal
     *
     * @param name
     */
    public Tienda(String name) {
        this.name = name;
    }

    /*
     * Metodo para obtener un dato
     */
    public String getName() {
        return name;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setName(String name) {
        this.name = name;
    }

    /*
     * Constructor con el toString
     */
    @Override
    public String toString() {
        return "Tienda [name=" + name + "]";
    }

    /*
     * Metodo para verificar si exite ya un empleado con el mismo id
     */
    public boolean verificarEmpleado(String id) {
        boolean centinela = false;
        for (Empleado empleado : empleados) {
            if (empleado.getId().equals(id)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
     * Metodo para agregar un nuevo empleado
     */
    public void agregarEmpleado(Empleado empleado) {
        if (!verificarEmpleado(empleado.getName())) {
            empleado.add(empleado);
        }
    }

    /*
     * Metodo para eliminar los datos de un empleado despedido
     */
    public void eliminarBibliotecario(String id) {
        for (Empleado empleado : empleados) {
            if (empleado.getId().equals(id)) {
                empleado.remove(empleado);
                break;

            }
        }
    }

    /*
     * Metodo para verificar si exite ya un cliente con el mismo id
     */
    public boolean verificarCliente(String id) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
     * Metodo para agregar un nuevo cliente
     */
    public void agregarCliente(Cliente cliente) {
        if (!verificarCliente(cliente.getName())) {
            cliente.add(cliente);
        }
    }

    /*
     * Metodo para eliminar los datos de un cliente
     */
    public void eliminarCliente(String id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                cliente.remove(cliente);
                break;

            }
        }
    }

}
