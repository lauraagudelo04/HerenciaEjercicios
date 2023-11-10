package antivirus.dominio;

import java.util.ArrayList;
import java.util.List;

public class Antivirus {
    private List<Viruseable> archivos;

    public Antivirus(){
        this.archivos=new ArrayList<>();
    }

    public void escanear(){
        int numeroDeVirus=0;
        for (Viruseable archivo : this.archivos) {
            if (archivo.tieneVirus()){
                numeroDeVirus++;
                System.out.println(String.format("%s tiene virus.",archivo.getNombre()));
            }
        }
//Parametros indeterminados en string.format
        System.out.println(String.format("Se encontraron %d virus.", numeroDeVirus));
    }

    public void agregar(Viruseable archivo){
        this.archivos.add(archivo);
    }
}
