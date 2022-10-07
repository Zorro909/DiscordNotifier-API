package de.zorro909.discordnotifier.api;

import io.micronaut.core.annotation.Introspected;

import java.io.Serializable;

/**
 * A DTO for the DiscordNotification entity
 */
@Introspected
public record DiscordNotificationDto(Long id, String source, String json, String message,
                                     boolean sent) implements Serializable {
}