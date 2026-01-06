package com.cpd.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.*;
import org.hibernate.mapping.List;

import java.math.BigDecimal;

@Entity
@Table(name = "room")
public class Room {
    @Id
    @Column(name = "room_id",length = 80,nullable = false)
    private String roomId;

    @Column(name = "room_number",length = 80,nullable = false)
    private String roomNumber;

    @Column(name = "room_type",length = 80,nullable = false)
    private String roomType;

    @Column(name = "bed_count",length = 80,nullable = false)
    private int bedCount;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "is_available")
    private boolean isAvailable;

    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;

    @OneToMany(mappedBy = "room")
    private java.util.List<Facility> facilities;

    @OneToMany(mappedBy = "room")
    private java.util.List<RoomImage> roomImages;
}
