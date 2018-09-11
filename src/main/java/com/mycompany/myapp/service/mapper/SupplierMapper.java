package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.*;
import com.mycompany.myapp.service.dto.SupplierDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Supplier and its DTO SupplierDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface SupplierMapper extends EntityMapper<SupplierDTO, Supplier> {



    default Supplier fromId(Long id) {
        if (id == null) {
            return null;
        }
        Supplier supplier = new Supplier();
        supplier.setId(id);
        return supplier;
    }
}
