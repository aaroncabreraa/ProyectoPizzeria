/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author aaroncabrera396
 */
public class Inventario {
    private Map<Ingrediente, Double> ingredientesDisponibles;

    // Constructor
    public Inventario() {
        ingredientesDisponibles = new HashMap<>();
    }

    // Método para agregar un ingrediente al inventario
    public void agregarIngrediente(Ingrediente ingrediente, double cantidad) {
        ingredientesDisponibles.put(ingrediente, cantidad);
    }

    // Método para actualizar la cantidad de un ingrediente en el inventario
    public void actualizarCantidadIngrediente(Ingrediente ingrediente, double cantidad) {
        if (ingredientesDisponibles.containsKey(ingrediente)) {
            ingredientesDisponibles.put(ingrediente, cantidad);
        }
    }

    // Método para obtener los ingredientes disponibles
    public Map<Ingrediente, Double> getIngredientesDisponibles() {
        return ingredientesDisponibles;
    }
}
