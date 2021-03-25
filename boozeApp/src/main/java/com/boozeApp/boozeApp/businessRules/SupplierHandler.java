package com.boozeApp.boozeApp.businessRules;

import com.boozeApp.boozeApp.model.dto.ProductDTO;
import com.boozeApp.boozeApp.model.dto.SupplierDTO;
import com.boozeApp.boozeApp.repository.ProductRepository;
import com.boozeApp.boozeApp.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SupplierHandler {

//    @Autowired
//    private ProductRepository productRepository;
//
//    @Autowired
//    private SupplierRepository supplierRepository;
//
//    public SupplierDTO handleSupplier(SupplierDTO supplier){
//
//        List<ProductDTO> productDTOList = supplier.getProduct();
//
//        supplierRepository.save(supplier);
//
//        productDTOList.forEach(item ->{
//            ProductDTO productDTO = new ProductDTO();
//            productDTO.setSupplier(supplier.);
//            productRepository.save(productDTO);
//        });
//
//        //fixme se seta o supplier primeiro o id aparece commo um novo produto
//        //fixme se seta o supplier depois, o supllier é transiente
//        //todo como faz? maneira antiga?
//
//        return supplier;
//
//    }
}
