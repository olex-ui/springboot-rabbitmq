package com.example.springbootrabbitmq.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class book {
    private String bookname;
    private String author;
}
