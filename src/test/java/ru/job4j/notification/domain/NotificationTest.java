package ru.job4j.notification.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NotificationTest {

    @Test
    void whenEqual() {
        Notification not1 = new Notification(1, "test");
        Notification not2 = new Notification(1, "test");
        assertThat(not1.equals(not2)).isTrue();
    }

    @Test
    void whenNotEqual() {
        Notification not1 = new Notification(1, "test");
        Notification not2 = new Notification(1, "test2");
        assertThat(not1.equals(not2)).isFalse();

    }
}