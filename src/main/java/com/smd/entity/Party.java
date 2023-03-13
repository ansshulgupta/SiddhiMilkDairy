package com.smd.entity;

import java.sql.Timestamp;

import org.hibernate.annotations.DynamicInsert;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ChangeImpact")
@DynamicInsert
public class Party {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ChangeImpactID")
	private Long changeImpactID;

	@Column(name = "Title")
	private String title;

	@Column(name = "StartDate")
	private Timestamp startDate;
	
	@Column(name = "ActionNeeded")
	private boolean actionNeeded;
	
	// bi-directional many-to-one association to DraftStatus
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "DraftId") private DraftStatus draftStatus;
	 */

}
