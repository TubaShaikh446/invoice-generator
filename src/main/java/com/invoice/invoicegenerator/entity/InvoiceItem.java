package com.invoice.invoicegenerator.entity;

import jakarta.persistence.*;

@Entity
public class InvoiceItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemName;
    private String hsn;
    private int qty;
    private double rate;
    private double tax;

    private double total;

    // getters & setters
}