package mx.uv.t4is.Agenda;

//import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.t4is_uv_mx.agenda.BorrarRecordatorioRequest;
import https.t4is_uv_mx.agenda.BorrarRecordatorioResponse;
import https.t4is_uv_mx.agenda.BuscarRecordatorioResponse;
import https.t4is_uv_mx.agenda.CrearRecordatorioRequest;
import https.t4is_uv_mx.agenda.CrearRecordatorioResponse;
import https.t4is_uv_mx.agenda.ModificarRecordatorioRequest;
import https.t4is_uv_mx.agenda.ModificarRecordatorioResponse;



//import https.t4is_uv_mx.saludos.BuscarSaludosResponse.Saludos;



@Endpoint
public class AgendaEndPoint{
   
    //private int value=1;
    //ArrayList<Saludos> lista = new ArrayList<>();
    @Autowired
    IAgendadores ia;

    @PayloadRoot(localPart = "CrearRecordatorioRequest", namespace = "https://t4is.uv.mx/agenda")
    @ResponsePayload
    public CrearRecordatorioResponse CrearRecordatorio(@RequestPayload CrearRecordatorioRequest peticion) {
        CrearRecordatorioResponse respuesta = new CrearRecordatorioResponse();
        //se agrega a la lista
        Agendadores e = new Agendadores();
        respuesta.setRespuesta("Hora de inicio: "+peticion.getHoraInicio()+ "id :"+peticion.getId()+ " Descripción : "+peticion.getDescripcion()+ " Fecha : "+ peticion.getFecha());
        e.setDescripcion(peticion.getDescripcion());
        //e.setId(value++);
        ia.save(e);
        //lista.add(e);
        return respuesta;
    }

   
    @PayloadRoot(localPart = "BuscarRecodatorioRequest", namespace = "https://t4is.uv.mx/agenda")
    @ResponsePayload
    public BuscarRecordatorioResponse BuscarRecodatorio(){
        BuscarRecordatorioResponse respuesta = new BuscarRecordatorioResponse();
       Iterable<Agendadores> lista = ia.findAll();
        //recorrer la lista
        //Iterable<>
        for (Agendadores o : lista) {
            //System.out.println(rLista);
            BuscarRecordatorioResponse.Agenda e = new BuscarRecordatorioResponse.Agenda();
            e.setDescripcion(o.getDescripcion());
            e.setId(o.getId());
            respuesta.getAgenda().add(e);
           
            //e.setNombre(rLista);
           // respuesta.getSaludos().add(rLista);    
        }
        return respuesta;
    }

    @PayloadRoot(localPart = "ModificarRecordatorioRequest", namespace = "https://t4is.uv.mx/agenda")
    @ResponsePayload
    public ModificarRecordatorioResponse modificarRecordatorio(@RequestPayload ModificarRecordatorioRequest peticion){
        ModificarRecordatorioResponse respuesta = new ModificarRecordatorioResponse();
        //recorrer la lista
        Agendadores element = new Agendadores();
        element.setId(peticion.getId());
        element.setDescripcion(peticion.getDescripcion());
        ia.save(element);
        //lista.set(peticion.getId()-1,element);
        respuesta.setRespuesta(true);
        
        return respuesta;
    }

    @PayloadRoot(localPart = "BorrarRecordatorioRequest", namespace = "https://t4is.uv.mx/agenda")
    @ResponsePayload
    public BorrarRecordatorioResponse BorrarRecordatorio(@RequestPayload BorrarRecordatorioRequest peticion){
        BorrarRecordatorioResponse respuesta = new BorrarRecordatorioResponse();
        //eliminar de la lista
        //lista.remove(peticion.getId()-1);
        //respuesta.setRespuesta(true);

        /*for (Saludos o : lista) {
            if(o.getId()==peticion.getId()){
                lista.remove(o);
                break;
            }
        }*/
        ia.deleteById(peticion.getId());
        respuesta.setRespuesta(true);
        return respuesta;
    }

    
}