package ru.sfu;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class WashingDao {
    JdbcTemplate jdbcTemplate;
    @Autowired
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void insert(Washing washing){
        jdbcTemplate.update("INSERT INTO washing " +
                "(id, weight, clothingCapacity, manufacturingCompany, model, ProducingCountry) " +
                "VALUES (?, ?, ?, ?, ?, ?)",
                washing.getId(),
                washing.getWeight(),
                washing.getClothingCapacity(),
                washing.getManufacturingCompany(),
                washing.getModel(),
                washing.getProducingCountry()
        );
    }
    public List<Washing> findAll(){
        List<Washing> washings = jdbcTemplate.query("SELECT * FROM washing", new
                BeanPropertyRowMapper<Washing>(Washing.class));
        return washings;
    }

    public void edit(int id, Washing washing) {
        jdbcTemplate.update("UPDATE washing " +
                    "SET id=?, weight=?, clothingCapacity=?, manufacturingCompany=?, model=?, ProducingCountry=?" +
                    "WHERE id=?",
            washing.getId(),
            washing.getWeight(),
            washing.getClothingCapacity(),
            washing.getManufacturingCompany(),
            washing.getModel(),
            washing.getProducingCountry(),
            id
        );
    }

    public void delete(int id) {
        jdbcTemplate.update(
                "DELETE from washing WHERE id=?",
                id
        );
    }

    // Поиск по полю: weight.
    public List<Washing> search(int weight){
        List<Washing> washing = jdbcTemplate.query("SELECT * FROM washing WHERE weight<?",
                new Object[]{weight},
                new BeanPropertyRowMapper<>(Washing.class));
        return washing;
    }
}
