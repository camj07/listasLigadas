// Clase que representa una lista enlazada
public class linkedList {

    // "head" apunta al primer nodo de la lista
    private Node head;

    // "tail" apunta al último nodo de la lista
    private Node tail;

    // Guarda la cantidad de nodos que tiene la lista
    private int length;


    // ---------------------------------------------------------
    // CLASE NODE
    // ---------------------------------------------------------

    // Cada Node representa un elemento de la lista
    class Node {

        // Valor que almacena el nodo
        int value;

        // Referencia al siguiente nodo
        Node next;

        // Constructor del nodo
        public Node(int value) {
            this.value = value;
        }
    }


    // ---------------------------------------------------------
    // CONSTRUCTOR CON UN VALOR INICIAL
    // ---------------------------------------------------------

    // Crea una lista que comienza con un nodo
    public linkedList(int value) {

        // Se crea el primer nodo
        Node newNode = new Node(value);

        // La lista comienza con un elemento
        length = 1;

        // El primer nodo es el head
        head = newNode;

        // Como solo hay un nodo, también es el tail
        tail = newNode;
    }


    // ---------------------------------------------------------
    // CONSTRUCTOR VACÍO
    // ---------------------------------------------------------

    // Crea una lista inicialmente vacía
    public linkedList() {
        length = 0;
    }


    // ---------------------------------------------------------
    // MÉTODOS PARA PROBAR isCycle()
    // ---------------------------------------------------------

    // Crea un ciclo haciendo que el último nodo
    // vuelva a apuntar al primero
    public void createCycle() {
        tail.next = head;
    }

    // Elimina el ciclo haciendo que el último nodo
    // deje de apuntar al primero
    public void destroyCycle() {
        tail.next = null;
    }


    // ---------------------------------------------------------
    // MOSTRAR HEAD
    // ---------------------------------------------------------

    // Muestra el valor del primer nodo
    public void getHead() {
        System.out.println("Head:" + head.value);
    }


    // ---------------------------------------------------------
    // MOSTRAR TAIL
    // ---------------------------------------------------------

    // Muestra el valor del último nodo
    public void getTail() {
        System.out.println("Tail:" + tail.value);
    }


    // ---------------------------------------------------------
    // MOSTRAR LENGTH
    // ---------------------------------------------------------

    // Muestra la cantidad de nodos de la lista
    public void getLength() {
        System.out.println("Length:" + length);
    }


    // ---------------------------------------------------------
    // APPEND
    // ---------------------------------------------------------

    // Agrega un nuevo nodo al final de la lista
    public void append(int value) {

        // Si la lista está vacía
        if (length == 0) {

            // Se crea el nuevo nodo
            Node newNode = new Node(value);

            // Ahora la lista tiene un elemento
            length = 1;

            // El nuevo nodo es el primero
            head = newNode;

            // También es el último
            tail = newNode;

            return;
        }

        // Se crea un nuevo nodo
        Node newNode = new Node(value);

        // El último nodo apunta al nuevo nodo
        tail.next = newNode;

        // El nuevo nodo se convierte en el último
        tail = newNode;

        // Aumenta la cantidad de nodos
        length++;
    }


    // ---------------------------------------------------------
    // PRINTLIST
    // ---------------------------------------------------------

    // Imprime todos los valores de la lista
    public void printList() {

        // Comienza desde el primer nodo
        Node temp = head;

        // Recorre la lista mientras existan nodos
        while (temp != null) {

            // Imprime el valor del nodo actual
            System.out.print(temp.value + " ");

            // Avanza al siguiente nodo
            temp = temp.next;
        }

        // Salto de línea
        System.out.println();
    }


    // ---------------------------------------------------------
    // REMOVE LAST
    // ---------------------------------------------------------

    // Elimina el último nodo de la lista
    public Node removeLast() {

        // Si la lista está vacía, no hay nada que eliminar
        if (length == 0) return null;

        // temp recorre la lista
        Node temp = head;

        // pre guarda el nodo anterior
        Node pre = head;

        // Busca el último nodo
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }

        // El nodo anterior se convierte en tail
        tail = pre;

        // El nuevo último nodo ya no apunta a otro nodo
        tail.next = null;

        // Disminuye la cantidad de nodos
        length--;

        // Si la lista quedó vacía
        if (length == 0) {
            head = null;
            tail = null;
        }

        // Regresa el nodo que fue eliminado
        return temp;
    }


    // ---------------------------------------------------------
    // PREPEND
    // ---------------------------------------------------------

    // Agrega un nodo al principio de la lista
    public void prepend(int value) {

        // Si la lista está vacía
        if (length == 0) {

            Node newNode = new Node(value);

            length = 1;
            head = newNode;
            tail = newNode;

            return;
        }

        // Se crea un nuevo nodo
        Node newHead = new Node(value);

        // El nuevo nodo apunta al antiguo primero
        newHead.next = head;

        // El nuevo nodo se convierte en head
        head = newHead;

        // Aumenta la cantidad de nodos
        length++;
    }


    // ---------------------------------------------------------
    // REMOVE FIRST
    // ---------------------------------------------------------

    // Elimina el primer nodo
    public Node removeFirst() {

        // Si la lista está vacía, no devuelve nada
        if (length == 0) return null;

        // Guarda el nodo que se eliminará
        Node removed = head;

        // El segundo nodo se convierte en el primero
        head = removed.next;

        // Regresa el nodo eliminado
        return removed;
    }


    // ---------------------------------------------------------
    // GET
    // ---------------------------------------------------------

    // Obtiene el nodo que está en una determinada posición
    public Node get(int index) {

        // Comienza desde head
        Node temp = head;

        // Recorre hasta llegar al índice indicado
        for (int i = 0; i < index; i++) {

            // Si no existe el nodo, devuelve null
            if (temp == null) {
                return null;
            }

            // Avanza al siguiente nodo
            temp = temp.next;
        }

        // Devuelve el nodo encontrado
        return temp;
    }


    // ---------------------------------------------------------
    // SET
    // ---------------------------------------------------------

    // Cambia el valor de un nodo
    public boolean set(int index, int value) {

        // Comienza desde head
        Node temp = head;

        // Busca la posición indicada
        for (int i = 0; i < index; i++) {

            // Si no existe la posición
            if (temp == null) {
                return false;
            }

            // Avanza al siguiente nodo
            temp = temp.next;
        }

        // Cambia el valor del nodo
        temp.value = value;

        // Indica que la operación fue exitosa
        return true;
    }


    // ---------------------------------------------------------
    // INSERT
    // ---------------------------------------------------------

    // Inserta un nuevo nodo en una posición determinada
    public boolean insert(int index, int value) {

        // temp recorre la lista
        Node temp = head;

        // pre guarda el nodo anterior
        Node pre = head;

        // Busca la posición donde se insertará
        for (int i = 0; i < index; i++) {

            // Si no existe la posición
            if (temp == null) return false;

            // Guarda el nodo actual como anterior
            pre = temp;

            // Avanza al siguiente nodo
            temp = temp.next;
        }

        // Crea el nuevo nodo
        Node newNode = new Node(value);

        // El nuevo nodo apunta al nodo que estaba en esa posición
        newNode.next = temp;

        // El nodo anterior apunta al nuevo nodo
        pre.next = newNode;

        // Indica que la operación fue exitosa
        return true;
    }


    // ---------------------------------------------------------
    // REMOVE
    // ---------------------------------------------------------

    // Elimina un nodo según su posición
    public Node remove(int index) {

        // temp recorre la lista
        Node temp = head;

        // pre guarda el nodo anterior
        Node pre = head;

        // Busca el nodo que se eliminará
        for (int i = 0; i < index; i++) {

            // Si no existe el nodo
            if (temp == null) return null;

            // Guarda el nodo anterior
            pre = temp;

            // Avanza al siguiente nodo
            temp = temp.next;
        }

        // Guarda el nodo que está después del que se eliminará
        Node nexter = temp.next;

        // El nodo anterior ahora apunta al siguiente
        pre.next = nexter;

        // Devuelve el nodo eliminado
        return temp;
    }


    // ---------------------------------------------------------
    // GET MIDDLE
    // ---------------------------------------------------------

    // Obtiene el nodo que se encuentra en medio de la lista
    public Node getMiddle() {

        // Si la lista está vacía, devuelve null
        if (head == null) return null;

        // a avanza de uno en uno
        Node a = head;

        // b avanza de dos en dos
        Node b = head;

        // Cuando b llega al final, a estará en el medio
        while (b != null && b.next != null) {

            a = a.next;
            b = b.next.next;
        }

        // Devuelve el nodo central
        return a;
    }


    // ---------------------------------------------------------
    // ISCYCLE
    // ---------------------------------------------------------

    // Comprueba si la lista tiene un ciclo
    public boolean isCycle() {

        // Una lista vacía no tiene ciclo
        if (head == null) return false;

        // a avanza un nodo a la vez
        Node a = head;

        // b avanza dos nodos a la vez
        Node b = head;

        // Continúa mientras b pueda avanzar
        while (b != null && b.next != null) {

            a = a.next;
            b = b.next.next;

            // Si ambos se encuentran, existe un ciclo
            if (a == b) return true;
        }

        // Si no se encontraron, no existe ciclo
        return false;
    }


    // ---------------------------------------------------------
    // REVERSE
    // ---------------------------------------------------------

    // Invierte el orden de la lista
    public void reverse() {

        // Si tiene 0 o 1 elemento, no es necesario invertirla
        if (length <= 1) return;

        // Guarda temporalmente el head original
        Node aux = head;

        // El antiguo tail se convierte en el nuevo head
        head = tail;

        // El antiguo head se convierte en el nuevo tail
        tail = aux;

        // Variable que representa el nodo anterior
        Node p2 = null;

        // Variable que representa el siguiente nodo
        Node p3 = null;

        // Recorre todos los nodos
        while (aux != null) {

            // Guarda el siguiente nodo
            p3 = aux.next;

            // Invierte la dirección del enlace
            aux.next = p2;

            // Avanza p2 al nodo actual
            p2 = aux;

            // Avanza aux al siguiente nodo
            aux = p3;
        }
    }
}