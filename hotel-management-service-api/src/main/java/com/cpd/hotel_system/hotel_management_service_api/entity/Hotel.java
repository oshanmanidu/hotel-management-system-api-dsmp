package com.cpd.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.sql.Blob;
import java.util.List;

@Entity
@Table(name = "hotel")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Hotel {
    @Id
    @Column(name = "hotel_id", length = 80)
    private String hotelIDd;

    @Column(name = "hotel_name", nullable = false, length = 100)
    private String hotelName;

    @Column(name = "star_rating", nullable = false)
    private String starRating;

    @Column(nullable = false)
    private Blob descripton;

    @Column(name = "created_at", nullable = false)
    private String createdAt;

    @Column(name = "updated_at", nullable = false)
    private String updatedAt;

    @Column(name = "active_status")
    private boolean activeStatus;

    @Column(name = "starting_from")
    private BigDecimal startingFrom;

    @OneToMany(mappedBy = "hotel",cascade = CascadeType.ALL)
    private List<Branch> branches;

}
