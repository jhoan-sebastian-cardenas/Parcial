package com.usta.parcial.Rest;

import com.usta.parcial.dto.NombreEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/nombre")
public class NombreRest {
    @GetMapping("/minombre")
    private String nombre(@Validated @RequestBody NombreEntity nombre) {
        return "Mi nombre es "+ (nombre.getNombre() + nombre.getApellido());
    }

}
