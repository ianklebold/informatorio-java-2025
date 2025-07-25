package com.informatorio.info_market.dto.error;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Schema(
        name = "Error Response DTO",
        description = "DTO para alojar la informacion de un error en la request"
)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponseDto {
    private String apiPath;
    private HttpStatus status;
    private String errorMessage;
    private LocalDateTime errorTime;

    public ErrorResponseDto(Exception e, String description, HttpStatus status){

        this.setApiPath( description );
        this.setStatus(status);
        this.setErrorMessage(e.getMessage());
        this.setErrorTime(LocalDateTime.now());

    }

}
