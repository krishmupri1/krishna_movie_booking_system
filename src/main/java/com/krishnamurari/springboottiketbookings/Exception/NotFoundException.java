package com.krishnamurari.springboottiketbookings.Exception;
import lombok.*;
@Data
@EqualsAndHashCode(callSuper = true)
public class NotFoundException extends  RuntimeException {
    private int code;
    public NotFoundException(String message,int statusCode) {
        super(message);
        this.code=statusCode;

    }
}
