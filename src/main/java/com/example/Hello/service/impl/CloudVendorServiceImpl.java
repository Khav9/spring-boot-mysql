package com.example.Hello.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Hello.model.CoudVendor;
import com.example.Hello.repository.CloudVendorRepository;
import com.example.Hello.service.CloudVendorService;


@Service
public class CloudVendorServiceImpl implements CloudVendorService {

	CloudVendorRepository cloudVendorRepository;
	
	public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public String createCloudVendor(CoudVendor cloudVendor) {
		// TODO Auto-generated method stub
		cloudVendorRepository.save(cloudVendor);
		return "Success";
	}

	@Override
	public String updateCloudVendor(CoudVendor cloudVendor) {
		// TODO Auto-generated method stub
		cloudVendorRepository.save(cloudVendor);
		return "Success";
	}

	@Override
	public String deleteCloudVendor(String cloudVendorId) {
		// TODO Auto-generated method stub
		cloudVendorRepository.deleteById(cloudVendorId);
		return "Success";
	}

	@Override
	public CoudVendor getCloudVendor(String cloudVendorId) {
		// TODO Auto-generated method stub
		return cloudVendorRepository.findById(cloudVendorId).get();
	}

	@Override
	public List<CoudVendor> getAllCloudVendors() {
		// TODO Auto-generated method stub
		return cloudVendorRepository.findAll();
	}

}
