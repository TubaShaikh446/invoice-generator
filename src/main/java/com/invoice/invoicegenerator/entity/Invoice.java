package com.invoice.invoicegenerator.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String invoiceNo;
    private String clientName;
    private String date;
    private double grandTotal;

    @OneToMany(cascade = CascadeType.ALL)
    private List<InvoiceItem> items;

    // getters & setters
}