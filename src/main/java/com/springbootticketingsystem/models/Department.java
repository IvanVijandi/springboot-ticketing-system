package com.springbootticketingsystem.models;
import jakarta.persistence.*;
import com.springbootticketingsystem.models.*;
import java.util.List;

@Entity
public class Department {

    @Id
    private Long Id;
    private String name;
    //Atributos de ticket
    @OneToMany(mappedBy = "department")
    private List<Ticket> tickets;

    public Department(){};
    public Department(Long id,String name){
        this.Id=id;
        this.name=name;
    }


}
