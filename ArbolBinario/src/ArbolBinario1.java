public class ArbolBinario1 {
    public static void main (String[] args){


Node a = new Node(1);
Node b = new Node(2);
Node c = new Node(3);
Node d = new Node(4);
Node e = new Node(5);
Node f = new Node(6);
Node g = new Node(7);
Node h = new Node(8);
Node i = new Node(9);
Node j = new Node(10);

 
a.left =b;
a.right=c;
b.left=d;
b.right=e;
c.right=f;
c.left=g;
d.left=h;
d.right=i;
e.right=j;

System.out.println("Metodo de recorrida Pre-orden"); //En el metodo de preorden lo primero que se imprimira sera el nodo actual(1er nodo) que en este caso es uno, posteriormente se imprimira todos los subarboles izquierdos, despues se van poniendo los subarboles derechos de abajo hacia arriba, despues se va al subarbol derecho posterior al nodo principal y hace el mismo recorrido. 
preorden(a);

System.out.println("Metodo de recorrida In-orden"); //Primero se va al ultimo subarbol izquierdo y se imprimen los nodos izquierdos y despues los subnodos derechos. Repite el mismo proceso hasta acabar
inorden(a);

System.out.println("Metodo de recorrida Post-orden"); //Empieza como el metodo in-orden, pero en este imprime el subnodo izquerdo despues el derecho y pasa al siguiente repitiendo el mismoo proceso, posteriormente hace lo mismo con el subarbol derecho, poniendo como ultimo el nodo principal
postorden(a);


}

// En este metodo primero se imprime el nodo del valor catual, despues el subarbol izquierdo y por ultimo el derecho
public static void preorden(Node node){
if(node != null){
    System.out.println(node.value + "");
    preorden(node.left);
    preorden(node.right);
}
}
// Primero se visita el ultimo subarbol izquierdo, y luego se vuelve al nodo actual, y por ultimo el subarbol izquierdo
public static void inorden(Node node){
    if (node != null) {
        inorden(node.left);
        System.out.println(node.value + " ");
        inorden(node.right);
    }
}

//Se va primero al final del subarbol izquierdo, luego al subarbol derecho y por ultimo al nodo actual
public static void postorden(Node node){
    if (node != null) {
        postorden(node.left);
        postorden(node.right);
        System.out.println(node.value + " ");
    }
}

}