package com.invoice.invoicegenerator.service;

import com.invoice.invoicegenerator.entity.Invoice;
import java.util.List;

public interface InvoiceService {

    Invoice saveInvoice(Invoice invoice);

    List<Invoice> getAllInvoices();
}