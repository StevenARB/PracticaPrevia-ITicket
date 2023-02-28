package com.ITicket.repository;

import com.ITicket.entity.Evento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Steven
 */

@Repository
public interface EventoRepository extends CrudRepository<Evento, Long> {}
