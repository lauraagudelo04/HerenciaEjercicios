package AgenciaArrendamiento.dominio;

import AgenciaArrendamiento.dominio.excepcion.InmuebleArrendadoException;
import AgenciaArrendamiento.dominio.excepcion.InmuebleNoArrendableException;
import AgenciaArrendamiento.dominio.excepcion.InmuebleNoArrendadoException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Agencia {
    private String nombre;
    private List<Inmueble> inmuebles;

    public Agencia(String nombre) {
        this.nombre = nombre;
        this.inmuebles = new ArrayList<>();
    }

    public void agregarInmueble(Inmueble inmueble) {
        this.inmuebles.add(inmueble);

    }

    public boolean arrendarInmueble(String codigoArrendar) {
        Inmueble inmueble=this.buscarPorCodigo(codigoArrendar);
        if (!inmueble.arrendado && inmueble instanceof Arrendable) {
            ((Arrendable) inmueble).arrendar();
            return true;
        } else {
            if (inmueble instanceof Arrendable) {
                throw new InmuebleArrendadoException();
            }
            throw new InmuebleNoArrendableException();

        }
    }

    public boolean devolverInmueble(Inmueble inmueble) {
        if (inmueble.arrendado && inmueble instanceof Arrendable) {
            ((Arrendable) inmueble).devolver();
            return true;
        } else {
            if (inmueble instanceof Arrendable) {
                throw new InmuebleNoArrendadoException();
            }
            throw new InmuebleNoArrendableException();
        }
    }

    public boolean venderInmueble(String codigoInmuebleVender){
        Inmueble inmueble= (Inmueble) this.inmuebles;
        if (!inmueble.arrendado){
            this.inmuebles.remove(inmueble);
            return true;
        }else {
            if (inmueble instanceof Arrendable){
                throw new InmuebleArrendadoException();

            }
        }
        return false;
    }

    public List<Inmueble> getArrendablesDisponibles(){
        return this.inmuebles.stream().filter
                (inmueble -> !inmueble.arrendado && inmueble instanceof Arrendable)
                .collect(Collectors.toList());
    }

    public List<Inmueble> getArrendados(){
        List<Inmueble> arrendados= new ArrayList<>();

        for (Inmueble inmueble : this.inmuebles){
            if (inmueble.arrendado){
                arrendados.add(inmueble);
            }
        }
        return arrendados;
    }

    public  Inmueble buscarPorCodigo(String codigoBuscar){
        return this.inmuebles.stream().filter(inmueble ->inmueble
                .getCodigo().equalsIgnoreCase(codigoBuscar))
                .findFirst().orElseThrow(()-> new InmuebleNoArrendadoException());
    }
}