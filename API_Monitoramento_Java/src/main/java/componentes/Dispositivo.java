package componentes;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.dispositivos.DispositivoUsb;
import com.github.britooo.looca.api.group.dispositivos.DispositivosUsbGrupo;

import java.util.List;

public class Dispositivo {

    Looca looca = new Looca();
    public void cadastrarDispositivos(){
        List <DispositivoUsb> listaDispositivo  = looca.getDispositivosUsbGrupo().getDispositivosUsb();

        DispositivoUsb dispositivoUsb;

        for (int i = 0; i < listaDispositivo.size(); i++) {
            dispositivoUsb = listaDispositivo.get(i);
            System.out.println( dispositivoUsb);
        }


    }
    DispositivosUsbGrupo dispositivosUsbGrupo = looca.getDispositivosUsbGrupo();


}
