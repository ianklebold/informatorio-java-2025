package com.informatorio.info_market.dto.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

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
