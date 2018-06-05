package com.kodilla.hibernate.invoice.dao;


import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product water = new Product("Natural Water");
        Product meat = new Product("Beef Meat");
        Product cucumber = new Product("Cucumber");

        Item item1 = new Item(water, new BigDecimal(5), 1, new BigDecimal(5));
        Item item2 = new Item(meat, new BigDecimal(25), 2, new BigDecimal(50));
        Item item3 = new Item(cucumber, new BigDecimal(5), 4, new BigDecimal(20));

        Invoice invoice = new Invoice("1/2018");

        water.getItems().add(item1);
        meat.getItems().add(item2);
        cucumber.getItems().add(item3);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        Assert.assertNotEquals(0, invoiceId);

        //CleanUp
        invoiceDao.delete(invoiceId);
    }
}
