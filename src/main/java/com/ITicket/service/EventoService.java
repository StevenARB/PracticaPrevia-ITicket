package com.ITicket.service;

import com.ITicket.entity.Evento;
import com.ITicket.repository.EventoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Steven
 */

@Service
public class EventoService implements IEventoService {
    
    @Autowired
    private EventoRepository eventoRepository;

    @Override
    public List<Evento> getAllEvento() {
        return (List<Evento>)eventoRepository.findAll();
    }

    @Override
    public Evento getEventoById(long id) {
        return eventoRepository.findById(id).orElse(null); 
    }

    @Override
    public int saveEvento(Evento evento) {
        int res = 0;
        Evento e = eventoRepository.save(evento);
        if(e != null) {
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(long id) {
        eventoRepository.deleteById(id); 
    }
    
}
