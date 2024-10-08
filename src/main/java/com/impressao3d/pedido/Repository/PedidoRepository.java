package com.impressao3d.pedido.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.impressao3d.pedido.Model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository <Pedido, Long>{

}
