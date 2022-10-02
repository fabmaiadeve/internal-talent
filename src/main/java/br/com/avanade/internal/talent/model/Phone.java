package br.com.avanade.internal.talent.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "tb_phone")
public class Phone implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPhone;

    @Column(name = "number", nullable = false)
    private String number;

    @Column(name = "typePhone", nullable = false)
    private String typePhone;

    @Column(name = "registrationCall", nullable = false)
    private LocalDateTime registrationCall;

    @ManyToOne
    private Person person;

}
