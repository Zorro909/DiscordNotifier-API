package de.zorro909.discordnotifier.api;

import io.micronaut.core.annotation.Introspected;

@Introspected
public record SubmitNotificationDto(String message) {
}
