package com.example.repository;

import com.example.model.Purchase;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class PurchaseRepository {
    private final JdbcTemplate jdbc;

    public PurchaseRepository(JdbcTemplate jdbc){
        this.jdbc = jdbc;
    }

    public void storePurchase(Purchase purchase){
        String sql = "INSERT INTO purchase VALUES(?, ?, ?)";

        jdbc.update(sql,
                UUID.randomUUID().toString(),
                purchase.getProduct(),
                purchase.getPrice()
        );
    }

    public List<Purchase> findAllPurchases(){
        String sql = "SELECT * FROM purchase";

        RowMapper<Purchase> purchaseRowMapper = (r,i) ->{
            Purchase rowObject = new Purchase();
            rowObject.setId(r.getString("id"));
            rowObject.setProduct(r.getString("product"));
            rowObject.setPrice(r.getBigDecimal("price"));
            return rowObject;
        };

        return jdbc.query(sql, purchaseRowMapper);
    }
}
