package com.impressao3d.pedido.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.impressao3d.pedido.Repository.PedidoRepository;
import com.impressao3d.pedido.Service.PedidoService;
import com.impressao3d.pedido.Model.Pedido;

import ch.qos.logback.core.model.Model;

@Controller
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private PedidoService pessoaService;

    @GetMapping("/pedido")
    public String index(Model model, @RequestParam("display") Optional<String> display){
        String finalDisplay = display.orElse("true");

        List<Pedido> pedidos = pedidoRepository.findByAtivo(Boolean.valueOf(finalDisplay));

        model.addAttribute("pedidos", pedidos);

        return "pedido/listar";
    }
}
