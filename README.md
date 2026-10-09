# 01 - Introducción a los árboles

**Asignatura:** Estructura de Datos II – Ingeniería de Software, IV semestre
**Estudiante:** _(tu nombre)_

## Contenido de la carpeta

- `NodoGeneral.java`: clase genérica con un dato y una lista de hijos.
- `Main.java`: construye una jerarquía de 9 nodos y 3 niveles y la imprime en consola.
- `organigrama.drawio`: diagrama del organigrama modelado como árbol.

## Clasificación de los cuatro escenarios

| Escenario | Clasificación | Justificación |
|---|---|---|
| Sistema de archivos | Jerárquico | Cada carpeta o archivo tiene una sola carpeta padre y cada carpeta puede tener muchos hijos. Los accesos directos o enlaces simbólicos podrían volverlo mixto, pero la estructura base es un árbol. |
| Organigrama | Jerárquico | Hay una raíz (la gerencia) y cada cargo o área depende de un único superior. En una organización matricial, donde alguien responde a dos jefes, dejaría de ser un árbol puro. |
| Menú de aplicación | Mixto | Es jerárquico porque las opciones contienen submenús anidados, pero también tiene un orden lineal de aparición entre las opciones de cada nivel. |
| Árbol genealógico | Mixto | Tiene forma de jerarquía por generaciones, pero cada persona tiene dos padres, así que no cumple la regla de un solo padre y se modela mejor como grafo. |

## Ejecución

```bash
javac *.java
java Main
```

## Ejercicios

**Dos ventajas de un árbol frente a una lista**

1. Representa la relación padre-hijo de forma directa: para saber qué depende de un nodo basta con recorrer sus hijos, sin revisar todos los elementos.
2. Permite organizar los datos por niveles y procesar subárboles completos (por ejemplo, todo el área de Tecnología) de forma natural y recursiva.

**¿Qué pasaría si un nodo pudiera tener más de un padre?**

Dejaría de cumplirse la definición de árbol: aparecerían múltiples caminos hacia un mismo nodo e incluso posibles ciclos, y la estructura pasaría a ser un grafo. Esto cambia el modelo porque ya no existe una jerarquía única; los recorridos podrían visitar un nodo varias veces y habría que llevar control de los nodos visitados.

## Reflexión

Trabajar esta guía me permitió ver que las listas, pilas y colas son útiles cuando los datos tienen un orden secuencial, pero se quedan cortas cuando un elemento se relaciona con varios descendientes. En el organigrama, por ejemplo, una lista obligaría a recorrer todos los elementos para saber qué áreas dependen de Tecnología, mientras que en un árbol basta con consultar los hijos de ese nodo. Además, la jerarquía se ve de forma natural: cada nodo tiene un único padre y la raíz representa el punto de partida.

También entendí que no todos los escenarios son árboles puros. El árbol genealógico, donde cada persona tiene dos padres, o un organigrama matricial, donde alguien responde a dos jefes, rompen la regla de un solo padre y se modelan mejor con grafos.

Implementar NodoGeneral con genéricos me mostró que una sola clase puede representar cualquier jerarquía, y que la recursión es la forma más natural de recorrerla, porque cada subárbol tiene la misma estructura que el árbol completo.
