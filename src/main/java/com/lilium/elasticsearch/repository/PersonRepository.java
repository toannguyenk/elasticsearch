package com.lilium.elasticsearch.repository;

import com.lilium.elasticsearch.document.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends ElasticsearchRepository<Product, String> {
}
