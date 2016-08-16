import java.util.List;

/**
 * Created by gpaez on 15/8/2016.
 */
public class BusquedaBinaria{


    public static  boolean busquedaBinaria(List<Integer> elementos, int valor) {
        if (elementos == null)
            return  false;

        int mitad = (elementos.size()-1)/2;
        if (elementos.size() == 1){
            return elementos.get(0) == valor;
        }
        else if (valor > elementos.get(mitad)){
            return busquedaBinaria(elementos.subList(mitad+1,elementos.size()),valor);
        }
        else{
            return busquedaBinaria(elementos.subList(0, mitad+1),valor);
        }
    }
}
