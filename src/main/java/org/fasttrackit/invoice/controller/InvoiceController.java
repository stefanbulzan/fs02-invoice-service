package org.fasttrackit.invoice.controller;

import org.fasttrackit.invoice.model.Invoice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("invoices")
public class InvoiceController {
    @GetMapping
    List<Invoice> getAll() {
        return List.of(
                new Invoice("laptop", 2500, "Maria", "Emag", true),
                new Invoice("Frigider", 3000, "Ioan", "Altex", false),
                new Invoice("Cartofi", 10, "Mihai", "Carrefour", false),
                new Invoice("monitor", 1800, "Darius", "Emag", true)
        );
    }
}
