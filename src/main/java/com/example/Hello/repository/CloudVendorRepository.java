package com.example.Hello.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Hello.model.CoudVendor;

public interface CloudVendorRepository extends JpaRepository<CoudVendor, String> {

}
