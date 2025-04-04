package com.ProyectoConcJPASpring.ProyectoC.repository;

import com.ProyectoConcJPASpring.ProyectoC.model.Comprobante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComprobanteRepository extends JpaRepository<Comprobante, Long> {

}

