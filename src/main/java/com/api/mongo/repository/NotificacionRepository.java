package com.api.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.api.mongo.models.Notificacion;



@Repository
public interface NotificacionRepository extends MongoRepository<Notificacion, String> {

}
