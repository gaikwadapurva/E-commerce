/**
 * 
 */
package com.example.demo.model;

import javax.persistence.*;

/**
 * @author apurva.gaikwad
 *
 */

@Entity
public class BaseEntity {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	Long id;
	
	public Long getId() {
		return id;
	}
	
}
