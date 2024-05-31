package com.example.esercizioSwagger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@Api(tags = "Name Controller")
@RestController
@RequestMapping("/name")
public class NameController {

    @ApiOperation(value = "Get name", notes = "Restituisce il nome fornito come parametro")
    @GetMapping
    public String getName(@ApiParam(value = "Nome da restituire", required = true) @RequestParam String name) {
        return name;
    }

    @ApiOperation(value = "Get reversed name", notes = "Restituisce il nome fornito come parametro, ma al contrario")
    @PostMapping("/reverse")
    public String reverseName(@ApiParam(value = "Nome da restituire al contrario", required = true) @RequestParam String name) {
        return new StringBuilder(name).reverse().toString();
    }

}