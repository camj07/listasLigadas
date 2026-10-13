public class Main {

    public static void main(String[] args) {

        // Se crea una nueva lista enlazada llamada "ll"
        // El valor 5 representa el primer nodo de la lista.
        linkedList ll = new linkedList(5);

        // Se agregan elementos al final de la lista.
        // La lista queda: 5 -> 10 -> 20 -> 30
        ll.append(10);
        ll.append(20);
        ll.append(30);

        
        // ---------------------------------------------------------
        // PRUEBA DEL MÉTODO prepend()
        // ---------------------------------------------------------

        // Se muestra el nombre de la operación que se probará.
        System.out.println("Prueba de prepend(5)");

        // Se muestra la lista antes de agregar el elemento.
        System.out.println("Lista antes:");
        ll.printList();

        // prepend() agrega un nuevo nodo al inicio de la lista.
        // La lista queda: 5 -> 5 -> 10 -> 20 -> 30
        ll.prepend(5);

        // Se muestra la lista después de agregar el elemento.
        System.out.println("Lista despues:");
        ll.printList();

        // Salto de línea para separar las pruebas.
        System.out.println();


        // ---------------------------------------------------------
        // PRUEBA DEL MÉTODO removeFirst()
        // ---------------------------------------------------------

        System.out.println("Prueba de removeFirst()");

        // Se muestra la lista antes de eliminar el primer nodo.
        System.out.println("Lista antes:");
        ll.printList();

        // removeFirst() elimina el primer nodo de la lista.
        // .value obtiene el valor del nodo que fue eliminado.
        System.out.println("Nodo removido: " + ll.removeFirst().value);

        // Se muestra la lista después de eliminar el nodo.
        System.out.println("Lista despues:");
        ll.printList();

        System.out.println();


        // ---------------------------------------------------------
        // PRUEBA DEL MÉTODO get()
        // ---------------------------------------------------------

        System.out.println("Prueba de get()");

        // Se muestra la lista completa.
        System.out.println("Lista entera:");
        ll.printList();

        // get(3) busca el nodo que se encuentra en la posición 3.
        // .value obtiene el valor almacenado en ese nodo.
        System.out.println("Obtener el 3: " + ll.get(3).value);

        System.out.println();


        // ---------------------------------------------------------
        // PRUEBA DEL MÉTODO set()
        // ---------------------------------------------------------

        System.out.println("Prueba de set()");

        // Se muestra la lista antes de modificar un elemento.
        System.out.println("Lista antes de set(2, 2)");
        ll.printList();

        // set(2, 2) cambia el valor del nodo que está
        // en la posición 2 por el valor 2.
        ll.set(2, 2);

        // Se muestra la lista después de modificar el elemento.
        System.out.println("Lista despues:");
        ll.printList();

        System.out.println();


        // ---------------------------------------------------------
        // PRUEBA DEL MÉTODO insert()
        // ---------------------------------------------------------

        System.out.println("Prueba de insert()");

        // Se muestra la lista antes de insertar un elemento.
        System.out.println("Lista antes de insert(1,4)");
        ll.printList();

        // insert(1, 4) inserta el valor 4 en la posición 1.
        ll.insert(1, 4);

        // Se muestra la lista después de insertar el nuevo nodo.
        System.out.println("Lista despues:");
        ll.printList();

        System.out.println();


        // ---------------------------------------------------------
        // PRUEBA DEL MÉTODO remove()
        // ---------------------------------------------------------

        System.out.println("Prueba de remove()");

        // Se muestra la lista antes de eliminar un elemento.
        System.out.println("Lista antes de remove(2)");
        ll.printList();

        // remove(2) elimina el nodo que está en la posición 2.
        // .value muestra el valor del nodo eliminado.
        System.out.println("Nodo removido: " + ll.remove(2).value);

        // Se muestra la lista después de eliminar el nodo.
        System.out.println("Lista despues:");
        ll.printList();

        System.out.println();


        // ---------------------------------------------------------
        // PRUEBA DEL MÉTODO getMiddle()
        // ---------------------------------------------------------

        System.out.println("Prueba de getMiddle()");

        // Se muestra la lista actual.
        System.out.println("Lista:");
        ll.printList();

        // getMiddle() obtiene el nodo que se encuentra
        // en el centro de la lista.
        System.out.println("Valor del medio: " + ll.getMiddle().value);

        // Se agrega el valor 80 al final de la lista.
        System.out.println("append(80)");
        ll.append(80);

        // Se muestra la lista después de agregar 80.
        System.out.println("Lista:");
        ll.printList();

        // Se vuelve a obtener el nodo central.
        // Al cambiar la cantidad de elementos, puede cambiar
        // cuál es considerado el nodo del medio.
        System.out.println("Valor del medio: " + ll.getMiddle().value);

        System.out.println();


        // ---------------------------------------------------------
        // PRUEBA DEL MÉTODO isCycle()
        // ---------------------------------------------------------

        System.out.println("Prueba de isCycle()");

        // Se verifica si la lista tiene un ciclo.
        // En este momento no debería tenerlo.
        System.out.println(
            "Antes de createCycle(), es ciclo? " + ll.isCycle()
        );

        // createCycle() crea un ciclo dentro de la lista.
        // Esto hace que un nodo vuelva a apuntar a uno anterior.
        ll.createCycle();

        // Se vuelve a comprobar si existe un ciclo.
        // Ahora debería devolver true.
        System.out.println(
            "Despues de createCycle(), es ciclo? " + ll.isCycle()
        );

        // destroyCycle() elimina el ciclo creado anteriormente
        // para dejar nuevamente la lista en condiciones normales.
        ll.destroyCycle();

        System.out.println();


        // ---------------------------------------------------------
        // PRUEBA DEL MÉTODO reverse()
        // ---------------------------------------------------------

        System.out.println("Prueba de reverse()");

        // Se muestra la lista antes de invertirla.
        System.out.println("Lista antes de reverse():");
        ll.printList();

        // reverse() invierte el orden de todos los nodos.
        // Por ejemplo: 10 -> 20 -> 30
        // se convierte en: 30 -> 20 -> 10
        ll.reverse();

        // Se muestra la lista después de invertirla.
        System.out.println("Lista despues de reverse():");
        ll.printList();

        System.out.println();
    }
}