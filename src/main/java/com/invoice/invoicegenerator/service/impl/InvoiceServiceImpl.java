package com.invoice.invoicegenerator.service.impl;

import com.invoice.invoicegenerator.entity.Invoice;
import com.invoice.invoicegenerator.repository.InvoiceRepository;
import com.invoice.invoicegenerator.service.InvoiceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private InvoiceRepository repo;

    @Override
    public Invoice saveInvoice(Invoice invoice) {
        return repo.save(invoice);
    }

    @Override
    public List<Invoice> getAllInvoices() {
        return repo.findAll();
    }
}