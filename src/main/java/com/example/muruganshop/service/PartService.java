package com.example.muruganshop.service;

	import com.example.muruganshop.entity.Part;
	import com.example.muruganshop.repository.PartRepository;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import java.util.List;

	@Service
	public class PartService{

	    @Autowired
	    private PartRepository repository;

	    public Part savePart(Part part) {
	        return repository.save(part);
	    }

	    public List<Part> getAllParts() {
	        return repository.findAll();
	    }
}
