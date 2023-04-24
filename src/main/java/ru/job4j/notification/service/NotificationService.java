package ru.job4j.notification.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.job4j.notification.domain.Notification;
import ru.job4j.notification.repository.NotificationRepository;

@Service
@Slf4j
@AllArgsConstructor
public class NotificationService {
    private final NotificationRepository notifications;

    @KafkaListener(topics = "job4j_messengers")
    public void receiveOrder(String description) {
        Notification notification = new Notification();
        notification.setDescription(description);
        notifications.save(notification);
        log.debug(description);
}

}