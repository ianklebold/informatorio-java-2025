package com.informatorio.info_market.exception.badrequest;

public class StockInsuficienteException extends RuntimeException{
    public StockInsuficienteException() {
        super();
    }

    public StockInsuficienteException(String message) {
        super(message);
    }

    public StockInsuficienteException(String message, Throwable cause) {
        super(message, cause);
    }

    public StockInsuficienteException(Throwable cause) {
        super(cause);
    }

    protected StockInsuficienteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
