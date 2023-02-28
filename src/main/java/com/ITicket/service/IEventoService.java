package com.ITicket.service;

import com.ITicket.entity.Evento;
import java.util.List;

/**
 *
 * @author Steven
 */
public interface IEventoService {
    public List<Evento> getAllEvento();
    public Evento getEventoById(long id);
    public int saveEvento(Evento evento);
    public void delete(long id);
}
