package com.lyit.multicloud.InventoryService.data.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Indexed;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import java.util.UUID;

@Data
@Table
@AllArgsConstructor
@ToString
public class InventoryModel {

    @PrimaryKey
    @CassandraType(type = CassandraType.Name.UUID)
    private UUID id;
    @Indexed
    private String category;

    @Indexed
    private String inventoryName;

    private String inventoryCount;

    private String priceModel;

    public InventoryModel() {
        this.id = UUID.randomUUID();
    }
}