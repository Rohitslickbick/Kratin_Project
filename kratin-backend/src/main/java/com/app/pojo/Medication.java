package com.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="medication_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Medication {
	
	@Column
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
	@Column
    private String name;
	@Column
    private String dosage;
	@Column
    private String schedule;
	
	
}
