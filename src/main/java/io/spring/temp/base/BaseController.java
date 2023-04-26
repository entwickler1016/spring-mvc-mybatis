package io.spring.temp.base;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface BaseController<T>{

    @GetMapping
    @Operation(summary = "Get Rows", description = "Returns All Rows")
    @ApiResponses({
        @ApiResponse(responseCode = "200"),
        @ApiResponse(responseCode = "204"),
        @ApiResponse(responseCode = "500")
    })
    ResponseEntity<Result> findAll();

    @GetMapping("{id}")
    @Operation(summary = "Get Row", description = "Returns Row")
    @ApiResponses({
        @ApiResponse(responseCode = "200"),
        @ApiResponse(responseCode = "204"),
        @ApiResponse(responseCode = "500")
    })
    ResponseEntity<Result> findById(@Parameter(name = "ID", description = "ID of Row", in = ParameterIn.PATH) @PathVariable Long id);

    @PostMapping
    @Operation(summary = "Insert Row", description = "Insert Row")
    @ApiResponses({
        @ApiResponse(responseCode = "200"),
        @ApiResponse(responseCode = "204"),
        @ApiResponse(responseCode = "500")
    })
    ResponseEntity<Result> insert(@Parameter(name = "DTO", description = "DTO", in = ParameterIn.DEFAULT) @RequestBody T t);

    @PutMapping("{id}")
    @Operation(summary = "Update Row", description = "Update Row")
    @ApiResponses({
        @ApiResponse(responseCode = "200"),
        @ApiResponse(responseCode = "204"),
        @ApiResponse(responseCode = "500")
    })
    ResponseEntity<Result> update(@Parameter(name = "ID", description = "ID of Row", in = ParameterIn.PATH) @PathVariable Long id, @Parameter(name = "DTO", description = "DTO", in = ParameterIn.DEFAULT) @RequestBody T t);

    @DeleteMapping("{id}")
    @Operation(summary = "Delete Row", description = "Delete Row")
    @ApiResponses({
        @ApiResponse(responseCode = "200"),
        @ApiResponse(responseCode = "204"),
        @ApiResponse(responseCode = "500")
    })
    ResponseEntity<Result> deleteById(@Parameter(name = "ID", description = "ID of Row", in = ParameterIn.PATH) @PathVariable Long id);
}