public class GestionStock{
    public static void main (String args[]){
        Laboratorio laboratorio1 = new Laboratorio("Colgate S.A.", "Scalabrini Ortiz 5524", "54-11-4239-8447");
        Producto producto1 = new Producto(1 ,"Perfumeria" , "Jabón Deluxe" , 5.25 , laboratorio1);
        producto1.ajuste(500);
        producto1.mostrar();
        producto1.ajuste(-200);
        producto1.mostrar();
        System.out.println("precio de lista=" + producto1.precioLista() + "precio al contado=" + producto1.precioContado()); 
    }
}

