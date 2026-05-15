package com.invoice.invoicegenerator.controller;

import com.invoice.invoicegenerator.entity.Invoice;
import com.invoice.invoicegenerator.service.InvoiceService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class InvoiceController {

    @Autowired
    private InvoiceService service;

    @GetMapping("/")
    public String home() {
        return "invoice";
    }

    @PostMapping("/save")
    @ResponseBody
    public String save(@RequestBody Invoice invoice) {
        service.saveInvoice(invoice);
        return "Saved Successfully";
    }
    @GetMapping("/all")
    public List<Invoice> getAll() {
        return service.getAllInvoices();
    }
}