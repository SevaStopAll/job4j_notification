package ru.job4j.notification.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.job4j.notification.domain.Notification;

import java.util.Collection;

@Repository
public interface NotificationRepository extends CrudRepository<Notification, Integer> {
    Collection<Notification> findAll();
}
