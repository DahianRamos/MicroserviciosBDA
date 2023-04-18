package co.edu.uniquindio.biblioteca.model;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "", url = "http://CLIENTE-SERVICE/api/cliente/")

public interface OpenFeignCliente {

    @GetMapping("/users/{id}")
    User getUserById(@PathVariable("id") int id);


}
