package com.api.mongo.models;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;


// anotaciones de lombok


@Document(collection="notificaciones")
@Data
@NoArgsConstructor
public class Notificacion {
	
	@Id
	private String id;
	
	private String mensaje;
	
	private String detalle;
	
	private String estado;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@CreatedDate
	private LocalDateTime fechaCreacion;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@CreatedDate
	private LocalDateTime fechaModificacion;
	

}
