package com.example.alonemaster.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequiredArgsConstructor
@RequestMapping("test")
@Slf4j
@Tag( name = "test", description = "test API Document")
public class testController {
    @GetMapping
    @Operation(summary = "subway json", description = "지하철 정보 출력")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "조회 성공" ),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error.class)))
    })
    public ResponseEntity<?> getSubway() {
        String dto = "test";
        return ResponseEntity.ok(dto);
    }
}
