package org.fasttrackit.invoice.model;

public record Invoice(String description,
                      double amount,
                      String sender,
                      String receiver,
                      boolean payed) {
}
