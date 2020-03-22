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
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private ProductDao productDao;
    @Autowired
    private InvoiceDao invoiceDao;
    private static final String NAME = "Product name: Car";

    @Test
    public void testProductSimple() {
        //Given
        Product product = new Product(NAME);

        //When
        productDao.save(product);

        //Then
        int id = product.getId();
        Optional<Product> readProduct = productDao.findById(id);
        Assert.assertTrue(readProduct.isPresent());

        //CleanUp
        productDao.deleteById(id);
    }

    @Test
    public void testProductDaoSave() {
        //Given
        Item item1 = new Item(new BigDecimal(4), 3, new BigDecimal(12));
        Item item2 = new Item(new BigDecimal(5), 6, new BigDecimal(30));
        Product product = new Product("Sugar");
        product.getItems().add(item1);
        product.getItems().add(item2);
        item1.setProduct(product);
        item2.setProduct(product);

        //When
        productDao.save(product);
        int id = product.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        productDao.deleteById(id);
    }

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Item item1 = new Item(new BigDecimal(4), 3, new BigDecimal(12));
        Item item2 = new Item(new BigDecimal(5), 6, new BigDecimal(30));

        Invoice invoice = new Invoice("FV/2020/03/10/001");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}