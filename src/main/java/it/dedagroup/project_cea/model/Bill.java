package it.dedagroup.project_cea.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private double cost;
	@Column(nullable = false)
	private LocalDate paymentDay;
	@Column(nullable = false)
	private LocalDate DeliveringDay;
	@Column(nullable = false)
	private boolean isAvailable = true;
	@ManyToOne(fetch = FetchType.LAZY)
	private Scan scan;
}
