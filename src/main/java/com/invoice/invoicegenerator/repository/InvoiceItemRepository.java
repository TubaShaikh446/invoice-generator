package com.invoice.invoicegenerator.repository;

import com.invoice.invoicegenerator.entity.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemRepository extends JpaRepository<InvoiceItem, Long> {
}