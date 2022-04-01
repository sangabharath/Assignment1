package com.project1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="mobile")
public class Mobile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mobileId;
    private String mobileNumber;
    private String countryCd;
    private String type;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;
   // private Integer contactId;


}
