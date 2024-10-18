package com.ghostappi.backend.controller;


import com.ghostappi.backend.model.SaleProduct;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ghostappi.backend.service.SaleProductService;
import com.ghostappi.backend.model.SaleProduct;

import java.util.List;

@RestController
@RequestMapping("saleProducts")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@Tag(name = "SaleProduct", description = "APIs for managing sale products")

public class SaleProductController {

    @Autowired
    private SaleProductService service;

    @Operation(summary = "List all sale products")
    @ApiResponse(responseCode = "200", description = "Found all sale products" ,
        content = {@Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = SaleProduct.class)))})
    @GetMapping
    public List<SaleProduct> getAll(){
        return service.getAll();
    }
}
