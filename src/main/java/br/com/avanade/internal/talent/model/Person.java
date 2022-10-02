package br.com.avanade.internal.talent.model;



import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "tb_person")
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPerson;

    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "age", length = 3)
    private Integer age;

    @Column(name = "isAlive")
    private Boolean isAlive;

    @Transient
    private List<Phone> phoneList;
}
