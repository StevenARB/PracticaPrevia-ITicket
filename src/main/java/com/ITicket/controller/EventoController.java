package com.ITicket.controller;

import com.ITicket.entity.Evento;
import com.ITicket.service.IEventoService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Steven
 */

@Controller
public class EventoController {
    
    @Autowired
    private IEventoService eventoService;
    
    @GetMapping("/eventos")
    public String index(Model model) {
        List<Evento> listaEvento = eventoService.getAllEvento();
        model.addAttribute("eventos", listaEvento);
        return "eventos";
    }
    
    @GetMapping("/new")
    public String agregarEvento(Model model) {
        model.addAttribute("evento", new Evento());
        return "form";
    }
    
    @PostMapping("/save")
    public String saveEvento(@Valid Evento e, Model model) {
        eventoService.saveEvento(e);
        return "redirect:/eventos";
    }
    
    @GetMapping("/delete/{id}")
    public String delete(Model model, @PathVariable long id) {
        eventoService.delete(id);
        return "redirect:/eventos";
    }
}
