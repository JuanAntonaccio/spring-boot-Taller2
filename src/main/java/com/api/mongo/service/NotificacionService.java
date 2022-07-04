package com.api.mongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.mongo.models.Notificacion;
import com.api.mongo.repository.NotificacionRepository;

@Service
public class NotificacionService {
	
	@Autowired
	private NotificacionRepository notificacionRepository;
	
	public List<Notificacion> findAll(){
		return notificacionRepository.findAll();
	}
	
	public Notificacion findById(String id) {
		Notificacion noti = null;
		Optional<Notificacion> result = notificacionRepository.findById(id);
		if(result.isPresent()){
			noti= result.get();
		}
		return noti;
		
	}
	
	public Notificacion add(Notificacion noti) {
		String mensaje = noti.getMensaje();
		if (mensaje != null) {
			noti.setMensaje(mensaje.toUpperCase());
		}
		
		return notificacionRepository.save(noti);
		
	}
	
	public Notificacion update(Notificacion noti) {
		String mensaje = noti.getMensaje();
		if (mensaje != null) {
			noti.setMensaje(mensaje.toUpperCase());
		}
		
		return notificacionRepository.save(noti);
	}
	
	public void deleteById(String id) {
		notificacionRepository.deleteById(id);
	}

}
