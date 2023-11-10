package Veterinaria.dominio;

import Veterinaria.dominio.excepcion.MascotaNoOperableException;
import Veterinaria.dominio.excepcion.MascotaOperadaException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Veterinaria {
    private String nombre;
    private List<Mascota> mascotas = new ArrayList<>();
    public static final int EDAD_MINIMA_MACHO = 12;
    public static final int EDAD_MINIMA_HEMBRA = 18;

    public Veterinaria(String nombre) {
        this.nombre = nombre;
    }

    public Mascota revisarMascota(String nombreRevisar, String sexoRevisar, int edadRevisar) {
        Mascota mascota = null;
        if ((sexoRevisar.equals("M")) && (edadRevisar >= EDAD_MINIMA_MACHO) && !mascota.esterilizado) {
            mascota = new MascotaApta(nombreRevisar, sexoRevisar, edadRevisar);
        } else if ((sexoRevisar.equals("H")) && (edadRevisar >= EDAD_MINIMA_HEMBRA&& !mascota.esterilizado)) {
            mascota = new MascotaApta(nombreRevisar, sexoRevisar, edadRevisar);
        } else {
            mascota = new MascotaNoApta(nombreRevisar, sexoRevisar, edadRevisar);

        }
        this.mascotas.add(mascota);
        return mascota;
    }

    public List<MascotaApta> getPacientesOperar() {
        List<MascotaApta> listaDeAptos = new ArrayList<>();
        List<Mascota> mascotasPacientesFiltrada = this.mascotas.stream()
                .filter(mascota -> mascota instanceof MascotaApta)
                .collect(Collectors.toList());

        for (Mascota mascota: mascotasPacientesFiltrada) {
            if(!mascota.esterilizado){
                listaDeAptos.add(new MascotaApta(mascota.nombreMascota,mascota.sexo, mascota.edad));
            }
        }
        return listaDeAptos;
    }

    public void operarATodos() {
        for (Mascota mascota : getPacientesOperar()) {
            if (mascota instanceof MascotaApta) {
                ((MascotaApta) mascota).operar();
            }
        }
    }
    public Mascota buscarMascotaNombre(String nombreBuscar){
        return this.mascotas.stream().filter(mascota -> mascota.getNombreMascota()
                .equalsIgnoreCase(nombreBuscar)).findFirst().orElse(null);

    }
    public void operarPaciente(String nombrePacienteOperar) {
        Mascota mascotaOperar=this.buscarMascotaNombre(nombrePacienteOperar);
        if(mascotaOperar instanceof MascotaApta){
            ((MascotaApta) mascotaOperar).operar();
        }else{
            if (mascotaOperar instanceof MascotaNoApta){
                throw new MascotaNoOperableException();

            } else if (mascotaOperar.esterilizado){
                throw new MascotaOperadaException();
            }
        }
    }
}
