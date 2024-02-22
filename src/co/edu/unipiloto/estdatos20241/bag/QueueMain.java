package co.edu.unipiloto.estdatos20241.bag;

public class QueueMain {

    public static void main(String[] args) {
        
        //Crear la cola
        Queue<String> miCola = new Queue<>(4);
        System.out.println("La cola esta vacia? " + miCola.isEmpty());
        //encolar
        miCola.add("Juan");
        miCola.add("Pedro");
        miCola.add("Luis");
        //Consulata si esta vacia y tamaño
        System.out.println("La cola esta vacia? " + miCola.isEmpty());
        System.out.println("El tamano de la cola " + miCola.size());

        int i = 0;
        for (String s : miCola) {
            if (i < miCola.size()) {
                System.out.println("POs " +i+ " "+s);
                i++;
            } else {
                break;
            }
        }
        //Desencola un elemento de la clase
        System.out.println("Atiende " + miCola.dequeue());
        i=0;
        for (String s : miCola) {
            if (i < miCola.size()) {
                System.out.println(s);
                i++;
            } else {
                break;
            }
        }
        
        
}

}

 

