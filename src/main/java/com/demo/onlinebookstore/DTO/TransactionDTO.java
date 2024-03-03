package com.demo.onlinebookstore.DTO;

import java.util.List;

import lombok.Data;

@Data
public class TransactionDTO {
    
    private Integer userId;
    private List<BookCartDTO> books;
}
