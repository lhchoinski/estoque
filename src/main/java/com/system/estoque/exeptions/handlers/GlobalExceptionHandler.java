//package com.system.estoque.exeptions.handlers;
//
//
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//
//@ControllerAdvice
//public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
//
//
//    @ExceptionHandler(BadRequestException.class)
//    public ResponseEntity<Map<String, String>> handleBadRequestException(BadRequestException ex) {
//        Map<String, String> response = new HashMap<>();
//        response.put("message", ex.getMessage());
//
//        return new ResponseEntity<>(response, HttpStatus.UNPROCESSABLE_ENTITY);
//    }
//
//}
