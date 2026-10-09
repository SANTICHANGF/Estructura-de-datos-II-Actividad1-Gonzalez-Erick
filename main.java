import java.util.ArrayList;
import java.util.List;

// --- PASO 5: Implementación de la clase NodoGeneral ---
class NodoGeneral<T> {
    private T dato;
    private List<NodoGeneral<T>> hijos;

    // Constructor
    public NodoGeneral(T dato) {
        this.dato = dato;
        this.hijos = new ArrayList<>();
    }

    // Métodos Getter y Setter
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public List<NodoGeneral<T>> getHijos() {
        return hijos;
    }

    // Método para agregar un nodo hijo
    public void agregarHijo(NodoGeneral<T> hijo) {
        this.hijos.add(hijo);
    }
}

// --- PASO 6: Construcción de la jerarquía de la imagen ---
public class Main {
    public static void main(String[] args) {
        // 1. Creación del nodo raíz (Nivel 0)
        NodoGeneral<String> raiz = new NodoGeneral<>("Empresa");

        // 2. Creación de las áreas principales (Nivel 1)
        NodoGeneral<String> tecnologia = new NodoGeneral<>("Tecnología");
        NodoGeneral<String> finanzas = new NodoGeneral<>("Finanzas");
        NodoGeneral<String> talentoHumano = new NodoGeneral<>("Talento Humano");

        // 3. Creación de las subáreas (Nivel 2)
        NodoGeneral<String> desarrollo = new NodoGeneral<>("Desarrollo");
        NodoGeneral<String> soporte = new NodoGeneral<>("Soporte");
        
        NodoGeneral<String> contabilidad = new NodoGeneral<>("Contabilidad");
        NodoGeneral<String> tesoreria = new NodoGeneral<>("Tesorería");
        
        NodoGeneral<String> seleccion = new NodoGeneral<>("Selección");

        // 4. Enlace del Nivel 0 al Nivel 1 (Hijos de Empresa)
        raiz.agregarHijo(tecnologia);
        raiz.agregarHijo(finanzas);
        raiz.agregarHijo(talentoHumano);

        // 5. Enlace del Nivel 1 al Nivel 2 (Subáreas de Tecnología)
        tecnologia.agregarHijo(desarrollo);
        tecnologia.agregarHijo(soporte);

        // Enlace de subáreas de Finanzas
        finanzas.agregarHijo(contabilidad);
        finanzas.agregarHijo(tesoreria);

        // Enlace de subárea de Talento Humano
        talentoHumano.agregarHijo(seleccion);

        // 6. Mostrar el árbol en la consola
        System.out.println("--- ORGANIGRAMA DE LA EMPRESA ---");
        imprimirArbol(raiz, "");
    }

    /**
     * Método auxiliar recursivo para imprimir el árbol de manera visual.
     */
    public static void imprimirArbol(NodoGeneral<String> nodo, String prefijo) {
        if (nodo == null) return;
        
        System.out.println(prefijo + "└── " + nodo.getDato());
        for (NodoGeneral<String> hijo : nodo.getHijos()) {
            imprimirArbol(hijo, prefijo + "    ");
        }
    }
}
