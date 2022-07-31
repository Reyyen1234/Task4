package com.reyyencuneyt.task4.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

//lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder


//Entity
@Entity
@Table(name="kullanci") //databasete kayidilmesini istedigim table adi, table icinde yazilir
@NamedQueries({
        @NamedQuery(name = "User.findAll",
                query = "SELECT user FROM UserEntity user"),
        @NamedQuery(name = "User.findById",
                query = "SELECT user FROM UserEntity user WHERE user.id = :userId"),
        @NamedQuery(name = "User.findByName",
                query = "SELECT user FROM UserEntity user WHERE user.id = :userName"),

})
public class UserEntity {
    @Id
    //id database de normalizasiyon yapilari olarak dedigimiz yerlerde bir iliskisel tabloda mutlaka bir idin olmasini der
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",updatable = false)// guvenlik icin updatable kullandik yoksa idi girip gunceller sisteme bozar
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
}
