package com.invoice.invoicegenerator.repository;

import com.invoice.invoicegenerator.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}