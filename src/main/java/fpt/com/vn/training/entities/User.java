package fpt.com.vn.training.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import fpt.com.vn.training.enums.ActiveEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Setter
@Getter
public class User {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "username", nullable = false, updatable = false)
    private String username;


    @Column(name = "password", nullable = false, updatable = false)
    private String password;

    @Column(name = "role")
    private String role;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "userRefer")
    @JsonBackReference
    private Employee employeeRefer;

    @Column(name = "active", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private ActiveEnum active;
}
